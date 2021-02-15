package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;
    ShapeCollector shapeCollector = new ShapeCollector();

    @BeforeAll
    public static void beforeAllTests()
    {
        System.out.println("Begining of tests");
        System.out.println();
    }

    @AfterAll
    public static void afterAllTests()
    {
        System.out.println("All tests are finished");
    }


    @BeforeEach
    public void beforeEachTest()
    {
        testCounter++;
        System.out.println("Preapering to execute test #" + testCounter);
        System.out.println();

        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(10, 5);
        Shape square = new Square(7);

        shapeCollector.shapeList.add(circle);
        shapeCollector.shapeList.add(rectangle);
        shapeCollector.shapeList.add(square);
    }

    @Nested
    @DisplayName("Test shapes")
    class TestShapes {
        @DisplayName("Add figure to the list")
        @Test
        void testAddFigure() {
            //Given
            Shape circle2 = new Circle(5);

            //When
            shapeCollector.addFigure(circle2);

            //Then
            Assertions.assertEquals(4, shapeCollector.shapeList.size());
        }

        @DisplayName("Remove figure from the list")
        @Test
        void testRemoveFigure() {
            //Given


            //When
            shapeCollector.removeFigure(shapeCollector.shapeList.get(0));

            //Then
            Assertions.assertEquals(2, shapeCollector.shapeList.size());
        }

        @DisplayName("Get figure from the list")
        @Test
        void testGetFigure() {
            //Given


            //When
            shapeCollector.getFigure(1);

            //Then
            Assertions.assertEquals(shapeCollector.shapeList.get(1), shapeCollector.getFigure(1));
        }

        @DisplayName("Show all figures in the list")
        @Test
        void testShowFigures() {
            //Given


            //When
            shapeCollector.showFigures();
            String expectedResult = "Circle, Rectangle, Square";

            //Then
            Assertions.assertEquals(expectedResult, shapeCollector.showFigures());

        }
    }
}
