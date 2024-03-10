public class Penyewa extends user {
    private String nama;
    private String noHP;
    private String alamat;
    private String noPol;
    private double hargaSewa;
    private String jenisKendaraan;

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
    public void setNoPol(String noPol) {
        this.noPol = noPol;
    }
    public void setStatusKendaraan(boolean status) {
        // implementasi
    }
    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }
}
