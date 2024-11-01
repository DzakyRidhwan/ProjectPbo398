import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Koki koki = new Koki();

        System.out.println("Selamat datang di Dzaky Resto!");

        while (true) {
            System.out.print("Masukkan nama pelanggan: ");
            String namaPelanggan = scanner.nextLine();
            System.out.print("Masukkan kontak pelanggan: ");
            String kontakPelanggan = scanner.nextLine();
            Pelanggan pelanggan = new Pelanggan(namaPelanggan, kontakPelanggan);

            System.out.println("Jenis pemesanan:");
            System.out.println("1. Dine-In");
            System.out.println("2. Take-Away");
            System.out.print("Pilih tipe pemesanan (1 atau 2): ");
            int tipePesanan = scanner.nextInt();
            scanner.nextLine(); 
            Resepsionis pesanan = null;

            if (tipePesanan == 1) {
                System.out.print("Masukkan nomor meja: ");
                int nomorMeja = scanner.nextInt();
                scanner.nextLine(); 
                pesanan = new ResepsionisDineIn(pelanggan, nomorMeja);
            } else if (tipePesanan == 2) {
                System.out.print("Masukkan waktu pengambilan (contoh: 12:30): ");
                String waktuAmbil = scanner.nextLine();
                pesanan = new ResepsionisTakeAway(pelanggan, waktuAmbil);
            } else {
                System.out.println("Tipe pemesanan tidak valid. Silakan coba lagi.");
                continue;
            }

            boolean tambahMenu = true;
            while (tambahMenu) {
                System.out.println("Pilih menu:");
                System.out.println("1. Makanan");
                System.out.println("2. Minuman");
                System.out.print("Pilih jenis menu (1 atau 2): ");
                int jenisMenu = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukkan nama menu: ");
                String namaMenu = scanner.nextLine();
                System.out.print("Masukkan harga menu: ");
                double hargaMenu = scanner.nextDouble();
                scanner.nextLine(); 

                if (jenisMenu == 1) {
                    System.out.print("Apakah pemesan vegetarian (true/false) ? ");
                    boolean vegetarian = scanner.nextBoolean();
                    scanner.nextLine(); 
                    Makanan makanan = new Makanan(namaMenu, hargaMenu, vegetarian);
                    pesanan.tambahkanPesanan(makanan);
                } else if (jenisMenu == 2) {
                    System.out.print("Apakah minumannya dingin (true/false) ? ");
                    boolean dingin = scanner.nextBoolean();
                    scanner.nextLine(); 
                    Minuman minuman = new Minuman(namaMenu, hargaMenu, dingin);
                    pesanan.tambahkanPesanan(minuman);
                } else {
                    System.out.println("Jenis menu tidak valid.");
                    continue;
                }

                System.out.print("Apakah Anda ingin menambahkan menu lain (yes/no) ? ");
                String jawaban = scanner.nextLine();
                tambahMenu = jawaban.equalsIgnoreCase("yes");
            }

            pesanan.buatPesanan();
            koki.catatPesanan(pesanan);

            System.out.print("Apakah Anda ingin membuat pesanan lain? (yes/no): ");
            String jawab = scanner.nextLine();
            if (jawab.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("\nRiwayat Pesanan di Dzaky Resto:");
        koki.tampilkanRiwayatPesanan();
        scanner.close();
    }
}
