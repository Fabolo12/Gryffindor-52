package m2.l7;

public class Main2 {
    static void main() {
        final Cat cat = new Cat(AnimalType.CAT);
        cat.setAge(5);
        final Animal animal1 = cat;

        final Dog dog = new Dog(AnimalType.DOG);
        dog.setName("Buddy");
        final Animal animal2 = dog;

        final Cat newCat = (Cat) animal1;
        System.out.println("New cat age: " + newCat.getAge());

        final Dog newDog = (Dog) animal2;
        System.out.println("New dog name: " + newDog.getName());

        final Cat newCatError = (Cat) animal2;
    }
}
