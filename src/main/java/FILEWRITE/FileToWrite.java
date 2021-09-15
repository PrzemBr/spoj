package FILEWRITE;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileToWrite extends File {
    private ArrayList<String> listOfLines = new ArrayList<>();

    public FileToWrite(String pathname) {
        super(pathname);
    }

    public void addLine(String line) {
        listOfLines.add(line);
    }

    public void printFile() {
        System.out.println(this.getName() + '\n');
        for (String tempString : listOfLines) {
            System.out.println(tempString);
        }
    }

    public void writeToFile() {
        for (String line : listOfLines) {
            try {
                FileWriter fileWriter = new FileWriter(this.getPath(), true);
                fileWriter.write(line + '\n');
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("writeToFile IOException");
                e.printStackTrace();
            }
        }
    }
}
