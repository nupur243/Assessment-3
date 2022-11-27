package com.BookStore.bookstore.controller;

import com.BookStore.bookstore.entity.Book;
import com.BookStore.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService service;
    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
        return service.saveBook(book);
    }
    @PostMapping("/addBooks")
    public List<Book> addBooks(@RequestBody List<Book> books){
        return service.saveBooks(books);
    }
    @GetMapping("/books")
    public List<Book> findAllBooks(){
        return service.getBooks();
    }
    @GetMapping(value = "/bookId/{bookId}")
    public Book findBookById(@PathVariable int bookId){
        return service.getBookById(bookId);
    }
    @GetMapping(value = "/bookName/{bookName}")
    public List<Book> findBookByBookName(@PathVariable String bookName){
        return service.getBookByBookName(bookName);
    }
    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book){
        return service.updateBook(book);
    }
    @DeleteMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable int bookId){
        return service.deleteBook(bookId);
    }
}
