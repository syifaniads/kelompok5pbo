import java.util.*;
public class user {
    String nama;
    String noHP;
    String alamat;
    public void setNama(String s) {
        this.nama = s;
    }
    public void setNoHP(String s) {
        this.noHP = s;
    }
    public void setAlamat(String s) {
        this.alamat = s;
    }
//    user member = new user();
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("=".repeat(52));
        System.out.print("\n"+"=".repeat(15));
        System.out.print("APLIKASI FILKOM TRAVEL");
        System.out.print("=".repeat(15));
        System.out.print("\n"+"=".repeat(52));
        System.out.print("\nSIAPA ANDA?");
        System.out.print("\nKetik 1 Daftar Member");
        System.out.print("\nKetik 2 Daftar non-Member");
        System.out.print("\nKetik 3 Daftar Penyewa");
        System.out.print("\nPILIH MASUKKAN: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1:
                Member member = new Member();
                member.jadiMember();
                System.out.print("=".repeat(52));
                System.out.println("\nLANJUTKAN PESANAN?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Masukkan pilihan: ");
                int pilihan1 = scanner.nextInt();
                scanner.nextLine();
                if(pilihan1==1){
                    Member pesanMember = new Member();
                    pesanMember.buatPesanan();
                    System.out.println("Apakah Pesanan Sudah Tepat?");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak,Saya Ingin Mengedit Pesanan");
                    System.out.println("3. Batalkan Pesanan");
                    System.out.print("Masukkan pilihan: ");
                    int pilihan2 = scanner.nextInt();
                    if(pilihan2 == 2){
                        pesanMember.editPesanan();
                        System.out.println("Pesanan berhasil diedit");
                    }
                    if(pilihan2 == 3){
                        pesanMember.batalkanPesanan();
                        System.out.println("Pesanan berhadil dibatalkan");
                    }
                }
                else{
                    System.out.println("Terimakasih!");
                    break;
                }
                break;
            case 2:
                System.out.print("Masukkan nama: ");
                String namaNonMember = scanner.nextLine();
                System.out.print("Masukkan Nomor Telepon: ");
                String noTelpNon = scanner.nextLine();
                System.out.print("Masukkan Alamat: ");
                String alamatNonMember = scanner.nextLine();
                System.out.println("SELAMAT ANDA BERHASIL MENDAFTAR!");
                System.out.print("=".repeat(52));
                System.out.println("\nLANJUTKAN PESANAN?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Masukkan pilihan: ");
                int pilihan2 = scanner.nextInt();
                scanner.nextLine();
                if(pilihan2==1){
                    NonMember pesanNonMember = new NonMember();
                    pesanNonMember.buatPesanan();
                    // panggil class nota
                }
                else{
                    System.out.println("Terimakasih!");
                    break;
                }
                break;
            case 3:
                Penyewa pesanSewa = new Penyewa();
                pesanSewa.menyewa();
                System.out.println("SELAMAT ANDA BERHASIL MENJADI PENYEWA!");
                System.out.print("\n"+"=".repeat(52));
                System.out.println("LANJUTKAN PESANAN?");
                // if else?
//                System.out.print("Masukkan Nomor Polisi Kendaraan: ");
//                String noPolPenyewa = scanner.nextLine();
//                System.out.print("Masukkan Jenis Kendaraan: ");
//                String jenisVehiclePenyewa = scanner.nextLine();
                // ini mereka yang input atau dari kita???
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
