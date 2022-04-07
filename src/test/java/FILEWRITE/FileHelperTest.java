package FILEWRITE;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

class FileHelperTest {

    @Test
    void shouldCollectFileName() {
        String testInput = "fileName";
        FileHelper fileHelper = new FileHelper();
        InputStream testStream = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(testStream);
        try {
            assertEquals("fileName.txt", fileHelper.collectFileName());
        } finally {
            System.setIn(System.in);
        }
    }
}