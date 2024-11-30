package Search;
import java.util.*;

public class sequentialsearch {
    static class search{
        public int seqSearch(int arr[], int key){
            for (int i = 0; i < arr.length; i++) {
                if (key == arr[i]){
                    return i;
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
        dicari = obj.seqSearch(arr, key);

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
