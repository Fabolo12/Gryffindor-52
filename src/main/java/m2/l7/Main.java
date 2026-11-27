package m2.l7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        final List<Animal> animals = createAnimals();
        for (Animal animal : animals) {
            System.out.println("Animal type: " + animal.getClass().getSimpleName());

            animal.makeSound();
            if (animal instanceof Dog dog) {
                dog.fetch();
            } else if (animal instanceof Cat) {
                ((Cat) animal).scratch();
            }

            if (animal.getAnimalType() == AnimalType.DOG) {
                ((Dog) animal).fetch();
            } else if (animal.getAnimalType() == AnimalType.CAT) {
                ((Cat) animal).scratch();
            }

            final boolean isBlackDog = animal instanceof BlackDog;
            System.out.println("Is black dog: " + isBlackDog);
            System.out.println();
        }

        switch (animals) {
            case Cat c -> System.out.println("It's a cat!");
            case Dog d -> System.out.println("It's a dog!");
            default -> throw new IllegalStateException("Unexpected value: " + animals);
        }

        final Animal first = animals.getFirst();
        switch (first.getAnimalType()) {
            case CAT ->  System.out.println("It's a cat!");
            case DOG -> System.out.println("It's a dog!");
        }
    }

    private static List<Animal> createAnimals() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog(AnimalType.DOG));
        animals.add(new Cat(AnimalType.CAT));
        animals.add(new BlackDog(AnimalType.DOG));
        animals.add(new OldBlackDog(AnimalType.DOG));
        return animals;
    }
}
