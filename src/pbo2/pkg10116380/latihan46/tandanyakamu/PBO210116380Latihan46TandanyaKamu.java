/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 * @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang mengetahui tanda seseorang dari umur
 */
public class PBO210116380Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner baca = new Scanner(System.in);
        Age mal1 = new Age(2018);
        System.out.print("Masukkan Tahun Lahir : ");
        mal1.setYearBirth(baca.nextInt());
        System.out.println("");
        System.out.println("===Hasil Perhitungan Umur===");
        System.out.println("Tahun Lahir Anda : " + mal1.getYearBirth());
        System.out.println("Hari ini Tahun : " + mal1.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah : " + mal1.hitungUmur() + " Tahun");
        mal1.tandanyaKamu(mal1.hitungUmur());
        
    }
    
}
