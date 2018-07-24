package functional.interfaces.predicate;

import java.util.function.Predicate;

// 1. Predicate interface is present in  java.util.Function.Predicate package

// 2. It is a functional interface

// 3. contains the following abstract method:  boolean test(T t);

// 4. FUNCTIONAL INTERFACES ARE ALWAYS USED TO CALL LAMBDA EXPRESSIONS

public class PredicateExample {

    public static void main(String[] args) {

        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);

        // Calling Predicate method
        System.out.println(lesserthan.test(10));

        // Predicate Chaining

        Predicate<Integer> greaterThanTen = (i) -> i > 10;

        // Creating predicate
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
        boolean result = greaterThanTen.and(lowerThanTwenty)
            .test(15);
        System.out.println(result);

        // Calling Predicate method
        boolean result2 = greaterThanTen.and(lowerThanTwenty)
            .negate()
            .test(15);
        System.out.println(result2);
        
        pred(10, (i) -> i > 7);

    }

    static void pred(int number, Predicate<Integer> predicate) {
        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }
    }
}
