package com.ironhack.ironLibrary.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;

    private String name;

    private String email;

    @OneToMany (mappedBy = "isbn")
    @JsonIgnore
    //@JoinColumn(name="isbn")
    private List<Book> authorBook;

    public Author() {
    }


    public Author( String name, String email, List<Book> authorBook) {

        this.name = name;
        this.email = email;
        this.authorBook = authorBook;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(List<Book> authorBook) {
        this.authorBook = authorBook;
    }
}
