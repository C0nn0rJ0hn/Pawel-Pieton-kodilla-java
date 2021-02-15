package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector
{
    List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape)
    {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape)
    {
        shapeList.remove(shape);
    }

    public Shape getFigure(int n)
    {
        return shapeList.get(n);
    }

    public String showFigures()
    {
        String result = "";

            for(int j = 0; j < shapeList.size()-1; j++)
            {
                result += (shapeList.get(j).getShapeName() + ", ");
            }
            result += shapeList.get(shapeList.size()-1).getShapeName();

        return result;
    }
}
