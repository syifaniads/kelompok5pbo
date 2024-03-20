package studiKasus1;
import java.util.*;
import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);
    protected String nama;
    protected String noHP;
    protected String alamat;
    protected String tanggalAwalSewa;
    protected String tanggalAkhirSewa;
    protected int durasiSewa;
    protected double hargaSewa;
//    protected Object buatPesanan;
//
//    protected Object editPesanan;
//    protected Object batalkanPesanan;

    public void setTanggalAwalSewa(String tanggalAwalSewa){
         this.tanggalAwalSewa = tanggalAwalSewa;
    }
    public void setTanggalAkhirSewa(String tanggalAkhirSewa){
        this.tanggalAkhirSewa = tanggalAkhirSewa;
    }
    public void setDurasiSewa(int durasiSewa) {
        this.durasiSewa = durasiSewa;
    }
    public void setNama(String s) {
        this.nama = s;
    }
    public void setNoHP(String s) {
        this.noHP = s;
    }
    public void setAlamat(String s) {
        this.alamat = s;
    }
    public void daftar(){
        System.out.print("Masukkan Nama: ");
        user.setNama(scanner.nextLine());
        System.out.print("Masukkan Nomor Telepon: ");
        user.setNoHP(scanner.nextLine());
        System.out.print("Masukan Alamat: ");
        user.setAlamat(scanner.nextLine());
    }
    public void buatPesanan() {
        System.out.println("================ Buat Pesanan ================");
        System.out.print("Tanggal awal sewa (dd-mm-yyyy): ");
        user.setTanggalAwalSewa(scanner.nextLine());
        System.out.print("Tanggal akhir sewa (dd-mm-yyyy): ");
        user.setTanggalAkhirSewa(scanner.nextLine());
        System.out.print("Durasi penyewaan (dalam hari): ");
        user.setDurasiSewa(scanner.nextInt());
        scanner.nextLine();
    }

    public void editPesanan() {
        System.out.println("Edit Pesanan:");
        System.out.print("Tanggal awal sewa (dd-mm-yyyy): ");
        user.setTanggalAwalSewa(scanner.nextLine());
        System.out.print("Tanggal akhir sewa (dd-mm-yyyy): ");
        user.setTanggalAkhirSewa(scanner.nextLine());
        System.out.print("Durasi penyewaan (dalam hari): ");
        user.setDurasiSewa(scanner.nextInt());
        scanner.nextLine();
    }

    public void batalkanPesanan() {
        System.out.println("Batalkan Pesanan:");
        tanggalAwalSewa = null;
        tanggalAkhirSewa = null;
        durasiSewa = 0;
        hargaSewa = 0.0;
    }
}
