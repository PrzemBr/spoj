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
}
