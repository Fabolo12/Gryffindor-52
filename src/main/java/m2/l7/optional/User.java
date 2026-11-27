package m2.l7.optional;

public class User {
    public int age;
    public String name;
    private boolean active;

    public User(final int age, final String name) {
        this.age = age;
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(final boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", active=" + active +
                '}';
    }
}
