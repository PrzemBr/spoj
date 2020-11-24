package TDBFS;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    public ArrayList<Integer> genericInput(){
        String genericInput;
        ArrayList<String> sGenericList = new ArrayList<String>();
        ArrayList<Integer> iGenericList = new ArrayList<Integer>();
        Scanner genericScanner = new Scanner(System.in);

        genericInput = genericScanner.nextLine();
        for (String tempString : genericInput.split(" ")) {
            sGenericList.add(tempString);
        }
        for (int i = 0; i < sGenericList.size(); i++) {
            try {
                Integer tempInteger = Integer.parseInt(sGenericList.get(i));
                iGenericList.add(tempInteger);
            } catch (NumberFormatException NFE) {
                System.out.println("Podano błędną wartość");
                sGenericList.clear();
            } catch (IllegalArgumentException IAE) {
                System.out.println("Podano błędną wartość");
                sGenericList.clear();
            } catch (NullPointerException NPE) {
                System.out.println("Wartość nie istnieje");
                sGenericList.clear();
            }
        }
        return iGenericList;
    }

}
