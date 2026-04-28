package ro.digitalstack.betfair.session12;

import jakarta.persistence.EntityManager;
import ro.digitalstack.betfair.session12.entity.Author;
import ro.digitalstack.betfair.session12.entity.Book;
import ro.digitalstack.betfair.session12.service.AuthorService;
import ro.digitalstack.betfair.session12.service.BookService;
import ro.digitalstack.betfair.session12.util.JPAUtils;

import java.util.Scanner;
import java.util.UUID;

public class CLICrud {
    public static void main(String[] args) {
        String menu = """
                A - Add author
                B - Add book
                ....
                X - eXit
                """;
        String command="";
        do{
            System.out.println(menu);
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            processCommand(command, scanner);
        }
        while(!command.equalsIgnoreCase("X"));
    }

    public static void processCommand(String command, Scanner scanner){
        EntityManager entityManager = JPAUtils.getEntityManager();
        AuthorService authorService = new AuthorService(entityManager);
        BookService bookService = new BookService(entityManager);
        switch (command){
            case "A":
                System.out.println("Author name?");
                String authorName = scanner.nextLine();
                Author createdAuthor = authorService.create(new Author(UUID.randomUUID(), authorName));
                System.out.println(createdAuthor);
            case "B":
                System.out.println("Book name?");
                String bookName = scanner.nextLine();
                System.out.println("Author ID?");
                String authorId = scanner.nextLine();
                Book createdBook = bookService.create(new Book(UUID.randomUUID(),
                        bookName,
                        authorService.getAuthorById(UUID.fromString(authorId))));
                System.out.println(createdBook);
        }
        entityManager.close();
    }
}
