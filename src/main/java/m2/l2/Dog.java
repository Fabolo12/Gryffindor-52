package m2.l2;

import m2.l2.temp.Animal;

public class Dog extends Animal {

    public Dog(final String name) {
        super(name);
    }

    public Dog() {
        this("");
    }

    public static void test() {
        System.out.println("Dog test method");
    }

    @Override
    public void makeSound() {
        Animal.test();
        sleep();
        System.out.println("Dog is barking");
    }
}
