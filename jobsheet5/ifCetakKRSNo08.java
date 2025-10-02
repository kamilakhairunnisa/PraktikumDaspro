
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



    
}
}
