package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    Set<Book> oldSetOfBooks;

    @Test
    public void publicationYearMedianTest(){


        //Given
        oldSetOfBooks = new HashSet<>();
        Book book1 = new Book("Jan", "Fraszka", 1959, "1236");
        Book book2 = new Book("Adam", "Pan Tadeusz", 2000, "127");
        Book book3 = new Book("Juliusz", "Ogniem i mieczem", 1825, "1");
        oldSetOfBooks.add(book1);
        oldSetOfBooks.add(book2);
        oldSetOfBooks.add(book3);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int yearMedian = medianAdapter.publicationYearMedian(oldSetOfBooks);

        //Then
        System.out.println(yearMedian);
        Assert.assertEquals(yearMedian, 1959);
    }
}
