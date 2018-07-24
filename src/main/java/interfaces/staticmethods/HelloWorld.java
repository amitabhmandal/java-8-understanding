package interfaces.staticmethods;


//we can define the main method inside an interface and execute hello world
//program. This facility is only available in Java from 1.8
public interface HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

}
