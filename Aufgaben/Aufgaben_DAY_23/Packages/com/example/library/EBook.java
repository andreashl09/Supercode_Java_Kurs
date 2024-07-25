package com.example.library;

import java.lang.*;

public class EBook extends Book implements Readable {

    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_RESET = "\u001B[0m";

    private double fileSize;

    public EBook(String title, String author, String isbn, int year, double fileSize) {
        super(title, author, isbn, year);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public void download() {
        System.out.println("\nEBook: " + " | " + this.getTitle() + " | " + " wird runtergeladen!");
        for (int i = 0; i <= 20; i++) {
            System.out.print(ANSI_WHITE_BACKGROUND + " " + ANSI_RESET);
            busyWait(100);

        }
        System.out.println(" " + fileSize + "MB geladen.");
    }

    private void busyWait(int milliseconds) {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < milliseconds) {
            // leere schleife die aktiv wartet
        }
    }

    @Override
    public void read() {

    }

    @Override
    public String toString() {
        return "EBook" + super.toString() + "[fileSize=" + fileSize + "]";
    }

}
