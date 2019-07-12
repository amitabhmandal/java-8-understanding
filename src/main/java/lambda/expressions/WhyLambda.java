package lambda.expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WhyLambda {

    public static void main(String[] args) {

        // --- OPTION : 1
        // Runnable Implementation
        new Thread(new CodeToRuns()).start();

        // --- OPTION : 2
        // Anonymous Implementation
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Printing from the Anonymous thread");
            }
        }).start();

        // Both the Runnable Implementation and Runnable Implementation presents with the same result

        // But in both the cases we had to write several lines of code to accomplish what we want to do
        // What we really cared about only about System.out.println() line to be printed
        // Everything else was the filler code to be able to execute it

        // Thus the other code is to instantiate the object
        // and implement a single method

        // What can be the best solution is to pass the System out println() code to the thread constructor
        // and then we dont have to worry about anything else.

        // Hence we can overcome the plumbing code

        // By using the lambda code we can actually do that.

        // --- OPTION : 3
        new Thread(() -> System.out.println("Printing through lambda Expression")).start();

        // Advantage : We are not using the plumbing code as well as no extra but really focus on
        // the actual execution of the code.

        // PARTS OF LAMBDA EXPRESSION
        // Argument List + Arrow Token + Body

        // PART : 1
        // Argument List

        // PART : 2
        // Arrow Token

        // PART : 3
        // Body

        // Dissecting the lambda expression
        // ()-> System.out.println("Printing through lambda Expression")
        // Empty Argument List

        // Arrow token
        // is just the - character followed by the greater than character
        //

        // Body
        // It is the code we want to run
        // Which in this case is the System.out.println
        // What if we have more than one line of code as part of the body
        // we would surround the code block in braces as we do in methods or any other code block

        new Thread(() -> {
            System.out.println("Multiple line 1");
            System.out.println("Multiple line 2");
            System.out.println("Multiple line 3");
        }).start();

        // Single line statement example
        // if we just have a single line statement without braces
        // new Thread(() -> System.out.println("Single line statement example");).start();
        // Then we cannot have semicolon when there is a single statement.
        // compiler will fail to compile when there is a single statement without a semi-colon

        //

        // IF WE DONT USE LAMBDAS THEN TO SORT OBJECTS WE WOULD HAVE YTO USE COMPARATOR TO SORT
        // ARRAYLIST
        Student s1 = new Student("Amit", 12);
        Student s2 = new Student("Martin", 45);
        Student s3 = new Student("Zenith", 33);
        Student s4 = new Student("Paras", 4);

        List<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        // Without using lambdas
        Collections.sort(students, new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName()
                    .compareTo(s2.getName());
            }

        });

        for (Student stud : students) {
            System.out.println(stud.getName());
        }

        // After using lamdas
        Collections.sort(students, (Student s11, Student s21) -> s11.getName()
            .compareTo(s21.getName()));

        System.out.println("After using lamdas");
        for (Student stud : students) {
            System.out.println(stud.getName());
        }

        // If we have only parameter then we dont have to put the argument within parenthesis

        // When lambdas are returning values
        String sillyString = doStringStuff(new UpperConcat() {

            @Override
            public String upperAndConcat(String s1, String s2) {
                // TODO Auto-generated method stub
                return s1.toUpperCase() + s2.toUpperCase();
            }
            
        }, students.get(0).getName(), students.get(1).getName());
        
        System.out.println("String concatenation without lambdas :" + sillyString);
        
        // We still have to define the interface even though we are using lambdas but the good thing
        // is that we can get away from using anonymous classes
        // 
        
        // Let's see how lambdas work 
        UpperConcat uc = (String s31, String s32) -> s31.toUpperCase() + s32.toUpperCase();
        System.out.println("Lambdas are in play : " + uc.upperAndConcat(s1.getName(), s2.getName()));
        //If we try to use the return key word then we will get a compiler error in the single line 
        //body method as shown below
        //The reason being the compiler can automatically infer that the statement is going to return
        //value hence it is redundant to add a return statement.
        
        // UpperConcat uc = (String s31, String s32) -> return (s31.toUpperCase() + s32.toUpperCase());
        
        //lambdas are treated as nested blocks
        
        
    }
    
    

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }

}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class CodeToRuns implements Runnable {
    public void run() {
        System.out.println("Printing from the Runnable thread");
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}