package ro.digitalstack.betfair.session11;

import ro.digitalstack.betfair.session11.entity.Author;
import ro.digitalstack.betfair.session11.service.AuthorService;
import ro.digitalstack.betfair.session11.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.UUID;

public class JDBCMain {

    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionFactory.getConnection("postgresql");
        AuthorService authorService = new AuthorService(connection);

        // authorService.createAuthor(new Author(UUID.randomUUID(), "George Orwell"));
        Author author = authorService.getAuthorById(UUID.fromString("0a7d158e-e6dd-4aff-9e5b-d5623887191d"));
        System.out.println(author.toString());
        authorService.updateAuthor(new Author(UUID.randomUUID(), "xyzw"));
    }


}
