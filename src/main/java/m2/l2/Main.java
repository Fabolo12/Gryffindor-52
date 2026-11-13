package m2.l2;

import m2.l2.temp.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        ArrayList<Animal> animals0 = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
//        animals0.trimToSize();
//        animals.trimToSize();
        final Bird bird = new Bird();
//        final Animal genericAnimal = new Animal("Generic Animal");

        final Animal cat = new Cat();
        cat.setName("Whiskers");
        final Animal dog = new Dog();
        dog.setName("Buddy");

        cat.sleep();
        dog.sleep();

        cat.eat();
        dog.eat();
        System.out.println(cat.toString());
        System.out.println(dog.toString());

//        cat.meow();
//        dog.bark();

        animals.add(cat);
        animals.add(dog);

        System.out.println("Polymorphism in action:");
        for (Animal animal : animals) {
            animal.lifeCycle();
        }
    }
}
