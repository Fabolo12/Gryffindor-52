package m1.l18;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Main1 {
    static void main() {
        final Set<Cat> cats = new LinkedHashSet<>();
        final Cat barsik = new Cat("Barsik", 5);
        final Cat murzik = new Cat("Murzik", 3);
        final Cat vaska1 = new Cat("Vaska", 7);
        final Cat vaska2 = new Cat("Vaska", 7);

        cats.add(barsik);
        cats.add(murzik);
        cats.add(vaska1);
        cats.add(vaska2);

        System.out.println("Hash code for barsik: " + barsik.hashCode());
        System.out.println("Hash code for murzik: " + murzik.hashCode());
        System.out.println("Hash code for vaska1: " + vaska1.hashCode());
        System.out.println("Hash code for vaska2: " + vaska2.hashCode());

        System.out.println("Set of cats: " + cats);
    }

    static class Cat {
        String name;

        int age;

        public Cat(final String name, final int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(final Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            final Cat cat = (Cat) o;
            return age == cat.age && Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }
}
