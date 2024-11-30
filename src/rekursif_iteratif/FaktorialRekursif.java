package rekursif_iteratif;

import java.math.BigInteger;
import java.util.Scanner;

public class FaktorialRekursif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah suku: ");
        int n = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        BigInteger hasil = hitungFaktorial(n);

        System.out.println("Faktorial dari " + n + " adalah: " + hasil);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Waktu eksekusi: " + executionTime + " ms");
    }

    public static BigInteger hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(hitungFaktorial(n - 1));
        }
    }
}
