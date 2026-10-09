package m1.l20;

import java.util.List;

public class Main {
    static void main() {
        useClass();
        System.out.println("--------------------");
        useEnum();
    }

    private static void useEnum() {
        System.out.println("Using DayOfWeek enum:");
        final List<DayOfWeek> daysOfWeek = List.of(
                DayOfWeek.MONDAY,
                DayOfWeek.TUESDAY,
                DayOfWeek.WEDNESDAY,
                DayOfWeek.THURSDAY,
                DayOfWeek.FRIDAY,
                DayOfWeek.SATURDAY,
                DayOfWeek.SUNDAY
        );

        for (final DayOfWeek day : daysOfWeek) {
            System.out.println(day);
        }

        final boolean isMonday1 = DayOfWeek.MONDAY.equals(DayOfWeek.MONDAY);
        System.out.println("DayOfWeek.MONDAY.equals(DayOfWeek.MONDAY): " + isMonday1);

        final boolean isMonday2 = DayOfWeek.MONDAY == DayOfWeek.MONDAY;
        System.out.println("DayOfWeek.MONDAY == DayOfWeek.MONDAY: " + isMonday2);
    }

    private static void useClass() {
        System.out.println("Using DayOfWeekClass:");
        final DayOfWeekClass monday1 = new DayOfWeekClass("Monday");
        final DayOfWeekClass monday2 = new DayOfWeekClass("Monday");

        final List<DayOfWeekClass> daysOfWeek = List.of(
                monday1,
                new DayOfWeekClass("Tuesday"),
                new DayOfWeekClass("Wednesday"),
                new DayOfWeekClass("Thursday"),
                new DayOfWeekClass("Friday"),
                new DayOfWeekClass("Saturday"),
                new DayOfWeekClass("Sunday")
        );

        for (final DayOfWeekClass day : daysOfWeek) {
            System.out.println(day);
        }

        final boolean isMonday = monday1.equals(monday2);
        System.out.println("monday1.equals(monday2): " + isMonday);
    }
}
