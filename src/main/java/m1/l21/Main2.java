package m1.l21;

public class Main2 {
    static void main() {
        singup();
    }

    private static void singup() {
        try {
            getUser(true);
        } catch (UserExistedException e) {
            System.out.println("User already exists");
            e.printStackTrace();
        }
    }

    private static boolean getUser(final boolean exist) {
        if (exist) {
            throw new UserExistedException();
        }
        return true;
    }

    static class UserExistedException extends RuntimeException {
    }

    static class BannedUserException extends UserExistedException {
    }
}
