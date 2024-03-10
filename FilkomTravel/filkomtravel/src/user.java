import java.util.*;
public class user {
    String nama;
    String noHP;
    String alamat;

    user member = new user();
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
                System.out.print("Masukkan Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Nomor Telepon: ");
                String noTelp = scanner.nextLine();
                System.out.print("Masukan Alamat: ");
                String alamat = scanner.nextLine();
                System.out.print("Masukkan username yang diinginkan: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password yang sulit: ");
                String password = scanner.nextLine();
                System.out.println("SELAMAT ANDA BERHASIL MENJADI MEMBER!");
                System.out.print("=".repeat(52));
                System.out.println("\nLANJUTKAN PESANAN?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Masukkan pilihan: ");
                int pilihan1 = scanner.nextInt();
                scanner.nextLine();
                if(pilihan1==1){
                    System.out.print("Tanggal awal sewa (dd-mm-yyyy): ");
                    String tanggalAwal = scanner.nextLine();
                    System.out.print("Tanggal akhir sewa (dd-mm-yyyy): ");
                    String tanggalAkhir = scanner.nextLine();
                    System.out.print("Durasi penyewaan (dalam hari): ");
                    int durasi = scanner.nextInt();
                    scanner.nextLine();
                    // panggil class nota
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
                    System.out.print("Tanggal awal sewa (dd-mm-yyyy): ");
                    String tanggalAwal = scanner.nextLine();
                    System.out.print("Tanggal akhir sewa (dd-mm-yyyy): ");
                    String tanggalAkhir = scanner.nextLine();
                    System.out.print("Durasi penyewaan (dalam hari): ");
                    int durasi = scanner.nextInt();
                    scanner.nextLine();
                    // panggil class nota
                }
                else{
                    System.out.println("Terimakasih!");
                    break;
                }
                break;
            case 3:
                System.out.print("Masukkan nama: ");
                String namaPenyewa = scanner.nextLine();
                System.out.print("Masukkan Nomor Telepon: ");
                String noTelpPenyewa = scanner.nextLine();
                System.out.print("Masukkan Alamat: ");
                String alamatPenyewa = scanner.nextLine();
//                System.out.print("Masukkan Nomor Polisi Kendaraan: ");
//                String noPolPenyewa = scanner.nextLine();
//                System.out.print("Masukkan Jenis Kendaraan: ");
//                String jenisVehiclePenyewa = scanner.nextLine();
                // ini mereka yang input atau dari kita???

                System.out.println("SELAMAT ANDA BERHASIL MENJADI PENYEWA!");
                System.out.print("\n"+"=".repeat(52));
                System.out.println("LANJUTKAN PESANAN?");
                // if else?
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
