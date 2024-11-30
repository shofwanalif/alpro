package rekursif_iteratif;

import java.util.Scanner;

public class FibonacciIteratif {
    public static void main(String[] args) {
        int Bil1 = 0;
        int Bil2 = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan suku jumlah suku: ");
        int n = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        System.out.print("Deret fibonacci: ");
        for (int i= 1; i<=n; ++i){
            System.out.print(Bil1 + " ");
            Bil1 = Bil2 + (Bil2 = Bil1);
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println();
        System.out.println("waktu eksekusi: " + executionTime + " ms");
    }
}