package PA05_POT;

/*
https://pl.spoj.com/problems/PA05_POT/
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int counter;
        String input;

        List<String> strings = new ArrayList<String>();
        List<Integer> resultsList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w programie potęgującym");
        System.out.println("Podaj ile razy <1, 10> chcesz dokonać potęgowania");
        counter = scanner.nextInt();
        pa05_pot pa05_pot = new pa05_pot();

        if (counter>=1 && counter<=10) {
            System.out.println("Podaj podstawę oraz po spacji wykładnik z zakresu <1, 1000000000>");
            for (int i = 0; i < counter; i++) {
                Scanner intSc = new Scanner(System.in);
                input = intSc.nextLine();
                strings = Arrays.asList(input.split(" "));
                Integer basis = Integer.parseInt(strings.get(0));
                Integer index = Integer.parseInt(strings.get(1));
                if (!(basis >= 1 && basis <= 1000000000 && index >= 1 && index <= 1000000000)) {
                    System.out.println("Podano liczbę z poza zakresu <1, 1000000000>");
                    System.exit(1);
                }
                Integer integerHolder = pa05_pot.power(basis, index);
                resultsList.add((int) integerHolder);
            }
            for (int i = 0; i < counter; i++) {
                Integer tempNumber = resultsList.get(i);
                System.out.println(pa05_pot.lastDigit(tempNumber));
            }
        } else System.out.println("Podano wartość z poza zakresu");
    }
}
