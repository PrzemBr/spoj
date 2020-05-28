package BAJTELEK;

/*
https://pl.spoj.com/problems/BAJTELEK/
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Integer amountOfPrints = null;
        ArrayList<Bajtelek> listOfBajteleks = new ArrayList<Bajtelek>();


        BaekInput baekInput = new BaekInput();

        System.out.println("Podaj dla ilu rysunków chcesz policzyć zużycie tuszu");
        while (amountOfPrints == null) {
            amountOfPrints = baekInput.amountOfPrints();
        }

        System.out.println("Podaj współrzędne wierzchołków z przediału <-100.000 <=x,y=> 100.000> w systemie: x y x y...");
        System.out.println("Najpierw czarnych a później szarych");
        for (int i = 0; i < amountOfPrints; i++) {
            BaekInput baekBlackXsInput = new BaekInput();
            BaekInput baekBlackYsInput = new BaekInput();
            BaekInput baekGreyXsInput = new BaekInput();
            BaekInput baekGreyYsInput = new BaekInput();

            ArrayList<Integer> listOfBlackXsPoints = new ArrayList<Integer>();
            ArrayList<Integer> listOfBlackYsPoints = new ArrayList<Integer>();
            ArrayList<Integer> listOfGreyXsPoints = new ArrayList<Integer>();
            ArrayList<Integer> listOfGreyYsPoints = new ArrayList<Integer>();

            String stringOfBlackPoints = baekInput.listOfPoints();
            String stringOfGreyPoints = baekInput.listOfPoints();

            listOfBlackXsPoints = baekBlackXsInput.listOfPoints(stringOfBlackPoints, true);
            listOfBlackYsPoints = baekBlackYsInput.listOfPoints(stringOfBlackPoints, false);
            listOfGreyXsPoints = baekGreyXsInput.listOfPoints(stringOfGreyPoints, true);
            listOfGreyYsPoints = baekGreyYsInput.listOfPoints(stringOfGreyPoints, false);

            Bajtelek bajtelek = new Bajtelek(listOfBlackXsPoints, listOfBlackYsPoints, listOfGreyXsPoints, listOfGreyYsPoints);

            if (bajtelek.isValid()) {
                listOfBajteleks.add(bajtelek);
            } else {
                System.out.println("Podano błędne dane");
                i--;
            }
        }

        System.out.println("Zuzycie tuszu wynosi: ");
        for (int i = 0; i < listOfBajteleks.size(); i++) {
            BaekCalculation baekCalculation = new BaekCalculation();
            int polygonArea;
            polygonArea = baekCalculation.calculationOfThePolygonArea(listOfBajteleks.get(i));
            System.out.println(polygonArea);
        }
    }
}
