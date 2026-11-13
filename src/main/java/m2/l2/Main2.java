package m2.l2;

import m2.l2.temp.Animal;

public class Main2 {
    static void main() {
        final Dog a = new Dog();
        final Animal b = a;
        if (b instanceof Dog) {
            final Dog c = (Dog) b;
        }
    }
}
