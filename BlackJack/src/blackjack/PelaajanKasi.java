package blackjack;

import java.util.ArrayList;
import java.util.List;

public class PelaajanKasi {

    private List<Kortti> Kortit = new ArrayList<Kortti>();

    public PelaajanKasi() {

    }

    public void otaKortti(Kortti kortti) {
        Kortit.add(kortti);
    }

    public void onkoJackMusta() {

        if (this.Kortit.size() == 2) {
            if (selvitaSumma() == 21) {
                System.out.println("Tunkki on musta, Voitit!");
                System.exit(0);
            }
        }
    }

    public int selvitaSumma() {
        int summa = 0;

        for (Kortti kortti : this.Kortit) {
            if (kortti.getArvo() <= 10 && kortti.getArvo() >= 2) {
                summa += kortti.getArvo();
            }
            if (kortti.getArvo() >= 11 && kortti.getArvo() <= 13) {
                summa += 10;
            }
            if (kortti.getArvo() == 1) {
                summa += 11;
            }
            if (this.Kortit.size() == 2) {
                if (summa > 21) {
                    summa -= 10;
                }
            }
        }
        return summa;

    }
}
