package blackjack;

import java.util.ArrayList;
import java.util.List;

public class AmmaKasi {

    private List<Kortti> Kortit = new ArrayList<Kortti>();

    public void otaKortti(Kortti AmmaKasi) {
        Kortit.add(AmmaKasi);
    }

    public void onkoJackMusta() {

        if (this.Kortit.size() == 2) {
            if (selvitaSumma() == 21) {
                System.out.println("Tunkki on musta, Emäntä voitti!");
                System.exit(0);
            }
        }
    }

    public int selvitaSumma() {
        int summa = 0;

        for (Kortti AmmaKasi : this.Kortit) {
            if (AmmaKasi.getArvo() <= 10 && AmmaKasi.getArvo() >= 2) {
                summa += AmmaKasi.getArvo();
            }
            if (AmmaKasi.getArvo() >= 11 && AmmaKasi.getArvo() <= 13) {
                summa += 10;
            }
            if (AmmaKasi.getArvo() == 1) {
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
