package com.example.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> list = new ArrayList<>();

    public List<Book> getList() {
        return list;
    }

    public void printBookDetails(Book book) {
        System.out.println(book);
    }
    
    public void findBooksByAuthor(String author) {
        for (Book book : list) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.getTitle());
            }
        }
    }

    public void printAllBooks() {
        for (Book book : list) {
            System.out.println(book);
        }
    }
    
}