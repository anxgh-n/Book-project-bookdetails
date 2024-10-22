package com.example.bookdetails.Service;

import com.example.bookdetails.Model.Book;
import com.example.bookdetails.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    public Book addBook(Book book){
        return bookRepo.save(book);
    }

    public List<Book> getAllBooks(String bookAuthorId){
        return bookRepo.findByAuthorId(bookAuthorId);

    }




}
