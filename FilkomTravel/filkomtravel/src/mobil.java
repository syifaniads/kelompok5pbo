//benul gak yuh
class Mobil {
    private String merek;
    private String noPlat;
    private String type;
    private boolean AC;
    private int kapasitas;
    private boolean statusKendaraan;
    private double hargaSewa;

    public void informasiMobil(String merek, String noPlat, String type, boolean AC, int kapasitas, boolean statusKendaraan, double hargaSewa) {
        this.merek = merek;
        this.noPlat = noPlat;
        this.type = type;
        this.AC = AC;
        this.kapasitas = kapasitas;
        this.statusKendaraan = statusKendaraan;
        this.hargaSewa = hargaSewa;

        System.out.println("=".repeat(52));
        System.out.println("Merek: " + merek);
        System.out.println("Plat Nomor: " + noPlat);
        System.out.println("Kapasitas: " + kapasitas);
        System.out.println("Harga sewa: " + hargaSewa);
        System.out.println("Status kendaraan: " + (statusKendaraan ? "Tersedia" : "Tidak Tersedia"));
        System.out.println("AC: " + (AC ? "Tersedia" : "Tidak tersedia"));
        System.out.println("=".repeat(52));
    }
}
