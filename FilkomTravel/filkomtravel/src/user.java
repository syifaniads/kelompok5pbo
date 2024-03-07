import java.util.*;
import java.util.Scanner;

public class user {
    String nama;
    String noHP;
    String alamat;

    user member = new user();
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("\n"+"=".repeat(52));
        System.out.print("\n"+"=".repeat(15));
        System.out.print("APLIKASI FILKOM TRAVEL");
        System.out.print("=".repeat(15));
        System.out.print("\n"+"=".repeat(52));
        System.out.print("\n SIAPA ANDA?");
        System.out.print("\n Ketik 1 Daftar Member");
        System.out.print("\n Ketik 2 Daftar non-Member");
        System.out.print("\n Ketik 3 Daftar Penyewa");
        System.out.print("\n PILIH MASUKKAN: ");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
            System.out.println("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Nomor Telepon: ");
            String noTelp= scanner.nextLine();
            System.out.print("Masukan Alamat: ");
            String alamat= scanner.nextLine();
            System.out.print("Masukkan username yang diinginkan: ");
            String username=scanner.nextLine();
            System.out.print("Masukkan password yang sulit: ");
            String password=scanner.nextLine();
            System.out.println("SELAMAT ANDA BERHASIL MENJADI MEMBER!");
            System.out.print("\n"+"=".repeat(52));
            System.out.println("LANJUTKAN PESANAN?");
        }
    }
}

