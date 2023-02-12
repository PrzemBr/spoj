package FILEWRITE;

import java.util.ArrayList;
import java.util.Scanner;

public class FileHelper {

    public String collectFileName() {
        String fileName = new String();
        System.out.println("Enter File name");
        while (fileName.length() == 0) {
            Scanner fileNameSc = new Scanner(System.in);
            fileName = fileNameSc.nextLine();
            if (fileName.length() != 0) {
                fileName = fileName + ".txt";
                break;
            }
        }
        return fileName;
    }

    public void printFile(String text) {
        System.out.println(text);
    }

    public void printFile(ArrayList<String> listOfTexts) {
        for (String tempString : listOfTexts) {
            System.out.println(tempString);
        }
    }

    public FileToWrite lineScanner(FileToWrite file) {
        printFile("Enter data");
        printFile("000 completes the entry");
        while (true) {
            String newLine;
            Scanner lineScanner = new Scanner(System.in);
            newLine = lineScanner.nextLine();
            System.out.println(newLine);
            if (newLine.equals("000")) {
                break;
            } else {
                file.addLine(newLine);
            }
        }
        return file;
    }
}
