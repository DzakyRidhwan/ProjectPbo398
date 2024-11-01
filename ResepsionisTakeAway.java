public class ResepsionisTakeAway extends Resepsionis {
    private String waktuAmbil;

    public ResepsionisTakeAway(Pelanggan pelanggan, String waktuAmbil) {
        super(pelanggan);
        this.waktuAmbil = waktuAmbil;
    }

    public String getWaktuAmbil() {
        return waktuAmbil;
    }

    @Override
    public void buatPesanan() {
        setStatus("Siap diambil pada pukul " + waktuAmbil);
        System.out.println("Pesanan take-away siap diambil pada pukul " + waktuAmbil);
    }
}
