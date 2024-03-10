import java.util.*;
public class NonMember extends user {
    Scanner scanner = new Scanner(System.in);
    private String tanggalAwalSewa;
    private String tanggalAkhirSewa;
    private int durasiSewa;
    private double hargaSewa;

    public void buatPesanan() {
        System.out.print("Tanggal awal sewa (dd-mm-yyyy): ");
        String tanggalAwal = scanner.nextLine();
        System.out.print("Tanggal akhir sewa (dd-mm-yyyy): ");
        String tanggalAkhir = scanner.nextLine();
        System.out.print("Durasi penyewaan (dalam hari): ");
        int durasi = scanner.nextInt();
        scanner.nextLine();
    }
    public void editPesanan() {
        System.out.print("Tanggal awal sewa (dd-mm-yyyy): ");
        String tanggalAwal = scanner.nextLine();
        System.out.print("Tanggal akhir sewa (dd-mm-yyyy): ");
        String tanggalAkhir = scanner.nextLine();
        System.out.print("Durasi penyewaan (dalam hari): ");
        int durasi = scanner.nextInt();
        scanner.nextLine();
    }
    public void batalkanPesanan() {
        System.out.println("Batalkan Pesanan:");
        // Implementasi logika pembatalan pesanan
        tanggalAwalSewa = null;
        tanggalAkhirSewa = null;
        durasiSewa = 0;
        hargaSewa = 0.0;
        System.out.println("Pesanan berhasil dibatalkan.");
    }
}
