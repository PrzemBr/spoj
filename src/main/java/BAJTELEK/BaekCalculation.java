package BAJTELEK;

import java.util.ArrayList;

public class BaekCalculation {

    public Integer calculationOfThePolygonArea(Bajtelek bajtelek) {
        ArrayList<Integer> listOfBlackXs = bajtelek.getListOfBlackXs();
        ArrayList<Integer> listOfBlackYs = bajtelek.getListOfBlackYs();
        ArrayList<Integer> listOfGreyXs = bajtelek.getListOfGreyXs();
        ArrayList<Integer> listOfGreyYs = bajtelek.getListOfGreyYs();
        double dAreaOfBlackPolygon = 0;
        double dAreaOfGreyPolygon = 0;

        for (int i = 0; i < listOfBlackXs.size() - 1; i++) {
            double xFirst;
            double xSecond;
            double yFirst;
            double ySecond;

            xFirst = listOfBlackXs.get(i);
            xSecond = listOfBlackXs.get(i + 1);
            yFirst = listOfBlackYs.get(i + 1);
            ySecond = listOfBlackYs.get(i);

            dAreaOfBlackPolygon = dAreaOfBlackPolygon + (((xFirst * yFirst) - (xSecond * ySecond)) / 2);
        }

        for (int i = 0; i < listOfGreyXs.size() - 1; i++) {
            double xFirst;
            double xSecond;
            double yFirst;
            double ySecond;

            xFirst = listOfGreyXs.get(i);
            xSecond = listOfGreyXs.get(i + 1);
            yFirst = listOfGreyYs.get(i + 1);
            ySecond = listOfGreyYs.get(i);

            dAreaOfGreyPolygon = dAreaOfGreyPolygon + (((xFirst * yFirst) - (xSecond * ySecond)) / 2);
        }

        dAreaOfGreyPolygon = dAreaOfGreyPolygon - dAreaOfBlackPolygon;

        double dBlackInkUsage = dAreaOfBlackPolygon * 10;
        double dGreyInkUsage = dAreaOfGreyPolygon * 6;

        int iInkUsage = (int) Math.round(dBlackInkUsage + dGreyInkUsage);

        return iInkUsage;
    }

}
