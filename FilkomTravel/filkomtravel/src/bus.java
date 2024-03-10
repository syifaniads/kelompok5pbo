//benul gak yuh
public class bus extends kendaraan{

    private String pabrikan;
    private String type;
    private boolean AC;
    public bus(String jenisKendaraan, String noPol, int kapasitas, double hargaSewa, boolean statusKendaraan, String pabrikan, String type, boolean AC) {
        super(jenisKendaraan, noPol, kapasitas, hargaSewa, statusKendaraan);
        this.AC = AC;
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
        System.out.println("AC: " + (AC? "Tersedia" : "Tidak tersedia"));
        System.out.println("========================================");
    }
}
