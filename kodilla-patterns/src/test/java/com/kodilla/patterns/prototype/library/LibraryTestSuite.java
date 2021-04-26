package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.stream.IntStream;

public class LibraryTestSuite
{
    @Test
    void testGetBooks()
    {
        //Given
        Library library = new Library("Original library");
        IntStream.iterate(1, n -> n +1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Title " + n, "Author " + n, LocalDate.of(2021, 4, 10 + n))));

        //making a shallow copy of library
        Library clonedLibrary = null;
        try
        {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library - Shallow Copy");
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println(e);
        }

        //making a deep copy of library
        Library deepClonedLibrary = null;
        try
        {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library - Deep Copy");
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(new Book("Title 2", "Author 2", LocalDate.of(2021, 4, 12)));

        //Then
        System.out.println(library.getName());
        library.getBooks().stream()
                .map(s ->s.toString())
                .forEach(System.out::println);
        System.out.println();

        System.out.println(clonedLibrary.getName());
        clonedLibrary.getBooks().stream()
                .map(s -> s.toString())
                .forEach(System.out::println);
        System.out.println();

        System.out.println(deepClonedLibrary.getName());
        deepClonedLibrary.getBooks().stream()
                .map(s -> s.toString())
                .forEach(System.out::println);
        System.out.println();

        Assertions.assertEquals(9, library.getBooks().size());
        Assertions.assertEquals(9, clonedLibrary.getBooks().size());
        Assertions.assertEquals(10, deepClonedLibrary.getBooks().size());
        Assertions.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assertions.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }
}
