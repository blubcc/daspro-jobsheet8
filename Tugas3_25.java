import java.util.Scanner;

public class Tugas3_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
        
        if (jumlahToko <= 0) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalBarangSeluruhToko = 0;
            int maxBarang = -1;
            int tokoTerbaik = 1;
            
            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("--- Toko " + i + " ---");
                System.out.print("Masukkan jumlah pelanggan: ");
                int jumlahPelanggan = sc.nextInt();
                
                int totalBarangToko = 0;
                
                for (int p = 1; p <= jumlahPelanggan; p++) {
                    System.out.print("  Jumlah barang yang dibeli pelanggan ke-" + p + ": ");
                    int barangPelanggan = sc.nextInt();
                    totalBarangToko += barangPelanggan;
                }
                
                System.out.println("Toko " + i + " -> pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);
                
                totalBarangSeluruhToko += totalBarangToko;
                
                if (totalBarangToko > maxBarang) {
                    maxBarang = totalBarangToko;
                    tokoTerbaik = i;
                }
            }
            
            System.out.println("==================================");
            System.out.println("Total barang seluruh toko       : " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak    : " + tokoTerbaik);
        }
        sc.close();
    }
}