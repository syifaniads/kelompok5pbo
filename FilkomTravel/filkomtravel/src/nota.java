public class Nota {
    private String namaPelanggan;
    private String jenis;
    private int lamaSewa;
    private double totalBiaya;
    private boolean member;

    // Method untuk cetak nota member dengan diskon 20%
    public void cetakNotaMember(double hargaPaket) {
        double totalBiayaSetelahDiskon = (totalBiaya + hargaPaket) * 0.8; // Memberikan diskon 20%
        System.out.println("=".repeat(52));
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Jenis: " + jenis);
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.printf("Harga Paket Travel: Rp %.0f\n", hargaPaket);
        System.out.printf("Total Biaya (Member): Rp %.0f\n", totalBiayaSetelahDiskon);
        System.out.println("=".repeat(52)); // Menampilkan total biaya setelah diskon
    }

    // Method untuk cetak nota non-member tanpa diskon
    public void cetakNotaNonMember(double hargaPaket) {
        double totalBiayaNonMember = totalBiaya + hargaPaket; // Tidak ada diskon untuk non-member
        System.out.println("=".repeat(52));
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Jenis: " + jenis);
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.printf("Harga Paket Travel: Rp %.0f\n", hargaPaket);
        System.out.printf("Total Biaya (Non Member): Rp %.0f\n", totalBiayaNonMember);
        System.out.println("=".repeat(52)); // Menampilkan total biaya
    }

    // Method untuk mencetak total biaya dari paket travel saja
    public void cetakNotaPaket(double hargaPaket) {
        System.out.println("=".repeat(52));
        System.out.println("Jenis: " + jenis);
        System.out.println("Harga Paket Travel: Rp " + hargaPaket);
        System.out.println("=".repeat(52)); // Menampilkan total biaya dari paket travel saja
    }

    // Getter dan setter

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public void setTotalBiaya(double totalBiaya) {
        this.totalBiaya = totalBiaya;
    }

    public void setMember(boolean member) {
        this.member = member;
    }
}
