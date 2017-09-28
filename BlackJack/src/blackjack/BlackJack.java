package blackjack;

public class BlackJack {

    public static void main(String[] args) {
        Korttipakka pakka = new Korttipakka();
        
        pakka.tulostaPakka();
        pakka.sekoita();
        pakka.tulostaPakka();
        System.out.println(pakka.jaaKortti());
        System.out.println(pakka.jaaKortti());
    }

}
