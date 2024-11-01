import java.util.ArrayList;

public abstract class Resepsionis {
    private Pelanggan pelanggan;
    private double totalHarga;
    private String status;
    private ArrayList<Menu> pesananList;

    public Resepsionis(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
        this.status = "Belum Diproses";
        this.totalHarga = 0;
        this.pesananList = new ArrayList<>();
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void tambahkanPesanan(Menu pesanan) {
        pesananList.add(pesanan);
        totalHarga += pesanan.getHarga();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract void buatPesanan();

    public void tampilkanDetailPesanan() {
        System.out.println("Pelanggan: " + pelanggan.getNama() + ", Total Harga: " + totalHarga + ", Status: " + status);
        System.out.println("Daftar Pesanan:");
        for (Menu item : pesananList) {
            item.tampilkanInfo();
        }
    }
}
