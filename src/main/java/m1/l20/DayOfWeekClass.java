package m1.l20;

import java.util.Objects;

public class DayOfWeekClass {
    private final String name;

    public DayOfWeekClass(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        final DayOfWeekClass dayOfWeek = (DayOfWeekClass) o;
        return Objects.equals(name, dayOfWeek.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
