package m2.l2.temp;

public abstract class Animal extends Object {

    protected String name;

    public Animal(final String name) {
        this.name = name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal " + name + " is eating");
    }

    public void sleep() {
        System.out.println("Animal " + name + " is sleeping");
    }

    public static void test() {
        System.out.println("Animal test method");
    }

    public abstract void makeSound();

    public final void lifeCycle() {
        eat();
        sleep();
        makeSound();
    }
}
