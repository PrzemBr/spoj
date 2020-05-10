package PRZEDSZK;

import java.util.*;

public class PRZEDSZK {

    public Integer numberOfDataSeries() {
        Integer numberOfSeries = null;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj ile serii danych chcesz wczytać z przedziału <1, 20>");
            numberOfSeries = scanner.nextInt();
        } catch (NumberFormatException NFE) {
            System.out.println("Podano niepoprawną wartość");
        } catch (InputMismatchException IME) {
            System.out.println("Podano niepoprawną wartość");
        } catch (NullPointerException NPE) {
            System.out.println("Podano niepoprawną wartość");
        }
        if (numberOfSeries < 1 || numberOfSeries > 20) {
            numberOfSeries = null;
        }
        return numberOfSeries;
    }

    public String numberOfPreschoolersInClasses() {
        String numberOfPreschoolersInClasses;
        Scanner scanner = new Scanner(System.in);
        numberOfPreschoolersInClasses = scanner.nextLine();
        return numberOfPreschoolersInClasses;
    }

    public ArrayList<Integer> listOfPreschoolersInEveryClass(String numberOfPreschoolersInClasses) {
        ArrayList<String> stringListOfPreschoolersInEveryClass = new ArrayList<String>();
        ArrayList<Integer> integerListOfPreschoolersInEveryClass = new ArrayList<Integer>();

        for (String tempString : numberOfPreschoolersInClasses.split(" ")) {
            stringListOfPreschoolersInEveryClass.add(tempString);
        }

        if (stringListOfPreschoolersInEveryClass.size() != 2) {
            System.out.println("Podano niepoprawne wartości");
            stringListOfPreschoolersInEveryClass.clear();
        } else {
            for (int j = 0; j < stringListOfPreschoolersInEveryClass.size(); j++) {
                try {
                    integerListOfPreschoolersInEveryClass.add(Integer.parseInt(stringListOfPreschoolersInEveryClass.get(j)));
                } catch (NumberFormatException NFE) {
                    System.out.println("Podano niepoprawną wartość");
                }
            }
        }

        return integerListOfPreschoolersInEveryClass;
    }

    public Integer amountOfCandysToBuy(int preschoolersInFirstClass, int preschoolersInSecondClass) {

        int temp = 0;
        int leastCommonMultiple;
        if (preschoolersInFirstClass == preschoolersInSecondClass) {
            return preschoolersInFirstClass;
        } else {
            for (int i = 1; i <= preschoolersInFirstClass && i <= preschoolersInSecondClass; i++) {
                if (preschoolersInFirstClass % i == 0 && preschoolersInSecondClass % i == 0) {
                    temp = i;
                }
            }
            leastCommonMultiple = (preschoolersInFirstClass * preschoolersInSecondClass) / temp;
            return leastCommonMultiple;
        }
    }

}
