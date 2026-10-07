public class PencatatanInventaris {
    private String KodePencatatan;
    private Barang barang;
    private Lokasi lokasi;

    public PencatatanInventaris(String KodePencatatan, Barang barang, Lokasi lokasi) {
        this.KodePencatatan = KodePencatatan;
        this.barang = barang;
        this.lokasi = lokasi;
    }

    public String getKodePencatatan() {
        return KodePencatatan;
    }

    public Barang getBarang() {
        return barang;
    }

    public Lokasi getLokasi() {
        return lokasi;
    }

    public String getInfoPencatatan() {
        return "Kode Pencatatan: " + KodePencatatan + "\nNama Barang: " + barang.getNamaBarang() + "\nKode Barang: "
                + barang.getKodeBarang() + "\nStatus Barang: " + barang.getStatusBarang() + "\nKode Lokasi: "
                + lokasi.getKodeLokasi() + "\nNama Lokasi: " + lokasi.getNamaLokasi();
    }
}
