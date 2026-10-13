package m1.l24;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main3 {
    static void main() {
        final String fileName = "src/main/java/m1/l24/log2.txt";

        writeToFile(fileName);
        readFromFile(fileName);
    }

    private static void readFromFile(final String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            while (reader.ready()) {
                char real = (char) reader.read();
                System.out.print(real);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeToFile(final String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            for (int i = 0; i < 10; i++) {
                writer.write("Q" + i + "\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
