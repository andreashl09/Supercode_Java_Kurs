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
    
}