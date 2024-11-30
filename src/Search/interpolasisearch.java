package Search;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class interpolasisearch {
    static class search{
        public int interSearch(int arr[], int key){
            int awal = 0;
            int akhir = arr.length-1;

            while (awal <= akhir && key >= arr[awal] && key <= arr[akhir]){
                int posisi = awal + ((key - arr[awal]) * (akhir-awal)) / (arr[akhir]-arr[awal]);

                if (arr[posisi] == key){
                    return posisi;
                } else if (arr[posisi] < key) {
                    awal = posisi + 1;
                } else {
                    akhir = posisi - 1;
                }
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        search obj = new search();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int key;
        int jmlAngka;
        int dicari;

        System.out.println("Masukan jumlah angka: ");
        jmlAngka = scanner.nextInt();

        int [] arr = new int[jmlAngka];

        for (int i = 0; i < jmlAngka; i++) {
            arr[i] = random.nextInt(jmlAngka);
        }

        System.out.println("Masukan angka yang ingin di cari: ");
        key = scanner.nextInt();

        long startTime = System.currentTimeMillis();

        Arrays.sort(arr);
        dicari = obj.interSearch(arr, key);
        if (dicari != -1){
            System.out.println("angka " + key + " berada pada index: " + dicari + " dalam array");
        } else {
            System.out.println("Angka tidak di temukan");
        }

        long endTime = System.currentTimeMillis();
        long waktuEksekusi = endTime -startTime;

        System.out.print("waktu eksekusi: " + waktuEksekusi + " ms");

        scanner.close();

    }
}
