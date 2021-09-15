package FILEWRITE;

import java.util.Scanner;

public class FileHelper {

    public String collectFileName() {
        String fileName;
        System.out.println("Enter File name");
        Scanner fileNameSc = new Scanner(System.in);
        try {
            fileName = fileNameSc.nextLine() + ".txt";
            return fileName;
        } catch (NullPointerException npe) {
            System.out.println("collectFileName npe Error");
            npe.printStackTrace();
            return null;
        }
    }

}
