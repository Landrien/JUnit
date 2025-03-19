package Junit1;

import org.junit.jupiter.api.*;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileProcessorTest {
    private static final String FILE_PATH = "testfile.txt";
    private FileProcessor fileProcessor;

    @BeforeAll
    static void setUpBeforeAll() throws IOException {
        Files.createFile(Path.of(FILE_PATH));
    }

    @AfterAll
    static void tearDownAfterAll() throws IOException {
        Files.deleteIfExists(Path.of(FILE_PATH));
    }

    @BeforeEach
    void setUpBeforeEach() throws IOException {
        Files.write(Path.of(FILE_PATH), "".getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
        fileProcessor = new FileProcessor(FILE_PATH);
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Test terminé.");
    }

    @Test
    void testWriteAndRead() throws IOException {
        String data = "Hello, JUnit!";
        fileProcessor.write(data);
        Assertions.assertEquals(data, fileProcessor.read());
    }

    @Test
    void testWriteMultipleLines() throws IOException {
        String line1 = "Line 1";
        String line2 = "Line 2";
        fileProcessor.write(line1 + "\n");
        fileProcessor.write(line2);
        Assertions.assertEquals(line1 + "\n" + line2, fileProcessor.read());
    }
}
