package com.kodilla.testing.shape;

public class Square implements  Shape
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

    public String getShapeName()
    {
        return "Square";
    }
}
