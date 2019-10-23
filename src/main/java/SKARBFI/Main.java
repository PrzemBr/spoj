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



        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile zestawów danych chcesz wczytać z zakresu <1, 50>");
        dataSets = scanner.nextInt();
        for (int i = 0; i <= dataSets; i++) {
            System.out.println("Podaj ile kroków ma być wykanane z zakresu <0, 100.000>");
            movesQuantity = scanner.nextInt();
            System.out.println("Podaj w którym kierunku chcesz się poruszyć a po spacji ilość kroków jaką chcesz wykonać");
            System.out.println("0 - północ");
            System.out.println("1 - południe");
            System.out.println("2 - zachód");
            System.out.println("3 - wschód");
            for (int j = 0; j <= movesQuantity; j++) {
                Scanner stepsScanner = new Scanner(System.in);
                List<String> stepsList = new ArrayList<String>();
                treasureHunt treasureHunt = new treasureHunt();

                steps = stepsScanner.nextLine();
                stepsList = Arrays.asList(steps.split(" "));
                direction = Integer.parseInt(stepsList.get(0));
                stepsQuantity = Integer.parseInt(stepsList.get(1));
                if (direction == 0 || direction == 1) {
                    treasureHunt.changeVertical(stepsQuantity);
                } else {
                    if (direction == 2 || direction == 3) {
                        treasureHunt.changeHorizon(stepsQuantity);
                    } else {
                        System.out.println("Podano niewłaściwy kierunek");
                        System.exit(1);
                    }
                }
            }
        }

    }
}
