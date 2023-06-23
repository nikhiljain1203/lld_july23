package Inheritance;

public class Client {
    public static void main(String[] args) {
        D d = new D();
        d.doSomething();
        d.doSomething("Nikhil");
        d.age = 10;
        //d.doSomething();

        A a = d;
        a.age = 20;

        d.doSomething();

        //d.foo.goo.koo



    }
}
