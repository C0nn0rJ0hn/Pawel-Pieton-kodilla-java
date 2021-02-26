package com.kodilla.exception.test;

public class ExceptionHandling
{
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try
        {
            System.out.println(secondChallenge.probablyIWillThrowException(1.2, 1));
        }
        catch (Exception e)
        {
            System.out.println("When x >= 2 or x < 1 or y == 1.5 I will throw exception: " + e);
        }
        finally {
            System.out.println("Method attempt done!");
        }
    }
}
