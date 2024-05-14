package test;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(new FileInputStream("test.txt").toString().getBytes());
        inputStream.mark(0);
        inputStream.reset();
    }
}
