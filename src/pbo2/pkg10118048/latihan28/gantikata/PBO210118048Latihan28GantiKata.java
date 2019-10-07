/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : mengganti kata dalam sebuah kalimat
 */
public class PBO210118048Latihan28GantiKata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String asli, ganti, menjadi;
        
        System.out.println("=====Program Mengganti Kata=====");
        System.out.print("\nMasukkan Kalimat : ");
        asli = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        ganti = scanner.next();
        System.out.print("Menjadi Kata : ");
        menjadi = scanner.next();
        tampilHasil(asli, ganti, menjadi);
    }
    
    public static void tampilHasil(String asli, String ganti, String menjadi) {
        System.out.println("\n=====Hasil Formatting=====");
        System.out.println("Kalimat awal : " +asli);
        asli = asli.replaceAll(ganti, menjadi);
        System.out.println("Kalimat baru : " +asli);
    }

}
