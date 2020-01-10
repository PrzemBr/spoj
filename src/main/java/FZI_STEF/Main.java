package FZI_STEF;

/*
https://pl.spoj.com/problems/FZI_STEF/
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberOfCities = 0;
        ArrayList<Integer> profitsFromCities = new ArrayList<Integer>();

        Scanner citiesScanner = new Scanner(System.in);

        System.out.println("Podaj liczbę miast na trasie z przedziału <1, 100.000>");
        try {
            numberOfCities = citiesScanner.nextInt();
            if (numberOfCities < 1 || numberOfCities > 100000) {
                System.out.println("Podano niepoprawną liczbę miast");
                System.exit(1);
            }
        } catch (InputMismatchException IME) {
            System.out.println("Podano niepoprawną wartość");
            System.exit(1);
        }

        System.out.println("Podaj całkowity zysk lub stratę dla każdego miasta z przediału <-100.000, 100.000>");
        for (int i = 0; i < numberOfCities; i++) {
            int profit;
            Scanner profitScanner = new Scanner(System.in);
            profit = profitScanner.nextInt();

            if (profit < -100000 || profit > 100000) {
                System.out.println("Podano wartość z poza zakresu");
                System.exit(1);
            }
            profitsFromCities.add(profit);
        }

        int forwardIterator = 0;
        int forwardSum = 0;

        for (int j = 0; j < profitsFromCities.size(); j++) {

            if (profitsFromCities.get(j) < 0) {
                for (int k = 0; k <= forwardIterator; k++) {
                    forwardSum = forwardSum + profitsFromCities.get(k);
                    if (forwardSum < 0) {
                        for (int l = 0; l <= forwardIterator; l++) {
                            profitsFromCities.set(l, 0);
                        }
                    } if (k == forwardIterator) {
                        forwardSum = 0;
                    }
                }
            }

            forwardIterator++;
        }

        int backwardIterator = profitsFromCities.size() - 1;
        int backwardSum = 0;

        for (int j = profitsFromCities.size() - 1; j >= 0; j--) {

            if (profitsFromCities.get(j) < 0) {
                for (int k = profitsFromCities.size() - 1; k >= backwardIterator; k--) {
                    backwardSum = backwardSum + profitsFromCities.get(k);

                    if (backwardSum < 0) {
                        for (int l = profitsFromCities.size() - 1; l >= backwardIterator; l--) {
                            profitsFromCities.set(l, 0);
                        }
                    } if (k == backwardIterator) {
                        backwardSum = 0;
                    }
                }
            }

            backwardIterator--;
        }

//        System.out.println(profitsFromCities);
        FZI_STEF fzi_stef = new FZI_STEF();
        Integer result = fzi_stef.SumOfAllElements(profitsFromCities);
        System.out.println(result);

    }
}
