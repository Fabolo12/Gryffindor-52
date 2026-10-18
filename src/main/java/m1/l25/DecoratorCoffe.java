package m1.l25;

public class DecoratorCoffe {

    static void main() {
        SimpleCoffee coffee = new SimpleCoffee();
        System.out.println(coffee.description() + " = " + coffee.cost());

        MilkDecorator milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(milkCoffee.description() + " = " + milkCoffee.cost());

        SugarDecorator sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(sugarMilkCoffee.description() + " = " + sugarMilkCoffee.cost());

        SugarDecorator twoSugarMilkCoffee = new SugarDecorator(
                new SugarDecorator(new MilkDecorator(new SimpleCoffee()))
        );
        System.out.println(twoSugarMilkCoffee.description() + " = " + twoSugarMilkCoffee.cost());
    }

    interface Coffee {
        int cost();

        String description();
    }

    static class SimpleCoffee implements Coffee {
        public int cost() {
            return 100;
        }

        public String description() {
            return "Кофе";
        }
    }

    static class MilkDecorator implements Coffee {
        private Coffee coffee; // объект, который оборачиваем

        public MilkDecorator(Coffee coffee) {
            this.coffee = coffee;
        }

        public int cost() {
            return coffee.cost() + 30;
        }

        public String description() {
            return coffee.description() + " + молоко";
        }
    }

    static class SugarDecorator implements Coffee {
        private Coffee coffee;

        public SugarDecorator(Coffee coffee) {
            this.coffee = coffee;
        }

        public int cost() {
            return coffee.cost() + 10;
        }

        public String description() {
            return "цукор " + coffee.description();
        }
    }

}
