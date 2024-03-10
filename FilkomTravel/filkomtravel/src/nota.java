public class Nota {
    private String namaPelanggan;
    private String jenis;
    private int lamaSewa;
    private double totalBiaya;
    private int voucherMember;
    private double totalBiayaSetelahDiskon;

    public void cetakNota() { 
        if (member) {
            System.out.println("=".repeat(52));
            System.out.println("Nama Pelanggan: " + namaPelanggan);
            System.out.println("Jenis: " + jenis);
            System.out.println("Lama Sewa: " + lamaSewa + " hari");
            totalBiayaSetelahDiskon = totalBiaya - (totalBiaya * 0.2); 
            System.out.println("=".repeat(52));// Memberikan diskon 20%
        } else {
            totalBiayaSetelahDiskon = totalBiaya; // Tidak ada diskon untuk non-member
        }
        System.out.println("=".repeat(52));
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Jenis: " + jenis);
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Total Biaya: Rp " + totalBiayaSetelahDiskon);
        System.out.println("=".repeat(52)); // Menampilkan total biaya setelah diskon
    }
    public double getTotalBiaya() {
        return this.totalBiaya;
    }
    public void setTotalBiaya(double totalBiaya) {
        this.totalBiaya = totalBiaya;
    }
    public int getVoucherMember() {
        return this.voucherMember;
    }
    public void setVoucherMember(int voucherMember) {
        this.voucherMember = voucherMember;
    }
}
