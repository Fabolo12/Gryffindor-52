package m1.l12.temp;

public class Building {
    private int floors = 10;

    private int doors = 6;

    public String address = "123 Main Street";

    public void printStreet() {
        System.out.println("The building is located at " + address);
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(final int floors) {
        this.floors = floors;
    }

    public void setDoors(final int doors) {
        if (doors < 0) {
            this.doors = 1;
        } else {
            this.doors = doors;
        }
    }

    public int getDoors() {
        if (doors == 1) {
            return 5;
        }

        return doors;
    }

    private void buildFloor() {

    }

    private void buildDoor() {

    }

    private void setAdress() {

    }

    public void buildFull() {
        buildFloor();
        buildFloor();
        buildFloor();
        buildDoor();
        setAdress();
        System.out.println();
    }
}
