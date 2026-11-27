package m2.l7;

public class Cat extends  Animal {

    private int age;

    public Cat(final AnimalType animalType) {
        super(animalType);
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void scratch() {
        System.out.println("Cat is scratching");
    }
}
