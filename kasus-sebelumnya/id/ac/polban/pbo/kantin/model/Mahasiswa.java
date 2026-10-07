package id.ac.polban.pbo.kantin.model;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;

    // Constructor sesuai starter modul (nim, nama)
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    // Overloaded constructor jika menyertakan prodi
    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }
}
