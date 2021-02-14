package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector
{
    Shape shape;
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

    public void showFigures()
    {
        for(int i = 0; i < 1; i++)
        {
            for(int j = 0; j < shapeList.size()-1; j++)
            {
                shapeList.get(j).getShapeName();
            }
            shapeList.get(shapeList.size()-1).getShapeName();
        }
    }
}
