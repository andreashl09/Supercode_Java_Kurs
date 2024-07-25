package com.example.main;

import com.example.library.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        library.getList().add(new EBook("Endlich Wochenende", "Jörg Sonntag", "27-07-28-7-2024", 2024, 3.4));
        library.getList().add(new EBook("Noch nicht Wochenende", "Jörg Sonntag", "27-07-28-7-2024", 2024, 3.0));
        library.getList().add(
                new PrintedBook("Urlaub, wäre auch mal wieder schön", "Bernd Urlaub", "26-07-27-7-2024", 2024, 2005));
        library.getList().add(new PrintedBook("Zum Glück noch nicht im Lotto gewonnen", "Dieter Arbeit",
                "24-07-24-7-2024", 2024, 2304));

        library.printAllBooks();

        EBookDownload("Endlich Wochenende", library);
    }

    public static void EBookDownload(String title, Library library) {
        for (Book b : library.getList()) {
            if (b.getTitle().equals(title)) {
                if (b instanceof EBook) {
                    ((EBook) b).download();
                }
            }
        }
    }

}