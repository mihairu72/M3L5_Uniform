package org.example.repository;

public interface Repository<T> {
    public T getByData(Long id, String login, String password);
}
