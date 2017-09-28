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
public class upgrade {
    int auto = 0;
    int ihminen = 0;
    
    public void paivitaAuto(){
        auto++;
    }
    
    public void paivitaIhminen(){
        ihminen++;
    }
    
    public String getUpgrade() {
        return "Auto: " + this.auto + ", ihminen: " + this.ihminen;
    }
}
