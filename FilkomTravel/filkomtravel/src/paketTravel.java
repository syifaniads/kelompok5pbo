package studiKasus1;
import java.text.SimpleDateFormat;
import java.util.Date;

class PaketTravel {
    private String tujuan;
    private int lamaPerjalanan;
    private double hargaPaket;

    public PaketTravel(String tujuan, int lamaPerjalanan, double hargaPaket) {
        this.tujuan = tujuan;
        this.lamaPerjalanan = lamaPerjalanan;
        this.hargaPaket = hargaPaket;
    }

    public void printPaketTravel() {
        System.out.println("=".repeat(52));
        System.out.println("Nama Paket: " + tujuan);
        System.out.println("Lama Perjalanan: " + lamaPerjalanan + " hari");
        System.out.printf("Harga Paket: Rp %.0f\n", hargaPaket);
        System.out.println("Daftar Tanggal Keberangkatan:");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        for (int i = 0; i < 3; i++) {
            System.out.println("- " + formatter.format(new Date()) + " WIB");
        }
        System.out.println("=".repeat(52));
    }
}
