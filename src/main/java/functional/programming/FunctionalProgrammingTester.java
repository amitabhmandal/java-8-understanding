package functional.programming;

import java.util.List;

public class FunctionalProgrammingTester {

    public static void main(String[] args) {
        /*  List<String> list = List.of("Apple", "Banana", "Cat", "Dog", "bat");
        printBasic(list);
        printBasicFP(list);
        printBasicWithFiltering(list);
        printBasicFPWithFiltering(list);
        
        List<Integer> listNumber = List.of(1 , 2, 3, 4, 5, 6, 7, 8 , 9);
        listNumber.stream().forEach(element -> System.out.println(element));
        System.out.println(basicSumOfNumber(listNumber));
        
        
        basicSumOfNumberWithFunctionalProgramming(listNumber);
        
        }
        
        private static int basicSumOfNumber(List<Integer> list) {
        int sum = 0;
        System.out.println("Addition of Numbers Without functional Programming call");
        for (Integer integer : list) {
            System.out.println(integer);
            sum = sum + integer;
        }
        return sum;
        }
        
        private static void basicSumOfNumberWithFunctionalProgramming(List<Integer> list) {
        System.out.println("Addition of Numbers With functional Programming call");
        
        System.out.println(list.stream().reduce(0, (number1, number2 ) -> number1 + number2));
        }
        
        
        
        private static void printBasic(List<String> list) {
        System.out.println("Without functional Programming call");
        for (String string : list) {
            System.out.println(string);
        }
        }
        
        private static void printBasicWithFiltering(List<String> list) {
        System.out.println("Without functional Programming call Filtering");
        for (String string : list) {
            if (string.endsWith("at")) {
                System.out.println(string);
            }
        }
        }
        
        private static void printBasicFP(List<String> list) {
        // for(String string : list) {
        // System.out.println(string);
        // }
        
        // Here action is a method.
        
        // Within the for-each we are not sending data but it is a function call.
        // Hence we are sending a function as parameter
        
        System.out.println("With functional Programming call");
        
        list.stream()
            .forEach(element -> System.out.println(element));
        
        }
        
        private static void printBasicFPWithFiltering(List<String> list) {
        
        System.out.println("With functional Programming call filtering");
        
        list.stream()
            .filter(element -> element.endsWith("at"))
            .forEach(element -> System.out.println(element));*/

    }
}

