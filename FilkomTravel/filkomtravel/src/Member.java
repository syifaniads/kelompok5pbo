package studiKasus1;
import java.util.*;
import java.util.Scanner;

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
        super.daftar();
        System.out.print("Masukkan username yang diinginkan: ");
        this.setUsername(scanner.nextLine());
        System.out.print("Masukkan password yang sulit: ");
        this.setPassword(scanner.nextLine());
        System.out.println("SELAMAT ANDA BERHASIL MENJADI MEMBER!");
    }
    public void buatPesanan() {
        super.buatPesanan();
    }

    public void editPesanan() {
        super.editPesanan();
    }

    public void batalkanPesanan() {
        super.batalkanPesanan();
    }
}
