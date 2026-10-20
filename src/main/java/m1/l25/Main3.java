package m1.l25;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class Main3 {
    static void main() throws IOException {

        final InputStream resourceAsStream = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("l25/configuration.txt");

        try (InputStreamReader input = new InputStreamReader(resourceAsStream)) {
            while (input.ready()) {
                List<String> real = input.readAllLines();
                System.out.print(real);
            }
            System.out.println();
        }
    }
}
