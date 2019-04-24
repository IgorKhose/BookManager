package com.gotham.bookmanager.model;
import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name="BOOK_TITLE")
    private String bookTitle;

    @Column(name="BOOK_AUTHOR")
    private String bookAuthor;

    @Column(name="BOOK_PRICE")
    private int price;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Id='" + Id + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", price=" + price +
                '}';
    }
}
