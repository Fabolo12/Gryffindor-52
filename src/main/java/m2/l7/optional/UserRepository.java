package m2.l7.optional;

import java.time.LocalDate;
import java.util.Optional;

public class UserRepository {
    public User getUser(boolean flag) {
        return flag ? new User(18, "John Doe") : new UserEmpty();
    }

    public LocalDate getDate(boolean flag) {
        return flag ? LocalDate.now() : null;
    }

    public Optional<User> findUser(boolean flag) {
        return flag ? Optional.of(new User(18, "John Doe")) : Optional.empty();
    }
}
