//benul gak yuh
public class motor extends kendaraan{

    private String pabrikan;
    private String type;

    public motor(String jenisKendaraan, String noPol, int kapasitas, double hargaSewa, boolean statusKendaraan, String pabrikan, String type) {
        super(jenisKendaraan, noPol, kapasitas, hargaSewa, statusKendaraan);
        this.pabrikan = pabrikan;
        this.type = type;
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

    @Override
    public void informasiKendaraan() {
        super.informasiKendaraan();
    }
}
