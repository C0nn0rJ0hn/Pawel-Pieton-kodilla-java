package com.kodilla.testing.shape;

public class Circle implements Shape
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

    public String getShapeName()
    {
        return "Circle";
    }
}
