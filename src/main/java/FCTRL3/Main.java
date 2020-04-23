package FCTRL3;

/*
https://pl.spoj.com/problems/FCTRL3/
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Integer numberOfDataSeries = null;
        Integer silnia = null;
        boolean inputMismatch = false;
        ArrayList<Integer> silniaList = new ArrayList<Integer>();

        while (numberOfDataSeries == null) {
            Scanner seriesSc = new Scanner(System.in);

            try {
                System.out.println("Podaj ile silni ma policzyć program");
                numberOfDataSeries = seriesSc.nextInt();
            } catch (InputMismatchException IME) {
                System.out.println("Podano niepoprawną wartość");
            }

        }

        System.out.println("Podaj Liczby których silnie chcesz policzyć z przedziału <0, 1.000.000.000>");
        for (int i = 1; i <= numberOfDataSeries; i++) {
            Scanner sc = new Scanner(System.in);
            try {
                silnia = sc.nextInt();
            } catch (InputMismatchException IME) {
                System.out.println("Podano niepoprawną wartość");
                inputMismatch = true;
            }
            if (inputMismatch) {
                silnia = null;
                inputMismatch = false;
                i--;
                continue;
            } if (silnia < 0 || silnia > 1000000000) {
                System.out.println("Podano wartość z poza zakresu");
                i--;
            } else {
                silniaList.add(silnia);
            }
        }

        for (int i = 0; i < silniaList.size(); i++) {
            FCTRL3 fctrl3 = new FCTRL3();
            ResultFormatter result = new ResultFormatter();

            int silniaInput = silniaList.get(i);
            int silniaResult = fctrl3.calculateSilnia(silniaInput);
            int silniaUnity = result.countUnity(silniaResult);
            int silniaTen = result.countTen(silniaResult);

            System.out.println(silniaTen + " " + silniaUnity);
        }
    }
}
