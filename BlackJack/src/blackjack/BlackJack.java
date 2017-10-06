package blackjack;

import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Tervetuloa Mustaantunkkiin! \n\nJos kortin numero on 2-10, kortin arvo vastaa numeroa. \nJos kortin numero on 11-13, kortin arvo on 10. \nJos kortin numero on 1, kortti on ässä, joka on arvoltaan 11.\n");

        System.out.println("Syötä pakkojen määrä: ");
        int lkm = Integer.parseInt(lukija.next());

        Korttipakka pakka = new Korttipakka(lkm);
        PelaajanKasi kasi = new PelaajanKasi();
        AmmaKasi Amma = new AmmaKasi();

        pakka.sekoita();

        System.out.println("Sait kortin:");
        Kortti kateen = pakka.jaaKortti();
        kasi.otaKortti(kateen);
        System.out.println(kateen);

        System.out.println("Sait kortin:");
        kateen = pakka.jaaKortti();
        kasi.otaKortti(kateen);
        System.out.println(kateen);

        int Pubg = kasi.selvitaSumma();
        System.out.println("Korttiesi summa on: " + Pubg + "\n");
        kasi.onkoJackMusta();

        while (Pubg < 21) {
            System.out.println("Haluatko uuden kortin? Kylla/En");
            String vastaus = lukija.next();

            if (vastaus.equals("Kylla") || vastaus.equals("kylla")) {
                System.out.println("Sait kortin:");
                kateen = pakka.jaaKortti();
                kasi.otaKortti(kateen);
                System.out.println(kateen);
                Pubg = kasi.selvitaSumma();
                System.out.println("Korttiesi summa on: " + Pubg + "\n");
            }
            
            System.out.println("");

            if (vastaus.equals("En") || vastaus.equals("en")) {
                System.out.println("--------------");
                System.out.println("Emännän vuoro");
                System.out.println("-------------- \n");
                break;
            }
        }

        if (Pubg > 21) {
            System.out.println("Korttiesi summa ylitti 21, hävisit.");
            System.exit(0);
        }

        System.out.println("Emäntä sai kortin:");
        Kortti emanta = pakka.jaaKortti();
        Amma.otaKortti(emanta);
        System.out.println(emanta);

        System.out.println("Emäntä sai kortin:");
        emanta = pakka.jaaKortti();
        Amma.otaKortti(emanta);
        System.out.println(emanta);

        int Minecraft = Amma.selvitaSumma();
        System.out.println("Emännän korttien summa on: " + Minecraft + "\n");
        Amma.onkoJackMusta();

        while (Minecraft < 15) {
            System.out.println("Emäntä sai kortin:");
            emanta = pakka.jaaKortti();
            Amma.otaKortti(emanta);
            System.out.println(emanta);
            Minecraft = Amma.selvitaSumma();
            System.out.println("Emännän korttien summa on: " + Minecraft + "\n");
        }

        if (Pubg > Minecraft) {
            System.out.println("Korttiesi summa oli suurempi kuin emännän, voitit!");
        }

        if (Pubg == Minecraft) {
            System.out.println("Tasapeli, emäntä voitti.");
        }

        if (Minecraft > Pubg) {
            System.out.println("Emännän korttien summa oli suurempi kuin sinun, hävisit.");
        }

        if (Minecraft > 21) {
            System.out.println("Emännän korttien summa ylitti 21, voitit!");
        }

    }
}