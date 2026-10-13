package m1.l24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    static void main() {

        try (SmallBox smallBox = new SmallBox();
             Box box = new Box(smallBox)) {
            System.out.println("Hello");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void writeToFile() {
        String path = "c:\\projects\\log.txt";

        try (FileInputStream inputStream = new FileInputStream(path);
             FileOutputStream outputStream = new FileOutputStream(path);
             Box box = new Box(new SmallBox())) {
            inputStream.read();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void writeToFileOld() {
        FileInputStream inputStream = null;

        try {
            String path = "c:\\projects\\log.txt";
            inputStream = new FileInputStream(path);
            inputStream.read();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class Box implements AutoCloseable {

        private SmallBox smallBox;

        public Box(final SmallBox smallBox) {
            this.smallBox = smallBox;
        }

        @Override
        public void close() throws Exception {
            System.out.println("Closing box");
        }
    }

    static class SmallBox implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("Closing small box");
        }
    }
}
