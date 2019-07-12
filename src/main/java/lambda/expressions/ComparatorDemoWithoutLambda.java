package lambda.expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemoWithoutLambda {

    public static void main(String[] args) {
        //withoutUsingLambdaExpressions();
        withUsingLambdaExpression();

    }

    public static void withUsingLambdaExpression() {

        Employee e1 = new Employee("John", 1);
        Employee e2 = new Employee("Tim", 1);
        Employee e3 = new Employee("Bob", 1);
        Employee e4 = new Employee("Sam", 1);

        List<Employee> emplyeeList = new ArrayList<Employee>();
        emplyeeList.add(e1);
        emplyeeList.add(e2);
        emplyeeList.add(e3);
        emplyeeList.add(e4);

        System.out.println("Before Sorting");

        for (Employee employee : emplyeeList) {
            System.out.println(employee.getName());
        }

        Collections.sort(emplyeeList, (Employee first, Employee second) -> (first.getName()
            .compareTo(second.getName())));
        

        System.out.println("After Sorting");

        for (Employee employee : emplyeeList) {
            System.out.println(employee.getName());
        }

    }

    public static void withoutUsingLambdaExpressions() {
        Employee e1 = new Employee("John", 1);
        Employee e2 = new Employee("Tim", 1);
        Employee e3 = new Employee("Bob", 1);
        Employee e4 = new Employee("Sam", 1);

        List<Employee> emplyeeList = new ArrayList<Employee>();
        emplyeeList.add(e1);
        emplyeeList.add(e2);
        emplyeeList.add(e3);
        emplyeeList.add(e4);

        System.out.println("Before Sorting");

        for (Employee employee : emplyeeList) {
            System.out.println(employee.getName());
        }

        Collections.sort(emplyeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee first, Employee second) {
                return first.getName()
                    .compareTo(second.getName());
            }

        });

        System.out.println("After Sorting");

        for (Employee employee : emplyeeList) {
            System.out.println(employee.getName());
        }
    }

}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
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