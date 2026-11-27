package m2.l7.optional;

import java.util.Optional;

public class UserService {

    static void main() {
        new UserService().showUserDetails(false);
    }

    private final UserRepository userRepository = new UserRepository();

    public void showUserDetails(boolean flag) {
        userRepository.findUser(flag).ifPresent(user -> System.out.println("User Details: " + user));
    }

    // Bed example of using Optional in method parameters
    public void save(final Optional<User> userOptional) {
        userOptional.ifPresent(user -> System.out.println("Saving user: " + user));
    }

}
