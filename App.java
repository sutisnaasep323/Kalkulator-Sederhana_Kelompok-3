import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char pilihan;
        
        do {
            // Meminta pengguna memasukkan dua angka
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();
            
            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();
            
            // Menampilkan menu operasi
            System.out.println("Pilih operasi:");
            System.out.println("1. Pembagian");
            System.out.println("2. Pengurangan");
            System.out.println("3. Penjumlahan");
            System.out.println("4. Perkalian");
            
            // Meminta pengguna memilih operasi
            System.out.print("Masukkan nomor operasi: ");
            int operasi = scanner.nextInt();
            
            // Memanggil method dan menampilkan hasil operasi
            double hasil = hitung(angka1, angka2, operasi);
            System.out.println("Hasil: " + hasil);
            
            // Meminta pengguna apakah ingin mengulangi program
            System.out.print("Ingin mengulangi program? (y/n): ");
            pilihan = scanner.next().charAt(0);
            
        } while (pilihan == 'y' || pilihan == 'Y');

        System.out.println("Terima kasih! Program selesai.");
        scanner.close();
    }

    // Method untuk melakukan operasi berdasarkan pilihan
    static double hitung(double angka1, double angka2, int operasi) {
        double hasil = 0;

        switch (operasi) {
            case 1:
                hasil = bagi(angka1, angka2);
                break;
            case 2:
                
            case 3:
                
            case 4:
                
            default:
                System.out.println("Operasi tidak valid.");
        }

        return hasil;
    }

    // Method untuk membagi dua angka
    static double bagi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
            return Double.NaN; // NaN (Not a Number) sebagai nilai default jika terjadi kesalahan
        }
    }
}