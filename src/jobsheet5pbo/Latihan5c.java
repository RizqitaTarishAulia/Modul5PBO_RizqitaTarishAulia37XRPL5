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
public class Latihan5c {
    public static void uji(int angka)throws NullPointerException,ArithmeticException {
        if (angka < 0){
            throw new NullPointerException("KESALAHAN : null pointer exception");
        }else{
            throw new ArithmeticException("KESLAHAN : arithmetic exception");
        }
    }

    public static void main(String[] args){
        try{
            //uji(-12); //menimbulkan eksepsi NullPointerException
            uji(0); //menimbulkan eksepsi ArithmeticException
        }catch (Exception e){
            System.out.println("Exception ditangkap di sini..");
            System.out.println(e.getMessage());
        }
        System.out.println("Statemen setelah blok try-catch");
    }
}

