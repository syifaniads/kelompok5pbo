// bener gak yuh
public class kendaraan {
    protected String noPol;
    protected String jenisKendaraan;
    protected int kapasitas;
    protected double hargaSewa;

    protected boolean statusKendaraan;

    public kendaraan(String jenisKendaraan, String noPol, int kapasitas, double hargaSewa, boolean statusKendaraan){
        this.jenisKendaraan = jenisKendaraan;
        this.noPol = noPol;
        this.kapasitas = kapasitas;
        this.hargaSewa = hargaSewa;
        this.statusKendaraan = statusKendaraan;
    }

    public String getJenisKendaraan(){
        return jenisKendaraan;
    }
    public String getNoPol(){
        return noPol;
    }
    public int getKapasitas(){
        return kapasitas;
    }

    public double getHargaSewa(){
        return hargaSewa;
    }
    public void informasiKendaraan(){
        System.out.println("Jenis kendaraan: " + jenisKendaraan);
        System.out.println("Plat nomor: " + noPol);
        System.out.println("Kapasitas: " + kapasitas);
        System.out.println("Harga sewa: " + hargaSewa);
        System.out.println("Status kendaraan: " +(statusKendaraan ? "Tersedia" : "Tidak Tersedia"));
    }

}
