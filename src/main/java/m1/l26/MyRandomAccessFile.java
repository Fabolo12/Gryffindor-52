package m1.l26;

import java.io.RandomAccessFile;

public class MyRandomAccessFile {
    private MyRandomAccessFile() {

    }

    public static RandomAccessFile open(String path, RandomAccessFileMode mode) throws Exception {
        return new RandomAccessFile(path, mode.name());
    }
}
