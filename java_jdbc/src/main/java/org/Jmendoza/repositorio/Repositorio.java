package org.Jmendoza.repositorio;

import java.util.List;

public interface Repositorio<T>{

    List<T> listar();
    T porid(Long id);
    void inser(T t);
    void delete(Long id);

}
