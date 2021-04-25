package FZI_STEF;

/*
https://pl.spoj.com/problems/FZI_STEF/
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer numberOfCities;

        FziInput fziInput = new FziInput();
        do {
            numberOfCities = fziInput.numberOfCitiesInput();
            if (numberOfCities > 0 && numberOfCities < 100000) {
                break;
            }
        } while (true);

        ArrayList<Integer> profitsFromCities = fziInput.profitFromCities(numberOfCities);

        FZI_STEF fzi_stef = new FZI_STEF();
        fzi_stef.profitFromCities(profitsFromCities, true);
        fzi_stef.profitFromCities(profitsFromCities);
        Integer result = fzi_stef.SumOfAllElements(profitsFromCities);

        System.out.println("Maksymalny możliwy zysk wynosi: "+ result);
    }
}
