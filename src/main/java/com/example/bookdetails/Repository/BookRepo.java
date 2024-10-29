package com.example.bookdetails.Repository;

import com.example.bookdetails.Model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;


public interface BookRepo extends MongoRepository<Book,String> {

    List<Book> findByBookAuthorId(String bookAuthorId);
}
