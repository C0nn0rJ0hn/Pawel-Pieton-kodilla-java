package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

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

    Shape circle = new Circle(10);
    Shape rectangle = new Rectangle(10, 5);
    Shape square = new Square(7);

    ShapeCollector shapeCollector = new ShapeCollector();

    @BeforeEach
    public void beforeEachTest()
    {
        testCounter++;
        System.out.println("Preapering to execute test #" + testCounter);
        System.out.println();

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(square);
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
            shapeCollector.removeFigure(circle);

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

            //Then

        }
    }
}
