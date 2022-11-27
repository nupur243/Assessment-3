package com.BookStore.bookstore.repository;

import com.BookStore.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {
        List<Book> findByBookName(String bookName);
}
