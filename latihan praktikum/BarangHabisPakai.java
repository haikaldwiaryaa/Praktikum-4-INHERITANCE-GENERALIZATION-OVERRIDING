public class BarangHabisPakai extends Barang {
    private int stok;

    public BarangHabisPakai(String NamaBarang, String KodeBarang, String StatusBarang, int stok) {
        super(NamaBarang, KodeBarang, StatusBarang);
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }

    @Override
    public String getInfoBarang() {
        return super.getInfoBarang() + "\nStok: " + stok + " unit";
    }
}
