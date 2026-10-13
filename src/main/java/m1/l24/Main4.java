package m1.l24;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main4 {
    static void main() {
        String src = "src/main/java/m1/l24/log.txt";
//        readReader(src);
        readBufferedReader(src);

        final Scanner scanner = new Scanner(System.in);
        final BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        try {
            buff.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readReader(final String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            while (reader.ready()) {
                int c = reader.read();
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readBufferedReader(final String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                String line = reader.readLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
