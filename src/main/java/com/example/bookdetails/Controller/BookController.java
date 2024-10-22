package com.example.bookdetails.Controller;

import com.example.bookdetails.Model.Book;
import com.example.bookdetails.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("/book/{bookAuthorId}")
    public List<Book> getAllBooks(@PathVariable String bookAuthorId){
        return bookService.getAllBooks(bookAuthorId);
    }
}
