package FCTRL3;

public class FCTRL3 {
    public Integer calculateSilnia(Integer silnia) {
        int wynik = 1;
        for (int i = 1; i <= silnia; i++) {
            wynik = wynik * i;
        }
        return wynik;
    }
}
