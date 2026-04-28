package ro.digitalstack.betfair.session12.service;

import jakarta.persistence.EntityManager;
import ro.digitalstack.betfair.session12.entity.Author;

import java.util.UUID;

public class AuthorService {
    private EntityManager entityManager;
    public AuthorService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Author create(Author author) {
        entityManager.getTransaction().begin();
        entityManager.persist(author);
        entityManager.getTransaction().commit();
        return author;
    }

    public Author getAuthorById(UUID uuid) {
        entityManager.getTransaction().begin();
        Author author = entityManager.find(Author.class, uuid);
        entityManager.getTransaction().commit();
        return author;
    }

    public Author updateAuthor(Author author){
        entityManager.getTransaction().begin();
        entityManager.merge(author);
        entityManager.getTransaction().commit();
        return author;
    }
}
