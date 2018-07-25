package anonymous.innerclass;

public class AnonymousInnerClass {

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.m2();
        
        Test2 t2= new Test2();
        t2.m2();

    }

}

interface Example {
    public void m1();
}

class Test1 {
    int x = 888;

    public void m2() {
        System.out.println("Executing m2() method ");

        Example example = new Example() {

            // IMPORTANT POINT #1

            // Within anonymous inner class we can declare instance variables

            int x = 999;

            @Override
            public void m1() {

                // WITHIN ANONYMOUS INNER CLASS THIS ALWAYS REFERS TO CURRENT INNER CLASS
                // OBJECT
                System.out.println("Instance variable within anonymous " + "inner classs " + this.x);

                // FROM HERE IF WE WANT TO ACCESS OUTER CLASS INSTANCE MEMBERS
                System.out.println("Instance variable of outer classs " + Test1.this.x);

            }
        };

        example.m1();
    }
}

class Test2 {
    int x = 888;

    public void m2() {
        System.out.println("Executing m2() method ");
        Example example = () -> {
            int x = 999;
            System.out.println("Instance variable of outer class " + "inner classs " + this.x);
            // FROM HERE IF WE WANT TO ACCESS OUTER CLASS INSTANCE MEMBERS
            System.out.println("Local variable of lamdba expression " + x );
        };
        example.m1();
    }
}