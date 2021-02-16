package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    private  LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment)
    {
        List<Book> bookList = new ArrayList<>();

        if(titleFragment.length() < 3) return bookList;

        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if(resultList.size() > 20) return bookList;
        bookList = resultList;

        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser)
    {
        List<Book> booksInHandOf = libraryDatabase.listBooksInHandsOf(libraryUser);

        return booksInHandOf;
    }

    public boolean rentABook(LibraryUser libraryUser, Book book)
    {
        boolean booksToRent = libraryDatabase.rentABook(libraryUser, book);
        return booksToRent;

    }

    public int returnBooks(LibraryUser libraryUser)
    {

        int result = libraryDatabase.returnBooks(libraryUser);

        return result;
    }
}
