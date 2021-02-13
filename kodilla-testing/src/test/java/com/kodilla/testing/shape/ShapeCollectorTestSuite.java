package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public void beforeAllTests()
    {
        System.out.println("Begining of tests");
        System.out.println();
    }

    @AfterAll
    public void afterAllTests()
    {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEachTest()
    {
        testCounter++;
        System.out.println("Preapering to execute test #" + testCounter);
        System.out.println();
    }

    @DisplayName("Add figure to the list")
    @Test
    void testAddFigure()
    {
        //Given
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(10, 5);
        Shape square = new Square(7);

        ShapeCollector shapeCollector = new ShapeCollector();


        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(square);


        //Then
        Assertions.assertEquals(3, shapeCollector.shapeList.size());
    }

    @DisplayName("Remove figure from the list")
    @Test
    void testRemoveFigure()
    {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(10);


        //When
        shapeCollector.removeFigure(circle);

        //Then
        Assertions.assertEquals(0, shapeCollector.shapeList.size());
    }

    @DisplayName("Get figure from the list")
    @Test
    void testGetFigure()
    {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(10, 5);
        Shape square = new Square(7);

        //When
        shapeCollector.getFigure(2);

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(square);

        //Then
        Assertions.assertEquals(shapeCollector.shapeList.get(1), shapeCollector.getFigure(1));
    }

    @DisplayName("Show all figures in the list")
    @Test
    void testShowFigures()
    {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(10, 5);
        Shape square = new Square(7);

        //When
        shapeCollector.showFigures();

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(square);

        //Then
        Assertions.assertEquals("Circle, Rectangle, Square", shapeCollector.showFigures());
    }
}
