package com.BookStore.bookstore.service;

import com.BookStore.bookstore.entity.Book;
import com.BookStore.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;
    public Book saveBook(Book book){
       return repository.save(book);
    }
    public List<Book> saveBooks(List<Book> book){
        return repository.saveAll(book);
    }
    public List<Book> getBooks(){
        return repository.findAll();
    }
    public Book getBookById(int bookId){
        return repository.findById(bookId).orElse(null);
    }
    public List<Book> getBookByBookName(String bookName){
        return repository.findByBookName(bookName);
    }
    public String deleteBook(int bookId){
        repository.deleteById(bookId);
        return "Book removed "+bookId;
    }
    public Book updateBook(Book book){
        Book existingBook= repository.findById(book.getBookId()).orElse(null);
        existingBook.setBookAuthor(book.getBookAuthor());
        existingBook.setBookCategory(book.getBookCategory());
        existingBook.setBookName(book.getBookName());
        existingBook.setBookPrice(book.getBookPrice());
        existingBook.setBookId(book.getBookId());
        existingBook.setBookSecurityDeposit(book.getBookSecurityDeposit());
        return repository.save(existingBook);
    }
}
