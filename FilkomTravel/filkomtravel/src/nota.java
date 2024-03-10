public class Nota {
    private String namaPelanggan;
    private String jenis;
    private int lamaSewa;
    private double totalBiaya;
    private int voucherMember;

    public void cetakNota() {
        // implementasi
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
