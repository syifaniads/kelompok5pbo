package studiKasus1;
import java.util.*;
public class Member extends user {
    Scanner scanner = new Scanner(System.in);
    private String username;
    private String password;
    private double voucherMember;
    private String tanggalAwalSewa;
    private String tanggalAkhirSewa;
    private int durasiSewa;
    private double hargaSewa;

    public void setTanggalAwalSewa(String s){
        tanggalAkhirSewa = s;
    }
    public void setTanggalAkhirSewa(String s){
        tanggalAkhirSewa = s;
    }
    public void setDurasiSewa(int durasiSewa) {
        this.durasiSewa = durasiSewa;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return this.username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }
    public void jadiMember(){
        Member member = new Member();
        System.out.print("Masukkan Nama: ");
        member.setNama(scanner.nextLine());
        System.out.print("Masukkan Nomor Telepon: ");
        member.setNoHP(scanner.nextLine());
        System.out.print("Masukan Alamat: ");
        member.setAlamat(scanner.nextLine());
        System.out.print("Masukkan username yang diinginkan: ");
        member.setUsername(scanner.nextLine());
        System.out.print("Masukkan password yang sulit: ");
        member.setUsername(scanner.nextLine());
        System.out.println("SELAMAT ANDA BERHASIL MENJADI MEMBER!");
    }
    public void buatPesanan() {
        Member member = new Member();
        System.out.println("================ Buat Pesanan ================");
        System.out.print("Tanggal awal sewa (dd-mm-yyyy): ");
        member.setTanggalAwalSewa(scanner.nextLine());
        System.out.print("Tanggal akhir sewa (dd-mm-yyyy): ");
        member.setTanggalAkhirSewa(scanner.nextLine());
        System.out.print("Durasi penyewaan (dalam hari): ");
        member.setDurasiSewa(scanner.nextInt());
        scanner.nextLine();
    }

    public void editPesanan() {
        Member member = new Member();
        System.out.println("Edit Pesanan:");
        System.out.print("Tanggal awal sewa (dd-mm-yyyy): ");
        member.setTanggalAwalSewa(scanner.nextLine());
        System.out.print("Tanggal akhir sewa (dd-mm-yyyy): ");
        member.setTanggalAkhirSewa(scanner.nextLine());
        System.out.print("Durasi penyewaan (dalam hari): ");
        member.setDurasiSewa(scanner.nextInt());
        scanner.nextLine();
    }

    public void batalkanPesanan() {
        System.out.println("Batalkan Pesanan:");
        // Implementasi logika pembatalan pesanan
        tanggalAwalSewa = null;
        tanggalAkhirSewa = null;
        durasiSewa = 0;
        hargaSewa = 0.0;
    }
}
