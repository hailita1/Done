package com.codegym.service;

public interface IGeneralService<E> {
    Iterable<E> findAll();

    void save(E e);

    E findById(Long id);

    void remove(Long id);
}

