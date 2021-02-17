package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text");

        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        MathExpression mathExecute = (a, b) -> a + b;
        expressionExecutor.executeExpression(5, 7, mathExecute);

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5,(a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5,(a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5,(a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5,(a, b) -> a / b);
        System.out.println();

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        System.out.println();


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Java", (text) -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Programming", (text) -> text.toUpperCase());
        poemBeautifier.beautify("ASSASSINS CREED", (text) -> text.toLowerCase());
        poemBeautifier.beautify("So weird ", (text) -> text.repeat(2));
        poemBeautifier.beautify("You ", (text) -> text.concat("are great :)"));
        poemBeautifier.beautify("This is it", (text) -> text.replaceAll("This is it", "It is this!"));
    }
}
