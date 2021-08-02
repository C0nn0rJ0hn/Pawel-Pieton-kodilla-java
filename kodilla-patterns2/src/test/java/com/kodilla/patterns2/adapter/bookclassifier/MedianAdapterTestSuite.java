package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Author1", "Title1", 1988, "Sig1");
        Book book2 = new Book("Author2", "Title2", 2015, "Sig2");
        Book book3 = new Book("Author3", "Title3", 1920, "Sig3");
        Book book4 = new Book("Author4", "Title4", 1777, "Sig4");
        Book book5 = new Book("Author5", "Title5", 2000, "Sig5");
        Book book6 = new Book("Author6", "Title6", 1898, "Sig6");
        Book book7 = new Book("Author7", "Title7", 2021, "Sig7");
        Book book8 = new Book("Author8", "Title8", 2006, "Sig8");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(books);
        System.out.println(publicationYearMedian);

        //Then
        assertEquals(publicationYearMedian, 2000, 0);
    }
}
