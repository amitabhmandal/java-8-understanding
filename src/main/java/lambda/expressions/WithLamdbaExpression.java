package lambda.expressions;

interface ParentLambdaInterface {

    public void parentMethod();
}


public class WithLamdbaExpression {

    public static void main(String[] args) {
        ParentLambdaInterface p = ()->System.out.println("Inside parentMethod" );
        p.parentMethod();

        Runnable runnable = () ->{
            for (int i = 0; i< 10; i++) {
                System.out.println("Child thread : " + i);
            }
        };
        
        Thread t = new Thread(runnable);
        t.start();
    }

}

