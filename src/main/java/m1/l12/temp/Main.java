package m1.l12.temp;

public class Main {
    static void main() {
        final Building building0 = new Building();
        building0.buildFull();

        final Building building1 = new Building();
        building1.setFloors(10);

        final Building building2 = new Building();
        building2.setDoors(-6);
        building2.address = "456 Elm Street";

        final Building building3 = new Building();

        System.out.println("Building 1 has " + building1.getFloors() + " floors.");
        System.out.println("Building 1 has " + building1.getDoors() + " doors.");
        building1.printStreet();

        System.out.println("Building 2 has " + building2.getFloors() + " floors.");
        System.out.println("Building 2 has " + building2.getDoors() + " doors.");
        building2.printStreet();

        building3.printStreet();

        System.out.println();
        System.out.println();

        Building[] buildings = {building2, building1, building0, building3};

        for (int i = 0; i < buildings.length; i++) {
            buildings[i].printStreet();
        }
    }
}
