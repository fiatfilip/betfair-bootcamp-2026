package ro.digitalstack.betfair.session12.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "authors_jpa")
public class Author {
    @Id
    private UUID id;
    @Column(name = "author_name")
    private String name;

    public Author(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public Author() {

    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "author")
    List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Author{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
