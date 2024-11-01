public class Pelanggan {
    private String nama;
    private String kontak;

    public Pelanggan(String nama, String kontak) {
        this.nama = nama;
        this.kontak = kontak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public void tampilkanInfoPelanggan() {
        System.out.println("Pelanggan: " + nama + ", Kontak: " + kontak);
    }
}
