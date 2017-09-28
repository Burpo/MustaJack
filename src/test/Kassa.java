/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author s1601382
 */
public class Kassa {

    int kassa;
    Pankki pankki = new Pankki();
    public Kassa(int kassa) {
        this.kassa = kassa;
    }

    public int getKassa() {
        return this.kassa;
    }

    public void toKassa(int maara) {
        this.kassa = this.kassa + maara;
    }
    
    public void setLaina(int maara){
        this.kassa = this.kassa + maara;
        pankki.setLaina(maara);
        System.out.println(kassa);
    }

}
