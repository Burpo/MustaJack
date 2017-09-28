package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Korttipakka {

    private List<Kortti> Korttipakka = new ArrayList<Kortti>();

    public Korttipakka() {

        for (int i = 1; i <= 13; i++) {
            Korttipakka.add(new Kortti(i, "Hertta"));
            Korttipakka.add(new Kortti(i, "Pata"));
            Korttipakka.add(new Kortti(i, "Risti"));
            Korttipakka.add(new Kortti(i, "Ruutu"));
        }
    }

    public Kortti jaaKortti() {
        Kortti kortti = Korttipakka.get(0);
        Korttipakka.remove(0);
        return kortti;

    }
    
    public void tulostaPakka() {
        System.out.println(Korttipakka);
    }

    public void sekoita() {
        Collections.shuffle(Korttipakka);
    }
}
