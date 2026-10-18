package m1.l25;

public class Decorator {

    static void main() {
        final BasicCar basicCar = new BasicCar();
        basicCar.assemble();
        System.out.println();

        final SportsCarDecorator sportsCarDecorator = new SportsCarDecorator(basicCar);
        sportsCarDecorator.assemble();
        System.out.println();

        final LuxuryCarDecorator luxuryCarDecorator = new LuxuryCarDecorator(basicCar);
        luxuryCarDecorator.assemble();
        System.out.println();

        new SportsCarDecorator(new LuxuryCarDecorator(new SportsCarDecorator(new BasicCar()))).assemble();
        System.out.println();

        new TruckDecorator(new SportsCarDecorator(new BasicCar())).assemble();
        System.out.println();
    }

    interface Car {
        void assemble();
    }

    static class BasicCar implements Car {
        @Override
        public void assemble() {
            System.out.print("Basic Car.");
        }
    }

    static class CarDecorator implements Car {
        protected Car car;

        public CarDecorator(Car car) {
            this.car = car;
        }

        @Override
        public void assemble() {
            this.car.assemble();
        }
    }

    static class SportsCarDecorator extends CarDecorator {
        public SportsCarDecorator(Car car) {
            super(car);
        }

        @Override
        public void assemble() {
            super.assemble();
            System.out.print(" Adding features of Sports Car.");
        }
    }

    static class LuxuryCarDecorator extends CarDecorator {
        public LuxuryCarDecorator(Car car) {
            super(car);
        }

        @Override
        public void assemble() {
            super.assemble();
            System.out.print(" Adding features of Luxury Car.");
        }
    }

    static class TruckDecorator extends CarDecorator {
        public TruckDecorator(Car car) {
            super(car);
        }

        @Override
        public void assemble() {
            super.assemble();
            System.out.print(" Adding features of Truck.");
        }
    }
}
