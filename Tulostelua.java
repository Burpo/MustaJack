
public class Tulostelua {

    public static void tulostaTahtia(int maara) {
        // 44.1
        while (maara > 0) {
            System.out.print("*");
            maara--;
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        for (int i = 0; i < sivunpituus; i++) {
            tulostaTahtia(sivunpituus);
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        for (int i = 0; i < korkeus; i++) {
            tulostaTahtia(leveys);
        }
    }

    public static void tulostaKolmio(int koko) {
        for (int i = 0; i < koko; i++) {
            tulostaTahtia(i + 1);
        }
    }

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

}
