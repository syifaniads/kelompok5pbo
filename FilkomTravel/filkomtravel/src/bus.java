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
        bus bus = new bus("Bus", "N 1234 AAA", 40 , 35000000, true, "Scania", "K-Series", true);
        super.informasiKendaraan();
        System.out.println("AC: " + (AC? "Tersedia" : "Tidak tersedia"));
    }
}
