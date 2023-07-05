package FunctionalInterface;

public class Client {
    public static void main(String[] args) {
//        FuncInterface fn = new FIImpl();
//        fn.foo();

        FuncInterface fn1 = new FuncInterface() {
            @Override
            public void foo() {
                System.out.println("Anonymus Class");
            }
        };
        fn1.foo();
    }
}
