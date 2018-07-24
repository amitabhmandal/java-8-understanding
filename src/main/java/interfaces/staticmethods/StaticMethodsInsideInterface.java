package interfaces.staticmethods;

public class StaticMethodsInsideInterface implements StaticInterface {

    public static void main(String[] args) {
        StaticMethodsInsideInterface st = new StaticMethodsInsideInterface();

        // How many ways we can call the static method of the interface.

        // option 1: Interface reference type
        StaticInterface.staticMethod();

        // Option 2: Creating an instance of the implementor class
        // st.staticMethod() --> NOT ALLOWED
        
        // Option 3: Calling through the implementor class name.
        // StaticMethodsInsideInterface.staticMethod() --> NOT ALLOWED

        
        //This method call is not over-riding the parent interface static method
        StaticMethodsInsideInterface.staticMethod();
        
    }
    
    //This method is being declared in the child class it is not over-riding.
    public static void staticMethod() {
        System.out.println("Static method of implementor class");

    }

}

interface StaticInterface {

    // FROM 1.8v we can declare static methods inside the interface.

    // This is meant for GENERAL Utility Methods

    // This is not meant for specific implementation classes

    // Any reference type can call this method whether they are implementing it or not.
    
    //STATIC METHODS OF THE INTERFACE ARE NOT AVAILABLE TO THE IMPLEMENTOR CLASS BY DEFAULT
    
    //By Default interface static methods not available to the child class hence 
    //over-riding not possible
    
    //we can define the same signature method in the implementation class but it not 
    //over-riding

    public static void staticMethod() {
        System.out.println("Static Interface method");

    }
}