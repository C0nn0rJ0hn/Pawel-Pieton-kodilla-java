package com.kodilla.testing.library;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@DisplayName("Book Directory Test Suite")
@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity)
    {
        List<Book> resultList = new ArrayList<>();
        for(int n = 1; n <= booksQuantity; n++)
        {
            Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    private static int counter = 0;

    @BeforeAll
    public static void beforeAllTests()
    {
        System.out.println("Beginning of tests");
        System.out.println();
    }

    @AfterAll
    public static  void afterAllTests()
    {
        System.out.println("All test are finished");
    }

    @BeforeEach
    public void beforeEachTest()
    {
        counter++;
        System.out.println("Preapering to execute test #" + counter);
        System.out.println();
    }


    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @DisplayName("Test - List books with conditions return list")
    @Test
    void testListBooksWithConditionsReturnList()
    {

        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);                 // [8]
        resultListOfBooks.add(book1);                                                    // [9]
        resultListOfBooks.add(book2);                                                    // [10]
        resultListOfBooks.add(book3);                                                    // [11]
        resultListOfBooks.add(book4);

        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        Assertions.assertEquals(4, theListOfBooks.size());
    }

    @Nested
    @DisplayName("Test - List books with different conditions")
    class ListBooksWithDifferentConditions
    {
        @DisplayName("Test - List books with condition 0 books")
        @Test
        void testListBooksWithCondition0Books()
        {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            List<Book> resultListOf0Books = new ArrayList<>();

            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);

            // When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");

            // Then
            Assertions.assertEquals(0, theListOfBooks0.size());
        }

        @DisplayName("Test - List books with condition 15 books")
        @Test
        void testListBooksWithCondition15Books()
        {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            List<Book> resultListOf15Books = generateListOfNBooks(15);

            when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);


            // When
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");


            // Then
            Assertions.assertEquals(15, theListOfBooks15.size());
        }

        @DisplayName("Test - List books with condition 40 books")
        @Test
        void testListBooksWithCondition40Books()
        {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            List<Book> resultListOf40Books = generateListOfNBooks(40);

            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

            // When
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

            // Then
            Assertions.assertEquals(0, theListOfBooks40.size());
        }
    }

    @DisplayName("Test - List books with condition fragment shorter than 3")
    @Test
    void testListBooksWithConditionFragmentShorterThan3()
    {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        Assertions.assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @DisplayName("Test - No books in hands of library user")
    @Test
    void testListNoBooksInHandsOf()
    {
        //Given
        List<Book> resultListOf0Books = new ArrayList<>();
        LibraryUser libraryUser = new LibraryUser("Firstname", "Lastname", "PeselID");

        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOf0Books);

        //When
        List<Book> noBooksInHandsOf = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        Assertions.assertEquals(0,noBooksInHandsOf.size());
    }

    @DisplayName("Test - One book in hands of library user")
    @Test
    void testListOneBookInHandsOf()
    {
        //Given
        List<Book> resultListOf1Book = generateListOfNBooks(1);
        LibraryUser libraryUser = new LibraryUser("Firstname", "Lastname", "PeselID");

        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOf1Book);

        //When
        List<Book> oneBookInHandsOf = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        Assertions.assertEquals(1, oneBookInHandsOf.size());
    }

    @DisplayName("Test - Five books in hands of library user")
    @Test
    void testListFiveBooksInhandsOf()
    {
        //Given
        List<Book> resultListOf5Books = generateListOfNBooks(5);
        LibraryUser libraryUser = new LibraryUser("Firstname", "Lastname", "PeselID");

        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOf5Books);

        //When
        List<Book> fiveBooksInHandsOf = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        Assertions.assertEquals(5, fiveBooksInHandsOf.size());
    }

    @DisplayName("Test - Rent a book")
    @Test
    void testRentABook()
    {
        //Given
        LibraryUser libraryUser = new LibraryUser("Firstname", "Lastname", "PeselID");
        Book bookToRent = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);

        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        when(libraryDatabaseMock.rentABook(libraryUser,bookToRent)).thenReturn(true);

        //When
        boolean rentIsOK = bookLibrary.rentABook(libraryUser,new Book("Secret life of programmers", "Steve Wolkowitz", 2016));


        //Then
        Assertions.assertTrue(rentIsOK);
    }

    @DisplayName("Test - Return books")
    @Test
    void testReturnBooks()
    {
        //Given
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        LibraryUser libraryUser = new LibraryUser("Firstname", "Lastname", "PeselID");

        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        when(libraryDatabaseMock.returnBooks(libraryUser)).thenReturn(resultListOf10Books.size());

        //When
        int numberOfReturnedBooks = bookLibrary.returnBooks(libraryUser);

        //Then
        Assertions.assertEquals(10, numberOfReturnedBooks);
    }
}
