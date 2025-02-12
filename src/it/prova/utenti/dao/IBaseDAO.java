package it.prova.utenti.dao;

import java.util.List;

public interface IBaseDAO<T> {

    public List<T> getAll() throws Exception;

    public   T   get(Long idInput) throws Exception;

    public int update(T input) throws Exception;

    public int insert(T input) throws Exception;

    public int delete(T input) throws Exception;


}