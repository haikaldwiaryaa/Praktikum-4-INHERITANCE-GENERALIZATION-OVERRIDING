package id.ac.polban.pbo.kantin.model;

public class Pesanan {
    private static int nextNumber = 1;
    private int nomor;
    private Mahasiswa pemesan;
    private MenuItem menu;
    private int jumlah;

    public int getNomor() {
        return nomor;
    }

    public Pesanan(Mahasiswa pemesan, MenuItem menu, int jumlah) {
        this.nomor = nextNumber++;
        this.pemesan = pemesan;
        this.menu = menu;
        this.jumlah = jumlah;
    }

    public boolean dapatDiproses() {
        return jumlah > 0 && menu.isTersedia();
    }

    public int hitungTotal() {
        return menu.getHarga() * jumlah;
    }

    public void ringkasan() {
        System.out.println("Pesanan #" + nomor + " | Pemesan: " + pemesan.getNama()
                + " | Menu: " + menu.getNama() + " (" + jumlah + "x) | Total: Rp" + hitungTotal());
    }

    public void cetakRingkasan() {
        ringkasan();
    }

    public static int getJumlahPesananDibuat() {
        return nextNumber - 1;
    }
}
