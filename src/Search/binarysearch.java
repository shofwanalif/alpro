package Search;
import java.util.*;

public class binarysearch {
    static class search{
        public int binSearch(int arr[], int key){
            int awal = 0;
            int akhir = arr.length-1;

            while (awal <= akhir){
                int tengah = (awal+akhir)/2;

                if (arr[tengah] == key){
                    return tengah;
                } else if (arr[tengah] < key) {
                    awal = tengah + 1;
                } else {
                    akhir = tengah - 1;
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
        dicari = obj.binSearch(arr, key);
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
