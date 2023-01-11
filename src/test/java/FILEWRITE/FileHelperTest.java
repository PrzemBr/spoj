package FILEWRITE;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class FileHelperTest {

    private FileToWrite fileToWrite;

    @Before
    public void prepare(){
        String path = "D:\\dev\\spoj\\src\\main\\resources\\";
        String fileName = "fileToWrite.txt";
        fileToWrite = new FileToWrite(path + fileName);
    }

    @Test
    void shouldCollectFileName() {
        String testInput = "fileName";
        InputStream testStream = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(testStream);
        FileHelper fileHelper = new FileHelper();
        try {
            assertEquals("fileName.txt", fileHelper.collectFileName());
        } finally {
            System.setIn(System.in);
        }
    }
}