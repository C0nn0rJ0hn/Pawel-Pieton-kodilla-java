package com.kodilla.exception.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;


public class FileReaderTestSuite
{
    @Test
    void testReadFile()
    {
        //Given
        FileReader fileReader = new FileReader();

        //When


        //Then
        Assertions.assertDoesNotThrow(() ->fileReader.readFile());
    }

    @Test
    void whenFileDosentExistsReadFileShouldThrowException()
    {
        //Given
        FileReader fileReader = new FileReader();
        String fileName = "nie_ma_takiego_pliku.txt";
        //When

        //Then
        Assertions.assertThrows(FileReaderException.class, () ->fileReader.readFile(fileName));
    }

    @Test
    void testReadFileWithName()
    {
        //Given
        FileReader fileReader = new FileReader();
        //When

        //Then
        Assertions.assertAll(
                ()-> Assertions.assertThrows(FileReaderException.class, () -> fileReader.readFile("nie_ma_takiego_pliku.txt")),
                () -> Assertions.assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> Assertions.assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
        );
    }
}
