package m1.l27;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

    static void main() {
        LocalTime[] incoming = {
                LocalTime.of(10, 15),
                LocalTime.of(16, 0),
                LocalTime.of(23, 45),
                LocalTime.of(0, 10)
        };
        for (LocalTime t : incoming) {
            System.out.println(t + " -> " + route(t));
        }
    }

    static String route(LocalTime t) {
        final LocalTime CUT_OFF = LocalTime.of(16, 0);
        final LocalTime MAINT_START = LocalTime.of(23, 30);
        final LocalTime MAINT_END = LocalTime.of(0, 30);

        if (inWindow(t, MAINT_START, MAINT_END)) {
            return "отклонён: техработы";
        }
        if (t.isBefore(CUT_OFF)) {
            return "исполнить сегодня";
        }
        return "исполнить в следующий рабочий день";
    }

    // Окно может переходить через полночь
    static boolean inWindow(LocalTime t, LocalTime start, LocalTime end) {
        if (start.isBefore(end)) {
            return !t.isBefore(start) && t.isBefore(end);
        }
        return !t.isBefore(start) || t.isBefore(end); // например, 23:30–00:30
    }


    private static void exemple4() {
        double penaltyRate = 0.001;
        LocalDate start = LocalDate.of(2024, Month.MARCH, 1); // 15.03.2024
        LocalDate start2 = LocalDate.of(2024, Calendar.MARCH, 1); // 15.02.2024

        // График: clone() больше не нужен, LocalDate неизменяемый
        for (int i = 0; i < 5; i++) {
            final LocalDate newDate = start.plusMonths(i);

            final LocalDate monday;
            if (newDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
                monday = newDate.plusDays(2);
            } else if (newDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                monday = newDate.plusDays(1);
            } else {
                monday = newDate;
            }

            System.out.println("Платёж " + i + ": " + monday + " (" + monday.getDayOfWeek() + ")");
        }

        // Пеня: дни считаем через epochDay, а не через миллисекунды
        LocalDate due = LocalDate.of(2024, 3, 20);
        LocalDate paid = LocalDate.of(2024, 4, 5);
        long days = paid.toEpochDay() - due.toEpochDay();
        System.out.printf("Просрочка: %d дн., пеня: %.2f%n", days, 1500 * penaltyRate * days);
    }

    private static void exemple3() throws InterruptedException {
        final long start = new Date().getTime();
        Thread.sleep(1000);
        final long end = new Date().getTime();
        System.out.println("Прошло: " + ((end - start) / 1000) + " с");
    }

    private static void exemple2() {
        SimpleDateFormat fmt = new SimpleDateFormat("dd.MM.yyyy");
        Calendar start = new GregorianCalendar(2024, Calendar.JANUARY, 31); // дата выдачи кредита

        for (int i = 0; i < 6; i++) {
            Calendar payDate = (Calendar) start.clone(); // копия, чтобы не менять start
            payDate.add(Calendar.MONTH, i);              // всегда считаем от даты выдачи
            int dow = payDate.get(Calendar.DAY_OF_WEEK);
            if (dow == Calendar.SATURDAY) {
                payDate.add(Calendar.DAY_OF_MONTH, 2);
            } else if (dow == Calendar.SUNDAY) {
                payDate.add(Calendar.DAY_OF_MONTH, 1);
            }

            System.out.println("Платёж " + i + ": " + fmt.format(payDate.getTime()));
        }

        Calendar c = new GregorianCalendar(2024, Calendar.JANUARY, 31);
        System.out.println(fmt.format(c.getTime()));
        for (int i = 1; i <= 6; i++) {
            c.add(Calendar.MONTH, 1);
            System.out.println(fmt.format(c.getTime()));
            final int leastMaximum = c.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println("leastMaximum: " + leastMaximum);
        }
    }

    private static void exemple1() {
        final long MS_PER_DAY = 24L * 60 * 60 * 1000;
        final double PENALTY_RATE = 0.001; // 0.1% в день
        final SimpleDateFormat FMT = new SimpleDateFormat("dd.MM.yyyy");

        double amount = 1500.00;
        Date dueDate = new Date(124, Calendar.MARCH, 10);  // 10.03.2024 — срок оплаты
        Date paidDate = new Date(124, 2, 25);  // 25.03.2024 — фактическая оплата

        System.out.println("Срок оплаты: " + FMT.format(dueDate));
        System.out.println("Оплачено:    " + FMT.format(paidDate));

        if (paidDate.after(dueDate)) {
            long days = (paidDate.getTime() - dueDate.getTime()) / MS_PER_DAY;
            double penalty = amount * PENALTY_RATE * days;
            System.out.println("Просрочка: " + days + " дн.");
            System.out.printf("Пеня: %.2f%n", penalty);
        } else {
            System.out.println("Оплачено вовремя");
        }
    }

    private static void method1() throws InterruptedException {
        final Date date1 = new Date();
        Thread.sleep(10);
        final Date date2 = new Date();

        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);
        System.out.println("date1 == date2: " + (date1 == date2)); // +/- 500 ms
        System.out.println("date1.equals(date2): " + date1.equals(date2));
        System.out.println("date1.getTime(): " + date1.getTime());
        System.out.println("date2.getTime(): " + date2.getTime());
        System.out.println("date1.compareTo(date2): " + date1.compareTo(date2));
        System.out.println("date1.after(date2): " + date1.after(date2));
        System.out.println("date1.before(date2): " + date1.before(date2));

        SimpleDateFormat formatter = new SimpleDateFormat("MMM-dd-YYYY", Locale.ENGLISH);
        System.out.println("date1 formatted: " + formatter.format(date1));
    }
}
