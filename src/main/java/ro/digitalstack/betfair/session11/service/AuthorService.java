package ro.digitalstack.betfair.session11.service;

import ro.digitalstack.betfair.session11.entity.Author;

import java.sql.*;
import java.util.UUID;

public class AuthorService {
    private Connection connection;

    public AuthorService(Connection connection) {
        this.connection = connection;
    }

    public Author getAuthorById(UUID id) throws SQLException {
        PreparedStatement getByIDStatement = connection.prepareStatement("SELECT * FROM author WHERE id = ?");
        getByIDStatement.setObject(1, id);
        ResultSet resultSet = getByIDStatement.executeQuery();
        if (resultSet.next()) {
            return new Author(UUID.fromString(resultSet.getObject(1).toString()), resultSet.getString("name"));
        }
        return null;
    }

    public Author createAuthor(Author author) throws SQLException {
        //Statement statement = connection.createStatement();
        //statement.executeUpdate("INSERT INTO author (id, name) VALUES ('" + author.getId() + "', '" + author.getName() + "')");
        //return author;

        PreparedStatement createStatement = connection.prepareStatement("INSERT INTO author (id, name) VALUES (?, ?)");
        createStatement.setObject(1, author.getId());
        createStatement.setString(2, author.getName());
        createStatement.executeUpdate();
        return author;
    }

    public Author updateAuthor(Author author) throws SQLException {
        connection.setAutoCommit(false);
        //com1
        Statement statement = connection.createStatement();
        statement.executeUpdate("DROP TABLE xyz");
        //connection.rollback();
        connection.commit();
        connection.setAutoCommit(true);
        return null;
    }

    public void deleteAuthor(UUID id) {

    }

}
