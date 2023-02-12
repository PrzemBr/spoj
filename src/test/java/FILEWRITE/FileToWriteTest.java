package FILEWRITE;

import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FileToWriteTest {
    private FileToWrite fileToWrite;

    @BeforeEach
    public void prepare(){
        String path = "D:\\dev\\spoj\\src\\main\\resources\\";
        String firstLine = "Text in first line";
        String secondLine = "Text in second line";
        String fileName = "fileToWrite.txt";
        fileToWrite = new FileToWrite(path + fileName);

        fileToWrite.addLine(firstLine);
        fileToWrite.addLine(secondLine);
    }

    @Test
    public void shouldAddLineToFile() {
        ArrayList<String> listOfLines = fileToWrite.getListOfLines();
        assertNotEquals(0, listOfLines.size());

    }

    @Test
    public void shouldTestPrintFile() {
        ArrayList<String> assertedList = new ArrayList<>();
        assertedList.add("fileToWrite.txt");
        assertedList.add("Text in first line");
        assertedList.add("Text in second line");
        assertEquals(assertedList, fileToWrite.printFile());
    }

    @Test
    public void shouldWriteToFile() {
        fileToWrite.writeToFile();
        try {
            assertTrue(fileToWrite.exists());
        } finally {
            fileToWrite.delete();
        }
    }

}
