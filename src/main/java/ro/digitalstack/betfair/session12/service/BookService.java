package ro.digitalstack.betfair.session12.service;

import jakarta.persistence.EntityManager;
import ro.digitalstack.betfair.session12.entity.Book;

import java.util.UUID;

public class BookService {
    private EntityManager entityManager;
    public BookService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Book create(Book book) {
        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.getTransaction().commit();
        return book;
    }

    public UUID delete(Book book) {
        entityManager.getTransaction().begin();
        entityManager.remove(book);
        entityManager.getTransaction().commit();
        return book.getId();
    }

    public Book findById(UUID id) {
        return entityManager.find(Book.class, id);
    }
}
