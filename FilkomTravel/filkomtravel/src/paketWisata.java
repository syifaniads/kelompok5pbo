import java.util.*;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nama Paket: ").append(namaPaket).append("\n");
        sb.append("Lama Perjalanan: ").append(lamaPerjalanan).append(" hari").append("\n");
        sb.append("Harga Paket: Rp").append(String.format("%.2f", hargaPaket)).append("\n");
        sb.append("Daftar Tanggal Keberangkatan:").append("\n");
        for (Date tanggal : daftarTanggalKeberangkatan) {
            sb.append("- ").append(tanggal).append("\n");
        }
        return sb.toString();
    }

    // Contoh penggunaan
    public static void main(String[] args) {
        paketWisata paketWisata = new paketWisata("Bromo", 3, 1000000);
        paketWisata.addTanggalKeberangkatan(new Date(2024, 3, 10));
        paketWisata.addTanggalKeberangkatan(new Date(2024, 4, 5));
        paketWisata.addTanggalKeberangkatan(new Date(2024, 5, 1));

        System.out.println(paketWisata);

        List<Date> daftarTanggal = paketWisata.cekJadwalKeberangkatan();
//        for (Date tanggal : daftarTanggal) {
//            System.out.println(tanggal);
//        }
    }
}
