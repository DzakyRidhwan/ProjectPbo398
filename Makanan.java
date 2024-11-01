public class Makanan extends Menu {
    private boolean vegetarian;

    public Makanan(String nama, double harga, boolean vegetarian) {
        super(nama, harga);
        this.vegetarian = vegetarian;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Makanan: " + getNama() + ", Harga: " + getHarga() + ", Vegetarian: " + vegetarian);
    }
}