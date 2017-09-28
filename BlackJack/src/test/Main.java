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
public class Main {

    public static void main(String[] args) {
        Kassa kassa = new Kassa(200);
        upgrade up = new upgrade();
        for (int i = 0; i < 100; i++) {
            up.paivitaAuto();
            up.paivitaIhminen();
        }
        System.out.println(up.getUpgrade());
        kassa.setLaina(100);
    }
}
