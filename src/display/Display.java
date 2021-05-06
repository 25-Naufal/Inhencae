/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display;

import java.util.Scanner;

/**
 *
 * @author ASUS X450JN
 */
public class Display {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //oject
        Toko java = new Toko();
        Smartphone hp = new Smartphone();
        TV tv = new TV ();
        KipasAngin kipas = new KipasAngin();
        
        Scanner input = new Scanner(System.in);
        
        java.display();
        System.out.println("Admin : ");
        java.setAdmin(input.next());
        
        System.out.println("Merk HP : ");
        hp.setMerk(input.next());
        
        System.out.println("Merk TV : ");
        tv.setMerk(input.next());
        
        System.out.println("Total Kipas Angin : ");
        kipas.setMerk(input.next());
        
        System.out.println("Yang dipilih : ");
        System.out.println("Merk HP : "+hp.getMerk());
        System.out.println("Merk TV : "+tv.getMerk());
        System.out.println("Merk Kipas Angin : "+kipas.getMerk());
    }
    
}
