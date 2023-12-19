import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.Jmendoza.main.User;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HttpClientExample {
    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Crear un cliente HTTP
            HttpClient httpClient = HttpClientBuilder.create().build();

            // Crear una solicitud GET
            HttpGet request = new HttpGet("https://randomuser.me/api/");

            // Ejecutar la solicitud y obtener la respuesta
            HttpResponse response = httpClient.execute(request);

            // Leer la respuesta
            BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

            String line;

            StringBuilder result = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                result.append(line);
            }

            // Imprimir la respuesta
            System.out.println(result.toString());

            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            JsonNode jsonNode = objectMapper.readTree(result.toString());


            User[] users = objectMapper.treeToValue(jsonNode.get("results"), User[].class);

            String nombre = jsonNode.get("results").asText();


            for (User user : users) {
                System.out.println("Nombre: " + user.getName().getFirst() + " " + user.getName().getLast());
                System.out.println("Ciudad: " + user.getLocation().getCity());
                System.out.println( "edad + " + user.getName().getTitle() );

                System.out.println("____________________________________");

                System.out.println( "edad + " + user.getLocation().getCity());

                // ... otras propiedades
            }




            JOptionPane.showMessageDialog(null,result.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
