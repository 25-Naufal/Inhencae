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
public class TV extends Toko{
    String Tipe;
    
    public void setMerk(String Merk){
        super.Merk = Merk;
    }
    public String getMerk(){
        return Merk;
    }
    public void setTipe(String Tipe){
        this.Tipe = Tipe;
    }
    public String getTipe(){
        return Tipe;
    }
    public void setTotal(int Total){
        super.Total = Total;
        
    }
    public int getTotal(){
        return Total;
    }
    public void setHarga(float Harga){
        super.Harga = Harga;
    }
    public float getHarga(){
        return Harga;
    }
    public void display(){
        System.out.println("TV tahan lama memang mantap");
    }
}
