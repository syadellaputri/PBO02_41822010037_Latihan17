/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app.pb002.latihan17;
import java.util.Scanner;

/**
 *
 * @author DelDel
 * Nama : Syadella Putri
 * NIM  : 41822010037
 * Nama : Anastasya Azami
 * NIM  : 41822010081
 */
public class PB00241822010037Latihan17 {

    public static void main(String[] args) {
        System.out.println("FOrmat Latihan PBO");
        
        // Deklarasi
        float gaji, tunjangan, total;
        String status;
        Scanner objek = new Scanner(System.in);

        // Proses input
        System.out.println("================ Program Tunjangan ============");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        gaji = objek.nextFloat();

        // Konsumsi karakter newline yang tersisa di buffer
        objek.nextLine();

        System.out.print("Status Anda? (Menikah/Belum): ");
        status = objek.nextLine();

        // Perhitungan gaji
        tunjangan = gaji * 0.35f;
        total = gaji + tunjangan;

        // Output
        System.out.println("============== Hasil Perhitungan Gaji Anda ============");
        System.out.println("Status Anda : " + status);
        System.out.println("Gaji Pokok : Rp. " + gaji);
        System.out.println("Tunjangan : Rp. " + tunjangan);
        System.out.println("Total Gaji : Rp. " + total);

        
    }
}
