package id.ac.polban.pbo.kantin.model;

public class Makanan extends MenuItem {
    private int levelPedas;

    public Makanan(String kode, String nama, int harga, int levelPedas) {
        super(kode, nama, harga);
        this.levelPedas = levelPedas;
    }

    public int getLevelPedas() {
        return levelPedas;
    }

    public void setLevelPedas(int levelPedas) {
        this.levelPedas = levelPedas;
    }

    @Override
    public void cekStatus() {
        super.cekStatus();
        System.out.println("  Level Pedas: " + levelPedas);
    }
}
