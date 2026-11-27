package m2.l7.optional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Main {
    static void main() {
        final User user = new User(20, "John Doe");
//        final Optional<User> userOptional = Optional.of(user);
        final Optional<User> userOptional = Optional.empty();

        System.out.println("Is user present: " + userOptional.isPresent());
        System.out.println("Is user empty: " + userOptional.isEmpty());

        userOptional.ifPresent(u -> System.out.println("User is present: " + u));

        final User userTarget1 = userOptional.orElse(new User(0, "Default User"));
        System.out.println("User target1: " + userTarget1);

        final User userTarget2 = userOptional.orElseGet(Main::createDefaultUser);
        System.out.println("User target2: " + userTarget2);

        final User user1 = Objects.requireNonNullElse(null, userTarget1);
        final User user2 = Objects.requireNonNullElseGet(null, Main::createDefaultUser);
        System.out.println("User1: " + user1);
        System.out.println("User2: " + user2);

        try {
            final User user3 = userOptional.orElseThrow(() -> new RuntimeException("User not found!"));
            System.out.println("User3: " + user3);
        } catch (RuntimeException e) {
            System.err.println("Exception: " + e.getMessage());
        }

        if (userOptional.isPresent()) {
            final User user3 = userOptional.get();
            System.out.println("User3: " + user3);
        }
        userOptional.ifPresent(u -> System.out.println("User3: " + u));

        userOptional
                .filter(u -> u.age > 18)
                .map(u -> u.name)
                .flatMap(name -> Optional.of(name.toUpperCase()))
                .ifPresent(u -> System.out.println("User " + u + " is adult"));

        List.of(1, 2, 3, 4, 5)
                .stream()
                .filter(i -> i % 2 == 0)
                .map(i -> "" + i)
                .findAny()
                .map(Integer::parseInt)
                .ifPresent(System.out::println);

        final Optional<User> userOptional1 = userOptional
                .or(() -> Optional.of(new User(0, "Default User")));
        System.out.println("User optional1: " + userOptional1);

        userOptional.ifPresent(u -> System.out.println("User is present: " + u));
        final int count = 10;
        userOptional.ifPresentOrElse(
                u -> System.out.println("User is present: " + u + ", count: " + count),
                () -> System.out.println("User is not present")
        );
//        count = 20; ERROR in lambda
    }

    private static User createDefaultUser() {
        System.out.println("Creating default user...");
        return new User(0, "Default User");
    }
}
