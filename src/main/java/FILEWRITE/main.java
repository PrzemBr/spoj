package FILEWRITE;

public class main {
    public static void main(String[] args) {
        String path = "D:\\dev\\spoj\\src\\main\\resources\\";
        FileHelper prepareHelper = new FileHelper();
        String fileName = prepareHelper.collectFileName();
        FileToWrite file = new FileToWrite(path + fileName);

        prepareHelper.lineScanner(file);
        file.writeToFile();
        prepareHelper.printFile(file.printFile());
    }
}
