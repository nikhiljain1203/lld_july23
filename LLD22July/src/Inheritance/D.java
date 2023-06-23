package Inheritance;

public class D extends C{
    int age = 0;
    D() {
        super();
        System.out.println("Object of D got created");

    }

    void doSomething() {
        System.out.println("Print Scaler");
    }
}
