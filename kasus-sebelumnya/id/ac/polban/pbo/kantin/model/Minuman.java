package id.ac.polban.pbo.kantin.model;

public class Minuman extends MenuItem {
    private String ukuran;

    public Minuman(String kode, String nama, int harga, String ukuran) {
        super(kode, nama, harga);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public void cekStatus() {
        super.cekStatus();
        System.out.println("  Ukuran: " + ukuran);
    }
}
