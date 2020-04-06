package FANGEN;

/*
https://pl.spoj.com/problems/FANGEN/
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int fanSize;

        Scanner scanner = new Scanner(System.in);
        FANGEN fangen = new FANGEN();

        do {
            System.out.println("Podaj rozmiar wiatraczka");
            fanSize =scanner.nextInt();

            if (fanSize != 0) {
                fangen.fanMaker(fanSize);
            }
        } while (fanSize == 0);

        if (fanSize==0) {
            System.exit(0);
        }
    }
}
