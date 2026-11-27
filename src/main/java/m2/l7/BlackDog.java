package m2.l7;

public class BlackDog extends Dog {
    public BlackDog(final AnimalType animalType) {
        super(animalType);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
