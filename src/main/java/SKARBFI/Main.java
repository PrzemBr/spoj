package SKARBFI;

/*
https://pl.spoj.com/problems/SKARBFI/
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int dataSets;
        int movesQuantity;
        String steps;
        int direction;
        int stepsQuantity;

        List<Integer> verticalResults = new ArrayList<Integer>();
        List<Integer> horizontalResults = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile zestawów danych chcesz wczytać z zakresu <1, 50>");
        dataSets = scanner.nextInt();

        for (int i = 0; i < dataSets; i++) {
            int verticalResult = 0;
            int horizontalResult = 0;

            System.out.println("Podaj ile kroków ma być wykanane z zakresu <0, 100.000>");
            movesQuantity = scanner.nextInt();
            System.out.println("Podaj w którym kierunku chcesz się poruszyć a po spacji ilość kroków jaką chcesz wykonać");
            System.out.println("0 - północ");
            System.out.println("1 - południe");
            System.out.println("2 - zachód");
            System.out.println("3 - wschód");
            for (int j = 0; j < movesQuantity; j++) {
                Scanner stepsScanner = new Scanner(System.in);
                List<String> stepsList = new ArrayList<String>();
                treasureHunt treasureHunt = new treasureHunt();

                steps = stepsScanner.nextLine();
                stepsList = Arrays.asList(steps.split(" "));
                direction = Integer.parseInt(stepsList.get(0));
                stepsQuantity = Integer.parseInt(stepsList.get(1));
                switch (direction) {
                    case 0:
                        verticalResult = verticalResult + treasureHunt.changeVertical(stepsQuantity);
                        break;
                    case 1:
                        verticalResult = verticalResult + treasureHunt.changeVertical(-stepsQuantity);
                        break;
                    case 2:
                        horizontalResult = horizontalResult + treasureHunt.changeHorizon(-stepsQuantity);
                        break;
                    case 3:
                        horizontalResult = horizontalResult + treasureHunt.changeHorizon(stepsQuantity);
                        break;
                    default:
                        System.out.println("Podano niewłaściwy kierunek");
                        System.exit(1);
                }

                if (j == movesQuantity-1) {
                    verticalResults.add(verticalResult);
                    horizontalResults.add(horizontalResult);
                }
            }
        }
        System.out.println("");
        System.out.println("Koordynaty skarbu to:");
        for (int i = 0; i <verticalResults.size(); i++) {
            treasureHunt huntResult = new treasureHunt();
            if (verticalResults.get(i) == 0 && horizontalResults.get(i) == 0){
                System.out.println("Studnia");
            } else if (verticalResults.get(i) == 0 && horizontalResults.get(i) != 0) {
                System.out.println(huntResult.showHorizonCoordinate(horizontalResults.get(i)));
            } else if (verticalResults.get(i) != 0 && horizontalResults.get(i) == 0) {
                System.out.println(huntResult.showVerticalCoordinate(verticalResults.get(i)));
            } else {
                System.out.println(huntResult.showVerticalCoordinate(verticalResults.get(i)));
                System.out.println(huntResult.showHorizonCoordinate(horizontalResults.get(i)));
            }
        }
    }
}
