package FILEREAD;

public class Main {
    public static void main(String[] args) {
        ConvertFileIntoFileClass fileConverter = new ConvertFileIntoFileClass();
        File file = fileConverter.convertFileIntoFileClass("D:\\dev\\spoj\\src\\main\\resources\\new.txt");
        file.printFile();
    }
}
