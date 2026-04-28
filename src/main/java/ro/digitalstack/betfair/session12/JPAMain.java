package ro.digitalstack.betfair.session12;

import jakarta.persistence.EntityManager;
import ro.digitalstack.betfair.session12.entity.Author;
import ro.digitalstack.betfair.session12.entity.Book;
import ro.digitalstack.betfair.session12.service.AuthorService;
import ro.digitalstack.betfair.session12.service.BookService;
import ro.digitalstack.betfair.session12.util.JPAUtils;

import java.util.UUID;

public class JPAMain {
    public static void main(String[] args) throws InterruptedException {
        EntityManager entityManager = JPAUtils.getEntityManager();
        AuthorService authorService = new AuthorService(entityManager);
        BookService bookService = new BookService(entityManager);

        Author author = new Author(UUID.fromString("0a7d158e-e6dd-4aff-9e5b-d5623887191d"), "George Orwell");
        authorService.create(author);
        author = authorService.getAuthorById(
                UUID.fromString("0a7d158e-e6dd-4aff-9e5b-d5623887191d"));
        System.out.println(author);
        // author.setName("NoName");

        Book book = new Book(UUID.randomUUID(), "Animal farm", author);
        book = bookService.create(book);
        System.out.println(book);

        Book secondBook = new Book(UUID.fromString("a95af75b-340d-4a7d-a2c1-70fc40547141"), "Animal farm II", author);
       // secondBook = bookService.create(secondBook);
        System.out.println(secondBook);

        // wait
        // Thread.sleep(10 * 1000);

        // bookService.delete(book);

        entityManager.close();
    }
}
