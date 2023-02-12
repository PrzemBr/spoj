package FILEREAD;

import java.util.ArrayList;

public class File {
    private ArrayList<String> listOfLines = new ArrayList<>();

    public void addLine(String line) {
        listOfLines.add(line);
    }

    public ArrayList<String> getListOfLines() {
        return listOfLines;
    }
    public void printFile() {
        for (String tempString : listOfLines) {
            System.out.println(tempString);
        }
    }
}
