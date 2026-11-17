package m2.l3;

public class Server implements MyInterface, ExternalClient {
    @Override
    public void doSomething() {

    }

    public void method1() {
        System.out.println("Method 1");
    }

    public void method2() {
        System.out.println("Method 2");
    }

    public void method3() {
        System.out.println("Method 3");
    }

    @Override
    public void method4() {
        System.out.println("Method 4");
    }

    @Override
    public void method5() {
        System.out.println("Method 5");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing Server");
    }
}
