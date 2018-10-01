/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5pbo;

/**
 *
 * @author Tarishaulia
 */
public class Latihan6 extends Exception{
    private int bilangan;
    // default constructor
    Latihan6(){
    }
    // constructor dengan parameter bertipe String
    Latihan6(String pesan){
        super(pesan);
    }
    // constructor dengan parameter bertipe String dan int
    Latihan6(String pesan, int nilai){
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan(){
        return bilangan;
    }
}

class DemoMebuatEksepsi3{
    public static int hitungFaktorial(int n)
            throws Latihan6{
        if (n < 0){
            throw new Latihan6( // baris 31
            "Bilangan tidak boleh negatif", n);
        }
        int hasil = 1;
        for (int i=n; i>=1; i--){
            hasil *= i;
        }
        return hasil;
    }
    public static void main(String[] args){
        System.out.println("pada saat menghitung 5!");
        try{
            System.out.println("Hasil = " + hitungFaktorial(5));
        }catch (Latihan6 nne){
            System.out.println("Bilangan : " + nne.getBilangan());
            //nne.printStackTrace();
        }
         System.out.println("\nPada saat menghitung -5!");
         try{
             System.out.println("Hasil = "+ //baris 
                     hitungFaktorial(-5));
         }catch (Latihan6 nne){
             System.out.println("Bilangan: "+ 
                     nne.getBilangan());
             nne.printStackTrace();
         }
    }
}
