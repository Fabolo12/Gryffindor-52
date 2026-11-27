package m2.l7;

public class Dog extends Animal {

    private String name;

    public Dog(final AnimalType animalType) {
        super(animalType);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching");
    }
}
