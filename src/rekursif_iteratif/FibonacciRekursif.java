package rekursif_iteratif;

import java.util.Scanner;

public class FibonacciRekursif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah suku: ");
        int n = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        System.out.println("Deret Fibonacci:");

        for (int i = 0; i < n; i++) {
            System.out.print(recursiveFib(i) + " ");
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println();
        System.out.println("Waktu eksekusi: " + executionTime + " ms");
    }

    static long recursiveFib(int n) {
        return (n <= 1) ? n : recursiveFib(n - 1) + recursiveFib(n - 2);
    }
}
