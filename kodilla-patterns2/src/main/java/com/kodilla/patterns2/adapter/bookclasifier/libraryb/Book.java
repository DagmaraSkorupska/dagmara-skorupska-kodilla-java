package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class Book {
    private final String author;
    private final String title;
    private final int yearIfPublication;

    public Book(String author, String title, int yearIfPublication) {
        this.author = author;
        this.title = title;
        this.yearIfPublication = yearIfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearIfPublication() {
        return yearIfPublication;
    }
}
