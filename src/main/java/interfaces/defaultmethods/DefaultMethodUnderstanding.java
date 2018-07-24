package interfaces.defaultmethods;

public class DefaultMethodUnderstanding implements DefaultInterface {

    @Override
    public void defaultInterfaceMethodFirst() {
        System.out.println("defaultInterfaceMethodFirst over-ridden in implementor class");
    }

    public static void main(String[] args) {
        DefaultMethodUnderstanding defaultUnderstanding = new DefaultMethodUnderstanding();
        defaultUnderstanding.defaultInterfaceMethodFirst();
        defaultUnderstanding.defaultInterfaceMethodSecond();
        
    }

}

interface DefaultInterface {
    default void defaultInterfaceMethodFirst() {
        System.out.println("default void defaultInterfaceMethodFirst()");
    };

    default void defaultInterfaceMethodSecond() {
        System.out.println("default void defaultInterfaceMethodSecond()");
    }

}
