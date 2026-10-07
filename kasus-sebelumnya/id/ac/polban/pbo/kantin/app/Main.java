package id.ac.polban.pbo.kantin.app;

import id.ac.polban.pbo.kantin.model.Mahasiswa;
import id.ac.polban.pbo.kantin.model.MenuItem;
import id.ac.polban.pbo.kantin.model.Makanan;
import id.ac.polban.pbo.kantin.model.Minuman;
import id.ac.polban.pbo.kantin.model.Pesanan;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Asep", "241001", "D3-Informatika");
        Mahasiswa m2 = new Mahasiswa("Siti", "241002", "D3-Informatika");
        Mahasiswa m3 = new Mahasiswa("jita", "241003", "D3-Informatika");

        MenuItem nasi = new MenuItem("M001", "Nasi Goreng", 15000);
        MenuItem kopi = new MenuItem("K001", "Kopi", 5000);
        MenuItem roti = new MenuItem("R001", "Roti", 3000);

        kopi.tandaiHabis();

        Pesanan p1 = new Pesanan(m1, nasi, 2);
        Pesanan p2 = new Pesanan(m2, kopi, 1);
        Pesanan p3 = new Pesanan(m3, roti, 3);

        System.out.println("P1 dapat diproses: " + p1.dapatDiproses());
        System.out.println("Total P1: " + p1.hitungTotal());
        System.out.println("P2 dapat diproses: " + p2.dapatDiproses());
        System.out.println("P3 dapat diproses: " + p3.dapatDiproses());
        System.out.println("Total P3: " + p3.hitungTotal());
        p3.ringkasan();

        System.out.println("Nomor P1: " + p1.getNomor());
        System.out.println("Nomor P2: " + p2.getNomor());
        System.out.println("Nomor P3: " + p3.getNomor());
        System.out.println("Total Pesanan Dibuat: " + Pesanan.getJumlahPesananDibuat());

        System.out.println("\n=== PENGUJIAN KASIR (CHALLENGE A) ===");
        Kasir kasir = new Kasir();
        System.out.print("Memproses P1: ");
        kasir.proses(p1);
        System.out.print("Memproses P2: ");
        kasir.proses(p2);

        System.out.println("\n=== PENGUJIAN INHERITANCE (MAKANAN & MINUMAN) ===");
        Makanan mieAyam = new Makanan("F001", "Mie Ayam", 13000, 3);
        Minuman esTeh = new Minuman("D001", "Es Teh Manis", 4000, "Large");

        mieAyam.cekStatus();
        esTeh.cekStatus();

        Pesanan p4 = new Pesanan(m1, mieAyam, 1);
        p4.ringkasan();
        System.out.print("Memproses P4: ");
        kasir.proses(p4);
    }
}
