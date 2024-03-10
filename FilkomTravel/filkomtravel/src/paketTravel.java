import java.util.*;
import java.text.SimpleDateFormat;
public class paketWisata {
    private String namaPaket;
    private int lamaPerjalanan;
    private double hargaPaket;
    private List<Date> daftarTanggalKeberangkatan;
    public paketWisata(String namaPaket, int lamaPerjalanan, double hargaPaket) {
        this.namaPaket = namaPaket;
        this.lamaPerjalanan = lamaPerjalanan;
        this.hargaPaket = hargaPaket;
        this.daftarTanggalKeberangkatan = new ArrayList<>();
    }
    public void addTanggalKeberangkatan(Date tanggal) {
        daftarTanggalKeberangkatan.add(tanggal);
    }

    public List<Date> cekJadwalKeberangkatan() {
        return daftarTanggalKeberangkatan;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public int getLamaPerjalanan() {
        return lamaPerjalanan;
    }

    public double getHargaPaket() {
        return hargaPaket;
    }
    public void printPaketWisata(){
        paketWisata paketWisata = new paketWisata("Bromo", 3, 1000000);
        paketWisata.addTanggalKeberangkatan(new Date());
        paketWisata.addTanggalKeberangkatan(new Date());
        paketWisata.addTanggalKeberangkatan(new Date());

        System.out.println("Nama Paket: " + paketWisata.getNamaPaket());
        System.out.println("Lama Perjalanan: " + paketWisata.getLamaPerjalanan() + " hari");
        System.out.printf("%s%.0f\n","Harga Paket: Rp", paketWisata.getHargaPaket());
        System.out.println("Daftar Tanggal Keberangkatan:");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        for (Date tanggal : paketWisata.cekJadwalKeberangkatan()) {
            System.out.println("- " + formatter.format(tanggal) + " WIB");
        }
    }
}
