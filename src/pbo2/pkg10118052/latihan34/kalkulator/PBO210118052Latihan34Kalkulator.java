/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program kalkulator dengan berbasis objek
 */
public class PBO210118052Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Kalkulator calc = new Kalkulator();
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        calc.value1 = scanner.nextDouble();
        
        System.out.print("Masukkan Angka ke-2 : ");
        calc.value2 = scanner.nextDouble();
        
        System.out.println("\nHasil Pertambahan : " + calc.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + calc.kurangBilangan());
        System.out.println("Hasil Perkalian : " + calc.kaliBilangan());
        System.out.println("Hasil Pembagian : " + formatBagi(
                calc.bagiBilangan(), calc.sisaBilangan()
        ));
        System.out.println("Hasil Sisa : " + calc.sisaBilangan());
    }
    
    public static String formatBagi(double hasilBagi, double sisa) {
        String bagi = String.format("%.3f", hasilBagi);
        
        // tentukan posisi titik
        int idx = bagi.indexOf(".");
        
        // cek jika simbol double-nya koma
        if(idx < 0) idx = bagi.indexOf(",");
        
        // cek apakah merupakan bilangan bulat atau bukan
        if(sisa > 0) {
            // formatting
            bagi = bagi.substring(0, idx) + "," + bagi.substring(idx+1, idx+3);
        } else {
            // formatting
            bagi = bagi.substring(0, idx);
        }
        
        return bagi;
    }
    
}