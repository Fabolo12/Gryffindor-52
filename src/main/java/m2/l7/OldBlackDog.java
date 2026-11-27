package m2.l7;

public class OldBlackDog extends  BlackDog {
    public OldBlackDog(final AnimalType animalType) {
        super(animalType);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof! Woof!");
    }
}
