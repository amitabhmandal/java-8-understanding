package lambda.expressions;

// Issue with the existing code is that we really want to simply display 
//the system out println and nothing else. 
// in the two below example we would also have to create the thread object and provide the runnable interface 
// implementation which is shear wastage of time.

//WE CAN JUST CALL THE SYSTEM OUT PRINTLN WITHOUT CREATING THE RUNNABLE INTERFACE IMPLEMENTATION AS WELL 
// CREATING THE THREAD OBJECT

public class ProblemWithoutLambdaExpression {

    public static void main(String[] args) {
        
        //Option #1 by implementing runnable interface
        new Thread(new CodeToRun()).start();
        
        //Option #2 without using Runnable interface but by using anonymous classes
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Running within the CodeToRun by using Anonymous classes");
                
            }
            
        }).start();;

    }

}


//option #1 by implementing an interface
class CodeToRun implements Runnable {

    @Override
    public void run() {
        System.out.println("Running within the CodeToRun Runnable interface");
        
    }
    
}
