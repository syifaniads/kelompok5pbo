package studiKasus1;
import java.util.*;
public class Penyewa extends user {
    Scanner scanner = new Scanner(System.in);
    private String nama;
    private String noHP;
    private String alamat;
    private String noPol;
    private double hargaSewa;
    private String jenisKendaraan;


    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public void setNoPol(String noPol) {
        this.noPol = noPol;
    }

    public void setStatusKendaraan(boolean status) {
        // implementasi
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }
    public void menyewa(){
        System.out.print("Masukkan nama: ");
        String namaPenyewa = scanner.nextLine();
        System.out.print("Masukkan Nomor Telepon: ");
        String noTelpPenyewa = scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamatPenyewa = scanner.nextLine();
    }
}
