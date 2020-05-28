package BAJTELEK;

import java.util.ArrayList;

public class Bajtelek {
    private ArrayList<Integer> listOfBlackXs = new ArrayList<Integer>();
    private ArrayList<Integer> listOfBlackYs = new ArrayList<Integer>();
    private ArrayList<Integer> listOfGreyXs = new ArrayList<Integer>();
    private ArrayList<Integer> listOfGreyYs = new ArrayList<Integer>();

    public boolean isValid() {
        if (listOfBlackXs.isEmpty() || listOfBlackYs.isEmpty()) {
            return false;
        }
        if (listOfGreyXs.isEmpty() || listOfGreyYs.isEmpty()) {
            return false;
        }
        if (listOfBlackXs.size() < 4 || listOfBlackYs.size() < 4) {
            return false;
        }
        if (listOfGreyXs.size() < 4 || listOfGreyYs.size() < 4) {
            return false;
        }
        if (listOfBlackXs.size() != listOfBlackYs.size()) {
            return false;
        }
        if (listOfGreyXs.size() != listOfGreyYs.size()) {
            return false;
        }
        if (listOfBlackXs.get(0) != listOfBlackXs.get(listOfBlackXs.size() - 1) ||
                listOfBlackYs.get(0) != listOfBlackYs.get(listOfBlackYs.size() - 1)) {
            return false;
        }
        if (listOfGreyXs.get(0) != listOfGreyXs.get(listOfGreyXs.size() - 1) ||
                listOfGreyYs.get(0) != listOfGreyYs.get(listOfGreyYs.size() - 1)) {
            return false;
        }
        return true;
    }

    public Bajtelek(ArrayList<Integer> listOfBlackXs, ArrayList<Integer> listOfBlackYs, ArrayList<Integer> listOfGreyXs, ArrayList<Integer> listOfGreyYs) {
        this.listOfBlackXs = listOfBlackXs;
        this.listOfBlackYs = listOfBlackYs;
        this.listOfGreyXs = listOfGreyXs;
        this.listOfGreyYs = listOfGreyYs;
    }

    public ArrayList<Integer> getListOfBlackXs() {
        return listOfBlackXs;
    }

    public void setListOfBlackXs(ArrayList<Integer> listOfBlackXs) {
        this.listOfBlackXs = listOfBlackXs;
    }

    public ArrayList<Integer> getListOfBlackYs() {
        return listOfBlackYs;
    }

    public void setListOfBlackYs(ArrayList<Integer> listOfBlackYs) {
        this.listOfBlackYs = listOfBlackYs;
    }

    public ArrayList<Integer> getListOfGreyXs() {
        return listOfGreyXs;
    }

    public void setListOfGreyXs(ArrayList<Integer> listOfGreyXs) {
        this.listOfGreyXs = listOfGreyXs;
    }

    public ArrayList<Integer> getListOfGreyYs() {
        return listOfGreyYs;
    }

    public void setListOfGreyYs(ArrayList<Integer> listOfGreyYs) {
        this.listOfGreyYs = listOfGreyYs;
    }
}
