/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display;

/**
 *
 * @author ASUS X450JN
 */
public class Toko {
    private String Admin;
    protected String Merk;
    protected int Total;
    public Float Harga;
    
    public void display(){
        System.out.println("Masukkan Barang : ");
    }
    
    public void setAdmin(String Admin){
        this.Admin = Admin;
    }
    
    public String getAdmin(){
        return Admin;
    }
    
}
