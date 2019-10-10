package PA05_POT;


public class pa05_pot {


    public int power(Integer basis, Integer index) {
        double mathResult = Math.pow(basis, index);
        Integer result= (int) Math.round(mathResult);
        return result;
    }

    public Integer lastDigit(Integer longNumber){
        Integer shortNumber = longNumber % 10;
        return shortNumber;
    }
}
