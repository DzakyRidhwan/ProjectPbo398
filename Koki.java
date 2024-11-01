import java.util.ArrayList;

public class Koki {
    private ArrayList<Resepsionis> daftarPesanan = new ArrayList<>();

    public void catatPesanan(Resepsionis pesanan) {
        daftarPesanan.add(pesanan);
    }

    public void tampilkanRiwayatPesanan() {
        System.out.println("Riwayat Pesanan yang Dikelola Koki di Dzaky Resto :");
        for (Resepsionis pesanan : daftarPesanan) {
            pesanan.tampilkanDetailPesanan();
        }
    }
}
