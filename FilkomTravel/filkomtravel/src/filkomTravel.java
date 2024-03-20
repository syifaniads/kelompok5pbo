package projekFilkomTravel;

import java.util.*;

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
        System.out.print("\n[Ketik 2] Login Sebagai Tamu");
        System.out.print("\nPILIH MASUKKAN: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                Member member = new Member();
                member.daftar();
                System.out.print("=".repeat(52));
                System.out.println("\nLANJUTKAN PESANAN?");
                System.out.println("[Ketik 1] Ya");
                System.out.println("[Ketik 2] Tidak");
                System.out.print("Masukkan pilihan: ");
                int pilihan1 = scanner.nextInt();
                scanner.nextLine();
                if (pilihan1 == 1) {
                    member.buatPesanan();
                    System.out.println("Apakah Pesanan Sudah Tepat?");
                    System.out.println("[Ketik 1] Ya");
                    System.out.println("[Ketik 2] Tidak,Saya Ingin Mengedit Pesanan");
                    System.out.println("[Ketik 3] Batalkan Pesanan");
                    System.out.print("Masukkan pilihan: ");
                    int pilihan2 = scanner.nextInt();
                    if(pilihan2 == 2){
                        member.editPesanan();
                        System.out.println("Pesanan berhasil diedit");
                    }
                    if(pilihan2 == 3){
                        member.batalkanPesanan();
                        System.out.println("Pesanan berhasil dibatalkan");
                    }
                    System.out.println("Apa yang Anda inginkan?");
                    System.out.println("[Ketik 1] Menyewa Kendaraan");
                    System.out.println("[Ketik 2] Memesan Travel");
                    System.out.print("Masukkan pilihan anda: ");
                    int pilihan3 = scanner.nextInt();
                    scanner.nextLine();
                    if (pilihan3 == 1) {
                        System.out.println("Berikut adalah daftar kendaraan sewaan: ");
                        Mobil mobil = new Mobil();
                        mobil.informasiMobil("Mobil", "Mercedes-Benz", "N 1234 AAA", "E-Class", true, 5, true, 800000);
                        mobil.informasiMobil("Bus", "Scania", "N 1234 AAA", "K-Series", true, 40, true, 35000000);
                        mobil.informasiMobil("Van", "VW", "N 1234 AAA", "Kombi Classic", true, 6, true, 1200000);
                        System.out.println("Kendaran apa yang ingin ada sewa?");
                        String pilihKendaraan = scanner.nextLine();
                        if (pilihKendaraan.equals("Mobil")) {
                            nota mobilNota = new nota();
                            mobilNota.setNama(member.nama);
                            mobilNota.setDurasiSewa(member.durasiSewa);
                            mobilNota.cetakNotaMember(800000);
                        }
                        else if (pilihKendaraan.equals("Bus")) {
                            nota busNota = new nota();
                            busNota.setNama(member.nama);
                            busNota.setDurasiSewa(member.durasiSewa);
                            busNota.cetakNotaMember(3500000);
                        }
                        else if (pilihKendaraan.equals("Van")) {
                            nota vanNota = new nota();
                            vanNota.setNama(member.nama);
                            vanNota.setDurasiSewa(member.durasiSewa);
                            vanNota.cetakNotaMember(1200000);
                        }
                        else {
                            System.out.println("Maaf kendaraan tersebut tidak tersedia");
                        }

                    } else if (pilihan3 == 2) {
                        PaketTravel travel = new PaketTravel("Bromo", 3, 1000000);
                        travel.printPaketTravel();
                        nota travelNota = new nota();
                        travelNota.setNama(member.nama);
                        travelNota.setDurasiSewa(member.durasiSewa);
                        travelNota.cetakNotaMember(1000000);
                    }
                } else {
                    System.out.println("Terimakasih!");
                    break;
                }
                break;
            case 2:
                User guest = new User();
                guest.daftar();
                System.out.println("SELAMAT ANDA BERHASIL MENDAFTAR!");
                System.out.println("=".repeat(52));
                System.out.print("\n" + "=".repeat(21));
                System.out.print("NON-MEMBER");
                System.out.print("=".repeat(21));
                System.out.println("\n" + "=".repeat(52));
                System.out.println("\nLANJUTKAN PESANAN?");
                System.out.println("[Ketik 1] Ya");
                System.out.println("[Ketik 2] Tidak");
                System.out.print("Masukkan pilihan: ");
                int pilihan4 = scanner.nextInt();
                scanner.nextLine();
                if (pilihan4 == 1) {
                    guest.buatPesanan();
                    System.out.println("Apakah Pesanan Sudah Tepat?");
                    System.out.println("[Ketik 1] Ya");
                    System.out.println("[Ketik 2] Tidak,Saya Ingin Mengedit Pesanan");
                    System.out.println("[Ketik 3] Batalkan Pesanan");
                    System.out.print("Masukkan pilihan: ");
                    int pilihan2 = scanner.nextInt();
                    if(pilihan2 == 2){
                        guest.editPesanan();
                        System.out.println("Pesanan berhasil diedit");
                    }
                    if(pilihan2 == 3){
                        guest.batalkanPesanan();
                        System.out.println("Pesanan berhasil dibatalkan");
                    }
                    System.out.println("Apa yang Anda inginkan?");
                    System.out.println("[Ketik 1] Menyewa Kendaraan");
                    System.out.println("[Ketik 2] Memesan Travel");
                    System.out.print("Masukkan pilihan anda: ");
                    int pilihan3 = scanner.nextInt();
                    scanner.nextLine();
                    if (pilihan3 == 1) {
                        System.out.println("Berikut adalah daftar kendaraan sewaan: ");
                        Mobil mobil = new Mobil();
                        mobil.informasiMobil("Mobil", "Mercedes-Benz", "N 1234 AAA", "E-Class", true, 5, true, 800000);
                        mobil.informasiMobil("Bus", "Scania", "N 1234 AAA", "K-Series", true, 40, true, 35000000);
                        mobil.informasiMobil("Van", "VW", "N 1234 AAA", "Kombi Classic", true, 6, true, 1200000);
                        System.out.println("Kendaran apa yang ingin ada sewa?");
                        String pilihKendaraan = scanner.nextLine();
                        if (pilihKendaraan.equals("Mobil")) {
                            nota mobilNota = new nota();
                            mobilNota.setNama(guest.nama);
                            mobilNota.setDurasiSewa(guest.durasiSewa);
                            mobilNota.cetakNotaNonMember(800000);
                        }
                        else if (pilihKendaraan.equals("Bus")) {
                            nota busNota = new nota();
                            busNota.setNama(guest.nama);
                            busNota.setDurasiSewa(guest.durasiSewa);
                            busNota.cetakNotaNonMember(3500000);
                        }
                        else if (pilihKendaraan.equals("Van")) {
                            nota vanNota = new nota();
                            vanNota.setNama(guest.nama);
                            vanNota.setDurasiSewa(guest.durasiSewa);
                            vanNota.cetakNotaNonMember(1200000);
                        }
                        else {
                            System.out.println("Maaf kendaraan tersebut tidak tersedia");
                        }

                    } else if (pilihan3 == 2) {
                        PaketTravel travel = new PaketTravel("Bromo", 3, 1000000);
                        travel.printPaketTravel();
                        nota travelNota = new nota();
                        travelNota.setNama(guest.nama);
                        travelNota.setDurasiSewa(guest.durasiSewa);
                        travelNota.cetakNotaNonMember(1000000);
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


