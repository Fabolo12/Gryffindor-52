package m2.l3;

import java.util.Random;

public class Main {

    static void main() {
        final Car car = new Car(new TermostatFaringate());
        car.showTemperature();
    }

    abstract static class Termostat {
        public abstract void showTemperature();
    }

    static class TermostatCelcius extends Termostat {
        private Random random = new Random();

        public void showTemperature() {
            System.out.println("Temperature is " + (random.nextInt(40) - 10) + " C degrees");
        }
    }

    static class TermostatFaringate extends Termostat {
        private Random random = new Random();

        public void showTemperature() {
            System.out.println("Temperature is " + (random.nextInt(40) - 10) + " F degrees");
        }
    }

    static class Car implements Comparable<Car> {
        private final Termostat termostat;

        public Car(final Termostat termostat) {
            this.termostat = termostat;
        }

        public void showTemperature() {
            termostat.showTemperature();
        }

        @Override
        public int compareTo(final Car o) {
            return 0;
        }
    }
}
