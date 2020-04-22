package FCTRL3;

/*
https://pl.spoj.com/problems/FCTRL3/
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer numberOfDataSeries = null;
        Integer silnia;

        while (numberOfDataSeries == null) {
            Scanner seriesSc = new Scanner(System.in);

            try {
                System.out.println("Podaj ile silni ma policzyć program");
                numberOfDataSeries = seriesSc.nextInt();
                System.out.println(numberOfDataSeries);
            } catch (InputMismatchException IME) {
                System.out.println("Podano niepoprawną wartość");
            }
        }
    }
}
