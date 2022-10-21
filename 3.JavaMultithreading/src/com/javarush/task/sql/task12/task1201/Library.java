package com.javarush.task.sql.task12.task1201;

import jakarta.persistence.*;

/* 
task1201
*/

@Entity
@Table(name = "library_table")
public class Library {
    @Id
    private Long id;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "status")
    private PublicationStatus status;
    @Column(name = "publicationName")
    private String publicationName;
    @Column(name = "isbn")
    private String isbn;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public PublicationStatus getStatus() {
        return status;
    }

    public void setStatus(PublicationStatus status) {
        this.status = status;
    }

    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationsName) {
        this.publicationName = publicationsName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
