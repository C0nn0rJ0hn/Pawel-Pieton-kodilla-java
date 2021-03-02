package com.kodilla.rps;

public enum GestureClassic
{
    Rock(1),
    Paper(2),
    Scissors(3);

    private int type;

    GestureClassic(int type)
    {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
