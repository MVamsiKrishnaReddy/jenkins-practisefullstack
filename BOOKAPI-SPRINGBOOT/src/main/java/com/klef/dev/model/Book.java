package com.klef.dev.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_table")
public class Book {
    
    @Id
    @Column(name = "book_id")
    private int id;
    
    @Column(name = "book_title", nullable = false, length = 100)
    private String title;
    
    @Column(name = "book_author", nullable = false, length = 50)
    private String author;
    
    @Column(name = "book_genre", nullable = false, length = 30)
    private String genre;
    
    @Column(name = "book_publisher", nullable = false, length = 50)
    private String publisher;
    
    @Column(name = "book_year", nullable = false)
    private int year;
    
    @Column(name = "book_isbn", nullable = false, unique = true, length = 20)
    private String isbn;
    
    @Column(name = "book_price", nullable = false)
    private double price;

    // --- Getters and Setters ---
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + 
               ", title=" + title + 
               ", author=" + author + 
               ", genre=" + genre + 
               ", publisher=" + publisher + 
               ", year=" + year + 
               ", isbn=" + isbn + 
               ", price=" + price + "]";
    }
}
