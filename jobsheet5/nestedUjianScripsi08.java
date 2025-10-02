import java.util.Scanner;
public class nestedUjianScripsi08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Apakah mahasiswa sudah bebas kompem? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();
        //fungsi trim() digunakan untuk menghapus spasi sebelum dan setelah String

        System.out.println("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            System.out.println("Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi");
        } else if (bimbinganP1 > 8 && bimbinganP2 > 4) {
            System.out.println("Gagal! log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali");
        } else if (bimbinganP1 < 8) {
            System.out.println("Gagal! log bimbingan P1 belum mencapai 8 kali");
        } else if (bimbinganP2 > 4) {
            System.out.println("Gagal! log bimbingan P2 belum mencapai 4 klai");
        } else {
            System.out.println("Gagal!, Mahasiswa masih memiliki tanggaungan kompen");
        }
            System.out.println();



        }
    }
        
    
