package rekursif_iteratif;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.Callable;

public class PangkatIteratif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Angka: ");
        int angka = scanner.nextInt();
        System.out.print("Masukan pangkat: ");
        int n = scanner.nextInt();
        int hasil = 1;
        long startTime = System.currentTimeMillis();
        for (int i=0; i<n; i++){
            hasil *= angka;
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("hasil = " + hasil);
        System.out.println("waktu eksekusi: " + executionTime + " ms");


    }
}


