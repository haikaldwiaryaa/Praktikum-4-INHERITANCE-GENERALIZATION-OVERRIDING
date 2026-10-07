public class Lokasi {
    private String KodeLokasi;
    private String NamaLokasi;

    public Lokasi(String KodeLokasi, String NamaLokasi) {
        this.KodeLokasi = KodeLokasi;
        this.NamaLokasi = NamaLokasi;
    }

    public String getKodeLokasi() {
        return KodeLokasi;
    }

    public String getNamaLokasi() {
        return NamaLokasi;
    }

    public String getInfoLokasi() {
        return "Kode Lokasi: " + KodeLokasi + "\nNama Lokasi: " + NamaLokasi;
    }
}