package PRZEDSZK;

/*
https://pl.spoj.com/problems/PRZEDSZK/
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Integer numberOfDataSeries = null;
        ArrayList<Integer> listOfPreschoolersInEveryClass = new ArrayList<Integer>();
        ArrayList<Integer> tempList = new ArrayList<Integer>();

        PRZEDSZK przedszk = new PRZEDSZK();

        while(numberOfDataSeries == null) {
            numberOfDataSeries = przedszk.numberOfDataSeries();
        }

        System.out.println("Podaj ilość przedszkolaków w dwóch klasach oddzielonych spacją");
        for(int i = 0; i < numberOfDataSeries; i++) {
            tempList = przedszk.listOfPreschoolersInEveryClass(przedszk.numberOfPreschoolersInClasses());
            listOfPreschoolersInEveryClass.addAll(tempList);
        }

        System.out.println("Należy kupić następujące ilości cukierków");
        for (int j = 1; j <= listOfPreschoolersInEveryClass.size(); j++){
            if (j < listOfPreschoolersInEveryClass.size()) {
                int preschoolersInFirstClass = listOfPreschoolersInEveryClass.get(j-1);
                int preschoolersInSecondClass = listOfPreschoolersInEveryClass.get(j);
                int amountOfCandys = 0;
                if (j % 2 != 0) {
                    amountOfCandys = przedszk.amountOfCandysToBuy(preschoolersInFirstClass, preschoolersInSecondClass);
                    System.out.println(amountOfCandys);
                }
            }
        }
    }
}
