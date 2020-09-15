package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;


public class LibraryTestSuite {
    @Test
    public void testGetBook(){
        //Given
        Book book1 = new Book("Fala", "E.Frank", LocalDate.of(2020, 5, 5));
        Book book2 = new Book("F", "Boob", LocalDate.of(1988, 10, 17));

        Library library = new Library("Filia 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);

        //making shallow copy of object library
        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Filia 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //making deep copy of object library
        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Filia 3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(1,library.getBooks().size());
        Assert.assertEquals(1, clonedLibrary.getBooks().size());
        Assert.assertEquals(2, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), clonedLibrary.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }

}
