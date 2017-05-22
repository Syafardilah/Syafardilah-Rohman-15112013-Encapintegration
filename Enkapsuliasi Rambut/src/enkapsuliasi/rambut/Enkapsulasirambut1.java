/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsuliasi.rambut;

/**
 *
 * @author windows7
 */
public class Enkapsulasirambut1 {
    
    public static void main(String[] args){
        EnkapsuliasiRambut Keriting = new EnkapsuliasiRambut();
        Keriting.setJenis("Lurus");
        Keriting.setWarna("Hitam");
        
        System.out.println(Keriting.getJenis());
        System.out.println(Keriting.getWarna());
        
    }
}
