package m1.l26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import java.util.List;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import static java.nio.file.StandardOpenOption.WRITE;

public class Main {
    static void main() throws Exception {
        Path log = Path.of("src/main/java/m1/l26/app.log");
        createSampleLog(log);

        int errors = extractErrors(log, Path.of("src/main/java/m1/l26/errors.txt"));
        System.out.println("Найдено ошибок: " + errors);

        Path backup = backup(log, Path.of("src/main/java/m1/l26/backup"));
        boolean same = Files.mismatch(log, backup) == -1;   // -1 значит, что файлы идентичны
        System.out.println("Бэкап создан: " + backup + ", совпадает: " + same);

        System.out.println("Последние записи лога:");
        System.out.println(tail(log, 120));

//        RandomAccessFile randomAccessFile1 = new RandomAccessFile("text.txt", "rw");
//        RandomAccessFile randomAccessFile2 = MyRandomAccessFile.open("text.txt", RandomAccessFileMode.RW);
    }

    static void createSampleLog(Path log) throws IOException {
        Files.write(log, List.of(
                "2026-10-20 10:00:01 INFO  Server started",
                "2026-10-20 10:00:05 ERROR Database connection failed",
                "2026-10-20 10:00:07 INFO  Retrying connection",
                "2026-10-20 10:00:09 ERROR Timeout on payment service",
                "2026-10-20 10:00:12 INFO  Request processed"));
    }

    static int extractErrors(Path log, Path report) throws IOException {
        int count = 0;
        try (BufferedReader reader = Files.newBufferedReader(log);
             BufferedWriter writer = Files.newBufferedWriter(report)) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("ERROR")) {
                    writer.write(line);
                    writer.newLine();
                    count++;
                }
            }
        }
        return count;
    }

    static Path backup(Path source, Path dir) throws IOException {
        Files.createDirectories(dir);
        String stamp = new Date().getTime() + ""; // метка времени
        Path target = dir.resolve(stamp + "_" + source.getFileName());

        try (FileChannel in = FileChannel.open(source, READ);
             FileChannel out = FileChannel.open(target, CREATE, WRITE, TRUNCATE_EXISTING)) {
            long pos = 0;
            long size = in.size();
            while (pos < size) {
                pos += in.transferTo(pos, size - pos, out); // может скопировать не всё за раз
            }
        }
        return target;
    }

    static String tail(Path file, int bytes) throws IOException {
        try (FileChannel channel = FileChannel.open(file, READ)) {
            long start = Math.max(0, channel.size() - bytes);
            channel.position(start);                         // переходим ближе к концу

            ByteBuffer buffer = ByteBuffer.allocate(bytes);
            while (buffer.hasRemaining()) {
                if (channel.read(buffer) == -1) {            // канал → буфер
                    break;
                }
            }
            buffer.flip();                                   // режим чтения
            String text = StandardCharsets.UTF_8.decode(buffer).toString();

            // мы могли попасть в середину строки, поэтому отбрасываем её начало
            if (start > 0) {
                text = text.substring(text.indexOf('\n') + 1);
            }
            return text;
        }
    }

}
