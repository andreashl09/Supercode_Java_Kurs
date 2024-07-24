package com.example.library;

public class PrintedBook extends Book implements Readable {

    private int weight;

    public PrintedBook(String title, String author, String isbn, int year, int weight) {
        super(title, author, isbn, year);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void download() {

    }

    @Override
    public void read() {

    }

    @Override
    public String toString() {
        return  "PrintedBook" + super.toString() + "[weight=" + weight + "]";
    }

}
