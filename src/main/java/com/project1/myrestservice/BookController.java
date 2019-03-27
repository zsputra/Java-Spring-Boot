package com.project1.myrestservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class BookController{

    @Autowired
    BookService bookService;

    @GetMapping(value="/books")
    public List<Books> retrieveAllBooks() {
        return bookService.retrieveAllBooks();
    }

    @GetMapping(value="/books/{bookId}")
    public Books retrieveDetailOfBook(@PathVariable String bookId){
        return bookService.retrieveDetailBook(bookId);
    }

    @PostMapping(value="/books")
    public List<Books> createBooks(@RequestBody Books book) {
        return bookService.createBook(book);
    }
    
    @PutMapping(value="/books")
    public List<Books> updateBooks(@RequestBody Books book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping(value="/books/delete={bookId}")
    public List<Books> deleteABook(@PathVariable String bookId){
        return bookService.deleteBook(bookId);
    }

}