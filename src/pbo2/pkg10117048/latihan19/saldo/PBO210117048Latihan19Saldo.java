/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan19.saldo;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha
 * Kelas : PBO2 
 * NIM : 10117048
 * Deskripsi Program : Program ini berisi tentang saldo tabungan dalam waktu 
 *                     6 bulan.
 */
public class PBO210117048Latihan19Saldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bulan = 6;
        int i = 1;
        int  saldoTab = 2500000;
        double bunga = 0.15;
        double saldoBul;
      
        while (i <= bulan) {
           
            saldoBul = saldoTab * bunga;
            
            saldoTab = (int)(saldoTab + saldoBul);

            System.out.println("Saldo dibulan ke-" + i + "Rp."
            + (int) saldoTab);
            i++;
        }

    }

}
