public class BarangElektronik extends Barang {
    private int garansiBulan;

    public BarangElektronik(String NamaBarang, String KodeBarang, String StatusBarang, int garansiBulan) {
        super(NamaBarang, KodeBarang, StatusBarang);
        this.garansiBulan = garansiBulan;
    }

    public int getGaransiBulan() {
        return garansiBulan;
    }

    public void setGaransiBulan(int garansiBulan) {
        this.garansiBulan = garansiBulan;
    }

    @Override
    public String getInfoBarang() {
        return super.getInfoBarang() + "\nGaransi: " + garansiBulan + " Bulan";
    }
}
