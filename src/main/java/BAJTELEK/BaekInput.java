package BAJTELEK;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BaekInput {

    public Integer amountOfPrints() {
        Integer amountOfPrints = null;

        Scanner printsScanner = new Scanner(System.in);

        try {
            amountOfPrints = printsScanner.nextInt();
        } catch (InputMismatchException IME) {
            System.out.println("Podano błędną wartość");
            amountOfPrints = null;
        } catch (NullPointerException NPE) {
            System.out.println("Podano błędną wartość");
            amountOfPrints = null;
        }
        return amountOfPrints;
    }

    public String listOfPoints() {
        String listOfPoints;
        Scanner listScanner = new Scanner(System.in);
        listOfPoints = listScanner.nextLine();
        return listOfPoints;
    }

    public ArrayList<Integer> listOfPoints(String stringWithPoints, boolean listOfXs) {
        ArrayList<String> stringListOfPoints = new ArrayList<String>();
        ArrayList<Integer> integerListOfPoints = new ArrayList<Integer>();

        for (String tempString : stringWithPoints.split(" ")) {
            stringListOfPoints.add(tempString);
        }

        for (int i = 0; i < stringListOfPoints.size(); i++) {
            String tempPoint = stringListOfPoints.get(i);

            if (listOfXs) {
                if (i == 0 || i % 2 == 0) {
                    try {
                        int tempInt = Integer.parseInt(tempPoint);
                        if (tempInt < -100000 || tempInt > 100000) {
                            System.out.println("Podano wartość z poza zakresu");
                            break;
                        }
                        integerListOfPoints.add(tempInt);
                    } catch (NumberFormatException NFE) {
                        System.out.println("Podano niepoprawną wartość");
                    }
                }
            } else {
                if (i % 2 != 0) {
                    try {
                        int tempInt = Integer.parseInt(tempPoint);
                        if (tempInt < -100000 || tempInt > 100000) {
                            System.out.println("Podano wartość z poza zakresu");
                            break;
                        }
                        integerListOfPoints.add(tempInt);
                    } catch (NumberFormatException NFE) {
                        System.out.println("Podano niepoprawną wartość");
                    }
                }
            }
        }
        return integerListOfPoints;
    }
}
