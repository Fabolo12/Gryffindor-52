package m1.l13;

public class Main {
    static void main() {
        final Point point = new Point(0, 0, 0);
        point.getX();
        point.getY();
        point.getZ();
        System.out.println(point);

        final RecordPoint recordPoint = new RecordPoint(0, 0, 0);
        recordPoint.x();
        recordPoint.y();
        recordPoint.z();
        System.out.println(recordPoint);


    }
}
