package FZI_STEF;

import java.util.ArrayList;

public class FZI_STEF {

    public Integer SumOfAllElements(ArrayList<Integer> profitsList) {
        Integer sum = 0;
        for (Integer element : profitsList) {
            sum = sum + element;
        }
        return sum;
    }
}
