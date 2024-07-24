package com.example.main;

import com.example.library.*;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        library.getList().add(new Book("Endlich Wochenende", "Jörg Sonntag", "27-07-28-7-2024", 2024));

        library.printBookDetails(library.getList().get(0));
    }

}