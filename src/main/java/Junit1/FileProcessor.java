package Junit1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileProcessor {
    private String filePath;

    public FileProcessor(String filePath) {
        this.filePath = filePath;
    }

    public void write(String data) throws IOException {
        Files.write(Paths.get(filePath), data.getBytes(), StandardOpenOption.APPEND);
    }

    public String read() throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}