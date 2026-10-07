public class Barang {
    private String NamaBarang;
    private String KodeBarang;
    private String StatusBarang;

    public Barang(String NamaBarang, String KodeBarang, String StatusBarang) {
        this.NamaBarang = NamaBarang;
        this.KodeBarang = KodeBarang;
        this.StatusBarang = StatusBarang;
    }

    public String getNamaBarang() {
        return NamaBarang;
    }

    public String getKodeBarang() {
        return KodeBarang;
    }

    public String getStatusBarang() {
        return StatusBarang;
    }

    public void tandaiRusak() {
        this.StatusBarang = "Rusak";
    }

    public void tandaiHilang() {
        this.StatusBarang = "Hilang";
    }

    public void Perbaiki() {
        this.StatusBarang = "Bagus";
    }

    public String getInfoBarang() {
        return "Nama Barang: " + NamaBarang + "\nKode Barang: " + KodeBarang + "\nStatus Barang: " + StatusBarang;
    }

}