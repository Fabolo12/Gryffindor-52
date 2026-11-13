package m2.l2;

import m2.l2.temp.Animal;

public class Cat extends Animal {

    private String name;

    public Cat(final String name) {
        super(name);
        this.name = name;
    }

    public Cat() {
        this("");
        super.name = "";
        super.eat();
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    public void eat(String food) {
        System.out.println("Cat is eating " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is meowing");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
