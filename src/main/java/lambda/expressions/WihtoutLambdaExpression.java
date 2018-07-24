package lambda.expressions;

interface ParentInterface {

    public void parentInterfaceMethod();
}

class Child implements ParentInterface {

    @Override
    public void parentInterfaceMethod() {
        System.out.println("Inside child class");
    }
}

public class WihtoutLambdaExpression {

    public static void main(String[] args) {
        ParentInterface parentInterface = new Child();
        parentInterface.parentInterfaceMethod();
    }

}
