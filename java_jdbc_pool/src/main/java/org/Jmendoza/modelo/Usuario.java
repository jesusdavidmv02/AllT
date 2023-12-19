package org.Jmendoza.modelo;

public class Usuario {

    private long id ;
    private String name ;
    private  String lasname;
    private  int edad ;

    public Usuario() {

    }

    public Usuario(long id, String name, String lasname, int edad) {
        this.id = id;
        this.name = name;
        this.lasname = lasname;
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasname() {
        return lasname;
    }

    public void setLasname(String lasname) {
        this.lasname = lasname;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return  id +
                " | " + name +
                " | " + lasname +
                " | " + edad ;
    }
}
