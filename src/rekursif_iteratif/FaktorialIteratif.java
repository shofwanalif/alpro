package rekursif_iteratif;

import java.math.BigInteger;
import java.util.Scanner;

public class FaktorialIteratif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan jumlah suku: ");
        int n = scanner.nextInt();
        BigInteger hasil = BigInteger.ONE;
        long startTime = System.currentTimeMillis();
        System.out.print("faktorial dari " + n + " adalah: ");
        for (int i = 2; i<= n; i++){
            hasil = hasil.multiply(BigInteger.valueOf(i));
        }
        System.out.println(hasil);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime-startTime;
        System.out.println("Waktu eksekusi: " + executionTime + " ms");
    }
}
