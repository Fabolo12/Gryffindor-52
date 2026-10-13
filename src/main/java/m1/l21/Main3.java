package m1.l21;

public class Main3 {
    static void main() {
        String email = "admin@test.com";
        proxyLogin(email);
        proxySignup(email);
    }

    private static void proxySignup(final String email) {
        try {
            singup(email);
        } catch (IllegalStateException e) {
            System.out.println("User already with email: " + email + " exists");
            throw e;
        }
    }

    private static void proxyLogin(final String email) {
        try {
            login(email);
        } catch (UserNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void singup(final String email) {
        final boolean isExisted = findUser(email);
        if (isExisted) {
            throw new IllegalStateException("User already exists");
        }
    }

    private static void login(final String email) throws UserNotFoundException {
        final boolean isExisted = findUser(email);

        if (!isExisted) {
            throw new UserNotFoundException();
        }
    }


    private static boolean findUser(final String email) {
        return email.contains("admin");
    }

    static class UserNotFoundException extends Exception {
    }

}
