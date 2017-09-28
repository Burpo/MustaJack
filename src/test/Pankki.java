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
public class Pankki {

    int laina;
    int kokonaisLaina;
    
    
    public void setLaina(int maara) {
        this.kokonaisLaina =+ maara;
        this.laina =+ maara;
    }
    
    public int getLaina(){
        return this.laina;
    }
}
