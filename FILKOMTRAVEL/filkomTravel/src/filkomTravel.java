import java.util.*;
import java.text.SimpleDateFormat;

public class filkomTravel {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("=".repeat(52));
        System.out.print("\n" + "=".repeat(15));
        System.out.print("APLIKASI FILKOM TRAVEL");
        System.out.print("=".repeat(15));
        System.out.print("\n" + "=".repeat(52));
        System.out.print("\nSIAPA ANDA?");
        System.out.print("\n[Ketik 1] Daftar Member");
        System.out.print("\n[Ketik 2] Login NonMember");
        System.out.print("\nPILIH MASUKKAN: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:

                System.out.print("=".repeat(52));
                System.out.println("\nLANJUTKAN PESANAN?");
                System.out.println("[Ketik 1] Ya");
                System.out.println("[Ketik 2] Tidak");
                System.out.print("Masukkan pilihan: ");
                int pilihan1 = scanner.nextInt();
                scanner.nextLine();
                if (pilihan1 == 1) {
                    System.out.println("Apa yang Anda inginkan?");
                    System.out.println("[Ketik 1] Menyewa Kendaraan");
                    System.out.println("[Ketik 2] Memesan Travel");
                    System.out.print("Masukkan pilihan anda: ");
                    int pilihan3 = scanner.nextInt();
                    scanner.nextLine();
                    if (pilihan3 == 1) {
                        System.out.println("Berikut adalah daftar kendaraan sewaan: ");
                        Mobil mobil = new Mobil();
                        mobil.informasiMobil("Mobil", "N 1234 AAA", "E-Class", true, 5, true, 800000);
                    } else if (pilihan3 == 2) {
                        PaketTravel travel = new PaketTravel("Bromo", 3, 1000000);
                        travel.printPaketTravel();
                        nota travelNota = new nota(null, pilihan1);
                        travelNota.setJenis("Paket Travel");
                        travelNota.cetakNotaPaket(1000000);
                    }
                } else {
                    System.out.println("Terimakasih!");
                    break;
                }
                break;
            case 2:
                System.out.println("=".repeat(52));
                System.out.print("\n" + "=".repeat(21));
                System.out.print("NON-MEMBER");
                System.out.print("=".repeat(21));
                System.out.println("\n"+"=".repeat(52));
                System.out.println("\nLANJUTKAN PESANAN?");
                System.out.println("Ketik 1 Ya");
                System.out.println("Ketik 2 Tidak");
                System.out.print("Masukkan pilihan: ");
                int pilihan4 = scanner.nextInt();
                scanner.nextLine();
                if (pilihan4 == 1) {
                    System.out.println("Apa yang Anda inginkan?");
                    System.out.println("[Ketik 1] Menyewa");
                    System.out.println("[Ketik 2] Memesan Travel");
                    System.out.print("Masukkan pilihan anda: ");
                    int pilihan6 = scanner.nextInt();
                    scanner.nextLine();
                    if (pilihan6 == 1) {
                        System.out.println("Berikut adalah daftar kendaraan sewaan: ");
                        Mobil mobil = new Mobil();
                        mobil.informasiMobil("Mobil", "N 1234 AAA", "E-Class", true, 5, true, 1500000);
                    }
                    if (pilihan6 == 2) {
                        PaketTravel travel = new PaketTravel("Bromo", 3, 1000000);
                        travel.printPaketTravel();
                        nota travelNota = new nota();
                        travelNota.setJenis("Paket Travel");
                        travelNota.cetakNotaPaket(1000000);
                    }
                } else {
                    System.out.println("Terimakasih!");
                    break;
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
class User {
     Scanner scanner = new Scanner(System.in);
                public String nama;
                public String noHP;
                public String alamat;
                private String tanggalAwalSewa;
                private String tanggalAkhirSewa;
                private int durasiSewa;
                private double hargaSewa;
                public Object buatPesanan;
                public Object editPesanan;
                public Object batalkanPesanan;
            
                public void setTanggalAwalSewa(String s){
                    tanggalAkhirSewa = s;
                }
                public void setTanggalAkhirSewa(String s){
                    tanggalAkhirSewa = s;
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
                    User user = new User();
                    System.out.print("Masukkan Nama: ");
                    user.setNama(scanner.nextLine());
                    System.out.print("Masukkan Nomor Telepon: ");
                    user.setNoHP(scanner.nextLine());
                    System.out.print("Masukan Alamat: ");
                    user.setAlamat(scanner.nextLine());
                    System.out.println("SELAMAT ANDA BERHASIL MENDAFTAR!");
                }
                public void buatPesanan() {
                    User user = new User();
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
                    User user = new User();
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
class Member extends User {
    Scanner scanner = new Scanner(System.in);
    private String username;
    private String password;
    private double voucherMember;
   
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void daftar(){
        Member member = new Member();
        super.daftar();
        System.out.print("Masukkan username yang diinginkan: ");
        member.setUsername(scanner.nextLine());
        System.out.print("Masukkan password yang sulit: ");
        member.setUsername(scanner.nextLine());
        System.out.println("SELAMAT ANDA BERHASIL MENJADI MEMBER!");
    }
    public void buatPesanan() {
        Member member = new Member();
        super.buatPesanan();
    }

    public void editPesanan() {
        Member member = new Member();
        super.editPesanan();
    }

    public void batalkanPesanan() {
        super.batalkanPesanan();
    }
}

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
class nota {
    private String jenis;
    private double hargaPaket;

    public nota(String jenis, double hargaPaket) {
        this.jenis = jenis;
        this.hargaPaket = hargaPaket;
    }

    public nota() {
        //TODO Auto-generated constructor stub
    }

    public void setJenis(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setJenis'");
    }

    public void cetakNotaPaket(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cetakNotaPaket'");
    }

    public void cetakNota() {
        System.out.println("=".repeat(52));
        System.out.println("Jenis: " + jenis);
        System.out.printf("Harga Paket Travel: Rp %.0f\n", hargaPaket);
        System.out.println("=".repeat(52));
    }
}

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
