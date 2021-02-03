/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiga;
import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Kendaraan {
    
    static void input(){
        String N,P,W,B,J,C,T;
        Scanner I = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("Data Kendaraan");
        System.out.println("==============");
        System.out.print("Nama pemilik\t: ");
        N = I.nextLine();
        System.out.print("Plat nomor\t: ");
        P = I.nextLine();
        System.out.print("Warna\t\t: ");
        W = I.nextLine();
        System.out.print("Brand\t\t: ");
        B = I.nextLine();
        System.out.print("Jenis mobil\t: ");
        J = I.nextLine();
        System.out.print("CC\t\t: ");
        C = I.nextLine();
        System.out.print("Tahun pembuatan\t: ");
        T = I.nextLine();
    }
}
