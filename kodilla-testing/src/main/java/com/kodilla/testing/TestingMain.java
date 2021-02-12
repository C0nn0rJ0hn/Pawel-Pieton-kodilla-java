package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int addResult = calculator.add(50, 20);
        int substructResult = calculator.substract(50, 20);

        if(addResult == 70)
        {
            System.out.println("Calculator adding works properly - Test OK");
        }
        else
        {
            System.out.println("Test failed!");
        }

        if(substructResult == 30)
        {
            System.out.println("Calculator substruct works properly - Test OK");
        }
        else {
            System.out.println("Test failed!");
        }
    }
}
