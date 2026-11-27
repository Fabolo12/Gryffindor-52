package m2.l7;

public abstract class Animal {
    private final AnimalType animalType;

    public Animal(final AnimalType animalType) {
        this.animalType = animalType;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public abstract void makeSound();

    public void eat() {
        System.out.println("Animal is eating");
    }
}
