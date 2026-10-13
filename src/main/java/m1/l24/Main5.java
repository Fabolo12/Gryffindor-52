package m1.l24;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main5 {
    static void main() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"))) {
            for (int i = 0; i < 10; i++) {
                String message = "Привіт Аміго!";
                bufferedWriter.write(message);
            }
            bufferedWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
