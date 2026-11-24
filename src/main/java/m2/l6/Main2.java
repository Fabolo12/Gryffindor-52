package m2.l6;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {

    static void main() {
        final People john = createPeople("John", "123-456-7890", "987-654-3210");
        final People alice = createPeople("Alice", "555-123-4567");
        final People bob = createPeople("Bob", "111-222-3333", "444-555-6666", "777-888-9999");

        Stream.of(john, alice, bob)
//                .map(people -> people.phones) ERROR IN THIS CASE
                .flatMap(people -> people.phones.stream())
                .filter(phone -> !phone.contains("123"))
                .forEach(System.out::println);


        Stream.of(john, alice, bob)
                .peek(people -> people.phones = people.phones.stream()
                        .filter(p -> !p.contains("123"))
                        .toList())
                .sorted((p1, p2) -> Integer.compare(p2.phones.size(), p1.phones.size()))
                .sorted(Comparator.comparingInt(p -> p.phones.size()))
                .forEach(System.out::println);
    }

    private static People createPeople(final String name, final String... phones) {
        final People people = new People();
        people.name = name;
        people.phones = List.of(phones);
        return people;
    }

    static class People {
        public String name;
        public List<String> phones;

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", phones=" + phones +
                    '}';
        }
    }
}
