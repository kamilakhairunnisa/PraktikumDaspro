
import java.util.Scanner;

public class ifCetakKRSNo08 {
    public static void main (String [] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("---Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT Sudah Lunas (True/False): ");
        boolean UktLunas = sc.nextBoolean();

        if (UktLunas) {

            System.out.println("Pembayran UKT Terverifikasi");
            System.out.println("Silahkan Cetak KRS dan minta tanda tangan DPA");
        }
        else  {

            System.out.println("Pembayaran UKT Tidak Terverifikasi");
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }

        String modifikasi = (UktLunas) ? "Pembayaran UKT Tidak Terverifikasi/nSilahkan Cetak KRS dan minta tanda tangan DPA" : "Pembayaran UKT Tidak Terverifikasi/nRegistrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(modifikasi);
}
}
