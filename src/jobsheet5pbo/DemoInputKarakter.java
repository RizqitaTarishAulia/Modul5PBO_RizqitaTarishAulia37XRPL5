/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5pbo;
import java.io.*;
/**
 *
 * @author Tarishaulia
 */
public class DemoInputKarakter {
    public static void main(String[] Args) throws IOException{
        System.out.print("Masukkan sembarang karakter : ");
        char ch;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ch = (char) br.read();
        System.out.println("Karakter yang dimasukkan adalah \'" +ch+ "\'");
    }
}
