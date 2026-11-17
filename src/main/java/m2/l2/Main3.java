package m2.l2;

public class Main3 {

    static void main() {
        final Figure rectangle = new Rectangle();
        rectangle.setX(2);
        rectangle.setY(5);
        rectangle.sqeuare();

        final Box box = new Box();
        box.setBoth(3);
        box.sqeuare();
    }

    static abstract class Figure {
        protected  int x;
        protected int y;

        public int getX() {
            return x;
        }

        public void setX(final int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(final int y) {
            this.y = y;
        }

        public void sqeuare() {
            System.out.println("Square:" + (x * y));
        }
    }

    static class Rectangle extends Figure {

    }

    static class Box extends Figure {
        @Override
        public void setX(final int x) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void setY(final int y) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public void setBoth(int x) {
            super.x = x;
            super.y = x;
        }
    }
}
