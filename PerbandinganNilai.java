
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class PerbandinganNilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang;

        do {
            System.out.println("========Program Perbandingan Nilai========");
            
            // Input for the first value
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = scanner.nextInt();
            
            // Input for the second value
            System.out.print("Masukkan nilai kedua: ");
            int nilaiKedua = scanner.nextInt();

            // Comparison of the two values
            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil: " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            // Asking the user if they want to repeat the activity
            System.out.print("Ulangi Aktifitas? (Ya/Tidak): ");
            scanner.nextLine();  // Consume the newline left by nextInt()
            ulang = scanner.nextLine();

        } while (ulang.equalsIgnoreCase("Ya"));

        System.out.println("Program selesai.");
        scanner.close();
    }
}
