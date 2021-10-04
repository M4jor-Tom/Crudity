package crudservice;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

@Service
public interface CrudService<T> {
    List<T> listAll();

    T getById(Integer id) throws NoSuchElementException;

    T saveOrUpdate(T abstractDomainClass);

    void delete(Integer id);
}