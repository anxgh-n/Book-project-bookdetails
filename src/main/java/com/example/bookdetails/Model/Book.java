package com.example.bookdetails.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    @Id
    private int bookId;
    private String bookTitle;
    private String bookPrice;
    private LocalDate bookPublished;
    private String bookImageUrl;
    private String bookAuthorId;
}