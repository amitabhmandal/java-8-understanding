package interfaces.defaultmethods;

public class DefaultMethodsMultipleInheritance implements LeftDefault, RightDefault {

    
    public void diamondMethodProblem() {
        
        //Option 1: PROVIDE NEW IMPLEMENTATION
        System.out.println("Class Implementation called ");
        
        //Option 2 : USE LEFT INTERFACE IMPLEMENTATION
        LeftDefault.super.diamondMethodProblem();
        //OR
        //OPTION 2: USE RIGHT INTERFACE IMPLEMENTATION
        RightDefault.super.diamondMethodProblem();
        
    }
    public static void main(String[] args) {
        DefaultMethodsMultipleInheritance df = new DefaultMethodsMultipleInheritance();
        df.diamondMethodProblem();

    }
    
    //THIS CAN BE SOLVED IN TWO 
    
    //OPTION 1: PROVIDE YOUR OWN IMPLEMENTATION AND DONT CALL THE PARENT INTERFACE METHODS
    
    //OPTION 2: DEFAULT IMPLEMENTATION U REQUIRE, CALL THAT METHOD 
    // LeftDefault.super.diamondMethodProblem(); OR 
    // RightDefault.super.diamondMethodProblem();

    /*
     * THIS LEADS TO AMBIGUITY PROBLEM AS THEN WHICH IMPLEMENTATION THE CLASS SHALL BE
     * BE CALLING
     * 
     * Duplicate default methods named diamondMethodProblem with the parameters () and () 
     * are inherited from the types RightDefault and LeftDefault
     *
     *
     *
     *
    @Override
    public void diamondMethodProblem() {
        // TODO Auto-generated method stub
        LeftDefault.super.diamondMethodProblem();
    }
    
    @Override
    public void diamondMethodProblem() {
        // TODO Auto-generated method stub
        RightDefault.super.diamondMethodProblem();
    }
    
    */

}

interface LeftDefault {

    default void diamondMethodProblem() {
        System.out.println("LeftDefault : default void diamondMethodProblem()");
    }

}

interface RightDefault {

    default void diamondMethodProblem() {
        System.out.println("RightDefault : default void diamondMethodProblem()");
    }

}