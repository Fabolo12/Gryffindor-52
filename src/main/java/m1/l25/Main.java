package m1.l25;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    static void main() throws IOException, ClassNotFoundException {
        final Box box1 = Box.createBox(10);
        System.out.println("Initial box: " + box1);

        String file = "src/main/java/m1/l25/log.txt";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(box1);

        final FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(out.toByteArray());

        final FileInputStream inputStream = new FileInputStream(file);
        final byte[] bytes = inputStream.readAllBytes();

        ObjectInputStream ois = new ObjectInputStream(
                new ByteArrayInputStream(bytes)
        );
        Box copy = (Box) ois.readObject();
        System.out.println("Copy box: " + copy);
    }

    private static void method2() throws IOException, ClassNotFoundException {
        final Box box1 = Box.createBox(20);
        final Box box2 = Box.createBox(10);
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box1 == box2);

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(box1);

        ObjectInputStream ois = new ObjectInputStream(
                new ByteArrayInputStream(out.toByteArray())
        );
        Box copy = (Box) ois.readObject();
        System.out.println(copy);
        System.out.println(box1 == copy);
    }

    private static void metrhod1() {
        byte[] array = {1, 2, 3, 4};

        try (ByteArrayInputStream input = new ByteArrayInputStream(array)) {
            for (int i = 0; i < array.length; i++) {
                int data = input.read();
                System.out.print(data + ", ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
