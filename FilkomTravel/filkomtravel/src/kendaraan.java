// bener gak yuh
public class Kendaraan {
    String noPol;
    double hargaSewa;
    String jenisKendaraan;
    int kapasitas;
    boolean statusKendaraan;

    public void setStatusKendaraan(boolean statusKendaraan) {
        this.statusKendaraan = statusKendaraan;
    }
    public String getNoPol() {
        return noPol;
    }
    public void setNoPol(String noPol) {
        this.noPol = noPol;
    }
    public int getKapasitas() {
        return kapasitas;
    }
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
}
