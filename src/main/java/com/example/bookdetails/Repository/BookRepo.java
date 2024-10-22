package com.example.bookdetails.Repository;

import com.example.bookdetails.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {

    List<Book> findByAuthorId(String bookAuthorId);

}
