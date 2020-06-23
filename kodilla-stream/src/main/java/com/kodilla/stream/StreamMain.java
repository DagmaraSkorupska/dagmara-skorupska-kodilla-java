package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import jdk.nashorn.internal.runtime.ListAdapter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        //ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        //processor.execute(executeSaySomething);

        processor.execute(() -> System.out.println("This is an example text."));


        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, Double::sum);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //task 7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("zło", text -> text + "ABC");
        poemBeautifier.beautify("zło", text -> "ABC" + text);
        poemBeautifier.beautify("zło", String::toUpperCase);
        poemBeautifier.beautify("zło", text -> text.substring(1, 3));
        poemBeautifier.beautify("zło", text -> text.replace("z", "Z"));

        //example 7.2
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        //example 7.3
        People.getList()
                .forEach(System.out::println);



        //example 7.3.3
        BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
