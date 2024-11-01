public class Minuman extends Menu {
    private boolean dingin;

    public Minuman(String nama, double harga, boolean dingin) {
        super(nama, harga);
        this.dingin = dingin;
    }

    public boolean isDingin() {
        return dingin;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Minuman: " + getNama() + ", Harga: " + getHarga() + ", Dingin: " + dingin);
    }
}