import java.util.*;
public class Member extends user {
    Scanner scanner = new Scanner(System.in);
    private String username;
    private String password;
    private double voucherMember;
    private Date tanggalAwalSewa;
    private Date tanggalAkhirSewa;
    private int durasiSewa;
    private double hargaSewa;

    public void setTanggalAwalSewa(){
        // blm tau
    }


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
        // implementasi
    }

    public void batalkanPesanan() {
        // implementasi
    }
}
