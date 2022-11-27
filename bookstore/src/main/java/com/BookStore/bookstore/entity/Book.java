package com.BookStore.bookstore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="book")
public class Book {
    @Id
    //@GeneratedValue(strategy = GenerationType.)
    private int bookId;
    @Column(name="bookName")
    private String bookName;
    @Column(name="bookAuthor")
    private String bookAuthor;
    @Column(name="bookCategory")
    private String bookCategory;
    @Column(name="bookPrice")
    private int bookPrice;
    @Column(name="bookSecurityDeposit")
    private String bookSecurityDeposit;
}
