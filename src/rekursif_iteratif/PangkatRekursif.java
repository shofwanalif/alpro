package rekursif_iteratif;

import java.math.BigInteger;
import java.util.*;

public class PangkatRekursif {
    public static BigInteger hitungPangkat(int angka, int n) {
        // Kasus dasar: jika n == 0, hasilnya adalah 1
        if (n == 0) {
            return BigInteger.ONE;
        } else {
            // Memanggil diri sendiri untuk menghitung pangkat
            return BigInteger.valueOf(angka).multiply(hitungPangkat(angka, n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka = scanner.nextInt();
        System.out.print("Masukkan pangkat: ");
        int n = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        BigInteger hasil = hitungPangkat(angka, n);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Hasil = " + hasil);
        System.out.println("Waktu eksekusi: " + executionTime + " ms");
    }
}
