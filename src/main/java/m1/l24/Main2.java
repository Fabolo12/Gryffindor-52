package m1.l24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
    static void main() {
        // D:\Works\Gryffindor-52\src\main\java\m1\l24\Main2.java -> absolute path
        // src/main/java/m1/l24/Main2.java -> relative path

        final String fileName = "src/main/java/m1/l24/log.txt";
        final String fileToRead = "l24/log.txt";

//        writeFile(fileName);
        readFile(fileToRead);
    }

    private static void writeFile(final String fileName) {
        try(FileOutputStream output = new FileOutputStream(fileName, true)) {
            for (int i = 0; i < 10; i++) {
                output.write(i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readFile(final String fileName) {
        try(FileInputStream input = new FileInputStream(fileName)) {
            while (input.available() > 0) {
                int real = input.read();
                System.out.print(real);
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
