//benul gak yuh
public class mobil extends kendaraan{
    private String pabrikan;
    private String type;
    private boolean AC;
    public mobil(String jenisKendaraan, String noPol, int kapasitas, double hargaSewa, boolean statusKendaraan, String pabrikan, String type, boolean AC) {
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
        mobil mobil = new mobil("MObil", "N 1234 AAA", 5 , 1500000, true, "Mercedes-Benz", "E-Class", true);
        super.informasiKendaraan();
        System.out.println("AC: " + (AC? "Tersedia" : "Tidak tersedia"));
    }
}
