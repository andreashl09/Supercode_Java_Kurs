package com.example.library;

public class EBook extends Book implements Readable {
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

    }

    @Override
    public void read() {

    }

    @Override
    public String toString() {
        return "EBook" + super.toString() + "[fileSize=" + fileSize + "]";
    }

}
