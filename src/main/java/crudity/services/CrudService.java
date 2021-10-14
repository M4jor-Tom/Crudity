package crudity.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import jpaentitor.entities.Primed;

@Service
public interface CrudService<T extends Primed> {
    List<T> listAll();

    T getById(Integer id) throws NoSuchElementException;

    T saveOrUpdate(T primed);

    void delete(Integer id);
}