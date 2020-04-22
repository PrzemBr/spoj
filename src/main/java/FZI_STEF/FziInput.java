package FZI_STEF;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FziInput {

    ArrayList<Integer> profitsFromCities = new ArrayList<Integer>();

    public Integer numberOfCitiesInput() {
        Integer numberOfCities = 0;

        try {
            Scanner citiesScanner = new Scanner(System.in);

            System.out.println("Podaj liczbę miast na trasie z przedziału <1, 100.000>");
            numberOfCities = citiesScanner.nextInt();
            if (numberOfCities < 1 || numberOfCities > 100000) {
                System.out.println("Podano niepoprawną liczbę miast");
            }
        } catch (InputMismatchException IME) {
            System.out.println("Podano niepoprawną wartość");
        }
        return numberOfCities;
    }

    public ArrayList<Integer> profitFromCities(int numberOfCities) {

        System.out.println("Podaj całkowity zysk lub stratę dla każdego miasta z przediału <-100.000, 100.000>");
        for (int i = 0; i < numberOfCities; i++) {
            int profit = 0;
            boolean mismatchValue = false;
            try {
                Scanner profitScanner = new Scanner(System.in);
                profit = profitScanner.nextInt();

                if (profit < -100000 || profit > 100000) {
                    System.out.println("Podano wartość z poza zakresu");
                    mismatchValue = true;
                }
            } catch (InputMismatchException IME) {
                System.out.println("Wczytano niepoprawną wartość, podaj wartość ponownie");
                mismatchValue = true;
            }
            if (mismatchValue) {
                i--;
                mismatchValue = false;
            } else {
                profitsFromCities.add(profit);
            }
        }
        return profitsFromCities;
    }

    public ArrayList<Integer> getProfitsFromCities() {
        return profitsFromCities;
    }
}
