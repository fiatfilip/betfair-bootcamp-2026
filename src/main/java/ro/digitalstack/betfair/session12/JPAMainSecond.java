package ro.digitalstack.betfair.session12;

import jakarta.persistence.EntityManager;
import ro.digitalstack.betfair.session12.entity.Author;
import ro.digitalstack.betfair.session12.entity.Book;
import ro.digitalstack.betfair.session12.service.AuthorService;
import ro.digitalstack.betfair.session12.service.BookService;
import ro.digitalstack.betfair.session12.util.JPAUtils;

import java.util.UUID;

public class JPAMainSecond {
    public static void main(String[] args) {
        EntityManager entityManager = JPAUtils.getEntityManager();
        AuthorService authorService = new AuthorService(entityManager);
        BookService bookService = new BookService(entityManager);


        Book book = bookService.findById(UUID.fromString("a95af75b-340d-4a7d-a2c1-70fc40547141"));
        System.out.println(book);

        Author author = book.getAuthor();
        for(Book book1: author.getBooks()){
            System.out.println(book1);
        }

        entityManager.close();
    }
}
