import java.util.Scanner;
public class modul1 {


        public static void main(String[] args) {
            String pilih_operasi;
            int nilai_a = 0;
            int nilai_b = 0;
            double hasil;

            Scanner input_pilihan = new Scanner(System.in);
            System.out.println("_______");
            System.out.println("PILIHAN PENJUMLAHAN ARITMATIKA: ");
            System.out.println("===============================");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("_______");
            System.out.print("Masukkan pilihan [1/2/3]: ");
            pilih_operasi = input_pilihan.next();

            // Logika
            if (pilih_operasi.equals("1")) {
                System.out.println("Masukkan Nilai A: ");
                nilai_a = input_pilihan.nextInt();
                System.out.println("Masukkan Nilai B: ");
                nilai_b = input_pilihan.nextInt();

                hasil = nilai_a + nilai_b;

                System.out.println("Masukkan nilai A adalah: " + nilai_a );
                System.out.println("Masukkan nilai B adalah: "  + nilai_b);
                System.out.println("Hasil penjumlahan adalah: " + hasil);
            } else if (pilih_operasi.equals("2")) {
                System.out.println("Masukkan Nilai A: ");
                nilai_a = input_pilihan.nextInt();
                System.out.println("Masukkan Nilai B: ");
                nilai_b = input_pilihan.nextInt();

                hasil = nilai_a - nilai_b;

                System.out.println("Masukkan nilai A adalah: " + nilai_a );
                System.out.println("Masukkan nilai B adalah: "  + nilai_b);
                System.out.println("Hasil penjumlahan adalah: " + hasil);
            } else if (pilih_operasi.equals("3")) {
                System.out.println("Masukkan Nilai A: ");
                nilai_a = input_pilihan.nextInt();
                System.out.println("Masukkan Nilai B: ");
                nilai_b = input_pilihan.nextInt();

                hasil = nilai_a * nilai_b;

                System.out.println("Masukkan nilai A adalah: " + nilai_a );
                System.out.println("Masukkan nilai B adalah: "  + nilai_b);
                System.out.println("Hasil penjumlahan adalah: " + hasil);

            } else {
                System.out.println("Pilihan tidak ada!");
            }
            // Akhir Logika

        }
    }
