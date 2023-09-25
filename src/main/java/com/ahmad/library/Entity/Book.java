package com.ahmad.library.Entity;

import jakarta.persistence.*;
import java.lang.String;
@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="author")
    private String author;
    @Column(name="book_title")
    private String book_title;
    @Column(name="IBAN")
    private String IBAN;
    @Column(name="year_of_publish")
    private int year_of_publish;
    @Column(name="number_of_pages")
    private int number_of_pages;

    public Book() {
    }

    public Book(String author, String book_title, String IBAN, int year_of_publish, int number_of_pages) {
        this.author = author;
        this.book_title = book_title;
        this.IBAN = IBAN;
        this.year_of_publish = year_of_publish;
        this.number_of_pages = number_of_pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public int getYear_of_publish() {
        return year_of_publish;
    }

    public void setYear_of_publish(int year_of_publish) {
        this.year_of_publish = year_of_publish;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }
}
