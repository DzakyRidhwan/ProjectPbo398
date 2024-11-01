public class ResepsionisDineIn extends Resepsionis {
    private int nomorMeja;

    public ResepsionisDineIn(Pelanggan pelanggan, int nomorMeja) {
        super(pelanggan);
        this.nomorMeja = nomorMeja;
    }

    public int getNomorMeja() {
        return nomorMeja;
    }

    @Override
    public void buatPesanan() {
        setStatus("Dine-In di meja " + nomorMeja);
        System.out.println("Pesanan dine-in di meja " + nomorMeja + " telah dibuat.");
    }
}