package FCTRL3;

public class ResultFormatter {
    private int unityNumber;
    private int tenNumber;

    public Integer countUnity(int number) {
        int result;
        result = number%10;
        return result;
    }

    public Integer countTen(int number) {
        int result;
        result = (number%100)/10;
        return result;
    }
}
