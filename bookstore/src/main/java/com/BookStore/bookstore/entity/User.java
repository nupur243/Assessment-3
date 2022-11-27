package com.BookStore.bookstore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")
public class User {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    @Column(name = "userName")
    private String userName;
    @Column(name = "userEmail")
    private String userEmail;
    @Column(name = "userContact")
    private String userContact;
    @Column(name = "countOfBooks")
    private int countOfBooks;
    @Column(name = "suspendState")
    private String suspendState;
}