package FILEWRITE;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String path = "D:\\dev\\spoj\\src\\main\\resources\\";
        FileHelper prepareHelper = new FileHelper();
        String fileName = prepareHelper.collectFileName();
        FileToWrite file = new FileToWrite(path + fileName);

        prepareHelper.printFile("Enter data");
        prepareHelper.printFile("000 completes the entry");

        while (true) {
            String newLine;
            Scanner lineScanner = new Scanner(System.in);
            newLine = lineScanner.nextLine();
            if (newLine.equals("000")) {
                break;
            } else {
                file.addLine(newLine);
            }
        }
        file.writeToFile();
        prepareHelper.printFile(file.printFile());
    }
}
