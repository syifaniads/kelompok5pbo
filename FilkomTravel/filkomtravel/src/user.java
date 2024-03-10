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
                    System.out.println("Apa yang Anda inginkan?");
                    System.out.println("1. Menyewa");
                    System.out.println("2 Memesan Travel");
                    System.out.print("Masukkan pilihan anda");
                    int pilihan3 = scanner.nextInt();
                    if(pilihan3 == 1){
                        System.out.println("Berikut adalah  daftar kendaraan sewaan: ");
                        mobil mobil = new mobil("Mobil", "N 1234 AAA", 5, 1500000, true, "Mercedes-Benz", "E-Class", true);
                        mobil.informasiKendaraan();
                        bus bus = new bus("Bus", "N 1234 AAA", 40, 35000000, true, "Scania", "K-Series", true);
                        bus.informasiKendaraan();
                        motor motor = new motor("Motor", "N 1234 AAA", 2, 125000, true, "Honda", "Vario");
                        motor.informasiKendaraan();
                        System.out.println("Kendaran apa yang ingin ada sewa?");
                        String pilihKendaraan = scanner.nextLine();
                        if(pilihKendaraan.equals("Mobil")){
                            
                        }
                        if(pilihKendaraan.equals("Bus")){

                        }
                        if(pilihKendaraan.equals("Motor")){

                        }
                        else{
                            System.out.println("Maaf kendaraan tersebut tidak tersedia");
                        }
                    }
                }
                else{
                    System.out.println("Terimakasih!");
                    break;
                }
                break;
            case 2:
                NonMember nonMember = new NonMember();
                nonMember.daftarNonMember();
                System.out.print("=".repeat(52));
                System.out.println("\nLANJUTKAN PESANAN?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Masukkan pilihan: ");
                int pilihan4 = scanner.nextInt();
                scanner.nextLine();
                if(pilihan4==1){
                    Member pesanMember = new Member();
                    pesanMember.buatPesanan();
                    System.out.println("Apakah Pesanan Sudah Tepat?");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak,Saya Ingin Mengedit Pesanan");
                    System.out.println("3. Batalkan Pesanan");
                    System.out.print("Masukkan pilihan: ");
                    int pilihan5 = scanner.nextInt();
                    if(pilihan5 == 2){
                        pesanMember.editPesanan();
                        System.out.println("Pesanan berhasil diedit");
                    }
                    if(pilihan5 == 3){
                        pesanMember.batalkanPesanan();
                        System.out.println("Pesanan berhadil dibatalkan");
                    }
                    System.out.println("Apa yang Anda inginkan?");
                    System.out.println("1. Menyewa");
                    System.out.println("2 Memesan Travel");
                    System.out.print("Masukkan pilihan anda");
                    int pilihan6 = scanner.nextInt();
                    if(pilihan6 == 1){
                        System.out.println("Berikut adalah  daftar kendaraan sewaan: ");
                        mobil mobil = new mobil("Mobil", "N 1234 AAA", 5, 1500000, true, "Mercedes-Benz", "E-Class", true);
                        mobil.informasiKendaraan();
                        bus bus = new bus("Bus", "N 1234 AAA", 40, 35000000, true, "Scania", "K-Series", true);
                        bus.informasiKendaraan();
                        motor motor = new motor("Motor", "N 1234 AAA", 2, 125000, true, "Honda", "Vario");
                        motor.informasiKendaraan();
                        System.out.println("Kendaran apa yang ingin ada sewa?");
                        String pilihKendaraan = scanner.nextLine();
                        if(pilihKendaraan.equals("Mobil")){

                        }
                        if(pilihKendaraan.equals("Bus")){

                        }
                        if(pilihKendaraan.equals("Motor")){

                        }
                        else{
                            System.out.println("Maaf kendaraan tersebut tidak tersedia");
                        }
                    }
                }
                else{
                    System.out.println("Terimakasih!");
                    break;
                }
                break;
//            case 3:
//                Penyewa pesanSewa = new Penyewa();
//                pesanSewa.menyewa();
//                System.out.println("SELAMAT ANDA BERHASIL MENJADI PENYEWA!");
//                System.out.print("\n"+"=".repeat(52));
//                System.out.println("LANJUTKAN PESANAN?");
//                // if else?
////                System.out.print("Masukkan Nomor Polisi Kendaraan: ");
////                String noPolPenyewa = scanner.nextLine();
////                System.out.print("Masukkan Jenis Kendaraan: ");
////                String jenisVehiclePenyewa = scanner.nextLine();
//                // ini mereka yang input atau dari kita???
//                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
