package com.kodilla.testing.shape;

public class Rectangle implements Shape
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

    public String getShapeName()
    {
        return "Rectangle";
    }
}
