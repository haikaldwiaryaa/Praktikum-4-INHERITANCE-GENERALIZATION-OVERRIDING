public class Main {
    public static void main(String[] args) {
        // === 1. PENGUJIAN FUNGSI TUGAS LAMA (REGRESI T4-07) ===
        System.out.println("=== PENGUJIAN TUGAS LAMA (REGRESI) ===");
        Barang mouse = new Barang("Mouse", "M001", "Bagus");
        Barang keyboard = new Barang("Keyboard", "K001", "Bagus");
        Barang monitor = new Barang("Monitor", "Mo001", "Bagus");
        Lokasi PJBL = new Lokasi("L101", "Ruang PJBL");
        Lokasi Labkom = new Lokasi("L102", "Ruang Labkom");
        Lokasi RSG = new Lokasi("L102", "Ruang Serba Guna");

        PencatatanInventaris InventarisPJBL = new PencatatanInventaris("P12345", mouse, PJBL);
        PencatatanInventaris InventarisLabkom = new PencatatanInventaris("L030923", keyboard, Labkom);
        PencatatanInventaris InventarisRSG = new PencatatanInventaris("R342443", monitor, RSG);

        System.out.println("Info Inventaris PJBL:\n" + InventarisPJBL.getInfoPencatatan() + "\n");
        System.out.println("Info Inventaris Labkom:\n" + InventarisLabkom.getInfoPencatatan() + "\n");
        System.out.println("Info Inventaris RSG:\n" + InventarisRSG.getInfoPencatatan() + "\n");

        System.out.println("Keadaan sesudah diganti statusnya:");
        mouse.tandaiRusak();
        keyboard.tandaiHilang();
        monitor.Perbaiki();
        System.out.println("Info Inventaris PJBL:\n" + InventarisPJBL.getInfoPencatatan() + "\n");
        System.out.println("Info Inventaris Labkom:\n" + InventarisLabkom.getInfoPencatatan() + "\n");
        System.out.println("Info Inventaris RSG:\n" + InventarisRSG.getInfoPencatatan() + "\n");

        // === 2. PENGUJIAN SUBCLASS HASIL REFACTOR (STEP 19 & 20) ===
        System.out.println("=== PENGUJIAN INHERITANCE (BARANG ELEKTRONIK & HABIS PAKAI) ===");
        
        // T4-01: Pembuatan object subclass melalui constructor
        BarangElektronik laptop = new BarangElektronik("Laptop Asus", "E001", "Bagus", 24);
        BarangHabisPakai spidol = new BarangHabisPakai("Spidol Boardmarker", "H001", "Bagus", 50);

        // T4-02: Method warisan superclass dipanggil dari subclass
        laptop.tandaiRusak();
        System.out.println("Status laptop setelah ditandai rusak (method warisan): " + laptop.getStatusBarang());

        // T4-03 & T4-04: Method override dipanggil dan memakai super.getInfoBarang()
        System.out.println("\nInfo Detail Laptop (Override + super.getInfoBarang):");
        System.out.println(laptop.getInfoBarang());

        System.out.println("\nInfo Detail Spidol (Override + super.getInfoBarang):");
        System.out.println(spidol.getInfoBarang());

        // T4-06: Menguji behavior khusus masing-masing subclass
        System.out.println("\nMengurangi stok spidol sebanyak 10:");
        spidol.kurangiStok(10);
        System.out.println("Sisa stok spidol sekarang: " + spidol.getStok() + " unit");

        // Pencatatan inventaris dengan polymorphism
        PencatatanInventaris inventarisLaptop = new PencatatanInventaris("P9901", laptop, Labkom);
        System.out.println("\nInfo Pencatatan Inventaris Laptop:");
        System.out.println(inventarisLaptop.getInfoPencatatan());
    }
}
