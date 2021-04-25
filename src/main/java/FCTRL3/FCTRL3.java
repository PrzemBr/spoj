package FCTRL3;

public class FCTRL3 {
    public Integer calculateSilnia(Integer silnia) {
        int wynik = 1;

        if (silnia <= 1) {
            return 1;
        } else {
            for (int i = 1; i <= silnia; i++) {
                wynik = wynik * i;
            }
            return wynik;
        }
    }
}
