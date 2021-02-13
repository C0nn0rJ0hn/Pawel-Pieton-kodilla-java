package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public interface Shape {

    void getShapeName();
    void getField();
}

class Circle implements  Shape
{
    private double pi = 3.14;
    private int radius;
    private double area;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void getField()
    {
        area = radius * radius * pi;
    }

    public void getShapeName()
    {
        System.out.println("Circle");
    }
}

class Rectangle implements Shape
{
    private int a;
    private int b;
    private int area;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void getField()
    {
        area = a * b;
    }

    public void getShapeName()
    {
        System.out.println("Rectangle");
    }
}

class Square implements Shape
{
    private int a;
    private int area;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void getField()
    {
        area = a * a;
    }

    public void getShapeName()
    {
        System.out.println("Square");
    }
}

class ShapeCollector
{
    Shape shape;
    List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape)
    {

    }

    public void removeFigure(Shape shape)
    {

    }

    public Shape getFigure(int n)
    {
        return null;
    }

    public String showFigures()
    {
        return null;
    }
}