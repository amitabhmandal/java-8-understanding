package lambda.expressions;
//****************************************************

// RULE 1: CURLY BRACES OPTIONAL IF ONLY ONE STATEMENT
//****************************************************
// Rule : If the body of the method does not contain more than one statement then we can 
// remove the curly braces

// Hence the following lambda expression 
// () -> { System.out.println("Hello");
// can be replaced into 
// () -> System.out.println("Hello";

//****************************************
// RULE 2: TYPE INFERENCE FROM THE CONTEXT
//****************************************
// If the compiler can guess the type of input based on the context it is called type inference.
// we can remove the types as well. 
// Hence the following lambda expression
// (int a, int b ) -> {System.out.println(a+b); }
// can be replaced now as follows
// (a, b) -> System.out.println(a+b);

//*************************************************
//RULE 3: CAN DETECT WHETHER THERE IS A RETURN TYPE
//*************************************************
// Based on Rule #1 and Rule #2
// Hence the following lambda expression

// (int a, int b ) -> {System.out.println(a+b); }
// can be replaced now as follows

// (s) -> return s.length();

// can further be simplified into as compiler can guess the return hence return can be 
// further removed
// (s) -> s.length();

//*****************************************************************
//RULE 4: INPUT VALUES IS ONLY ONE THEN PARANTHESIS CAN BE REMOVED
//*****************************************************************

// Hence the following Lambda expression 
// (s) -> s.length();
// can be further simplified into as there is only one input argument hence parenthesis can
// be removed
// s -> s.length();

public class LambdaExpressionTester {

    public static void main(String[] args) {
        // case 1: Lamdba expression to print hello

        // case 2: Print the sum of two int values

        // case 3: input string, return the length of the string
    }

    // CASE 1: SOLVED

    // For lambda expressions following is the requirement
    // It is anonymous hence no name : hence remove printHello
    // It does not have any modifier : hence remove the modifier 'public'
    // It does not have any return type: hence remove the return type 'void'

    // Hence the stripped code becomes
    // () { System.out.println("Hello");

    // We just need to add -> symbol

    // hence the final lambda expression should be () -> { System.out.println("Hello");}

    public void printHello() {
        System.out.println("Hello");
    }

    // CASE 2: SOLVED

    // For lambda expressions following is the requirement
    // It is anonymous hence no name : hence remove 'sum'
    // It does not have any modifier : hence remove the modifier 'public'
    // It does not have any return type: hence remove the return type 'void'

    // (int a, int b ) -> {System.out.println(a+b); }

    public void sum(int a, int b) {

        System.out.println(a + b);

    }

    // CASE 3: SOLVED

    // For lambda expressions following is the requirement
    // It is anonymous hence no name : hence remove 'getLength'
    // It does not have any modifier : hence remove the modifier 'public'
    // It does not have any return type: hence remove the return type 'int'

    // (String s) -> {return s.length(); }

    public int getLength(String s) {
        return s.length();
    }
}
