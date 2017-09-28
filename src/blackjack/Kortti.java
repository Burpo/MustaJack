package blackjack;

public class Kortti {
    private int arvo;
    private String maa;
    
    public Kortti(int arvo, String maa) {
        this.arvo = arvo;
        this.maa = maa;
    }
    
    public int getArvo() {
        return this.arvo;
    }
    
    public String getMaa() {
        return this.maa;
    }
    
    @Override
    public String toString() {
        return "[" + this.arvo + "]" + this.maa;
    }
}
