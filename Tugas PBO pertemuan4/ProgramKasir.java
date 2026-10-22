package pertemuan4;

import java.util.Scanner;

public class ProgramKasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a) Apakah memiliki kartu member?
        System.out.print("Apakah memiliki kartu member? (y/t): ");
        char punyaMember = input.next().charAt(0);

        System.out.print("Masukkan total belanja: Rp");
        double totalBelanja = input.nextDouble();

        double diskon = 0;

        if (punyaMember == 'y' || punyaMember == 'Y') {
            // b) Jika memiliki kartu member, belanja > Rp500.000 diskon Rp50.000
            if (totalBelanja > 500000) {
                diskon = 50000;
            } 
            // c) Jika memiliki kartu member, belanja > Rp100.000 diskon Rp15.000
            else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            // d) Jika tidak memiliki kartu member, belanja > Rp100.000 diskon Rp10.000
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }
        double harusDibayar = totalBelanja - diskon;

        System.out.print("Masukkan uang yang diberikan pembeli: Rp");
        double uangBayar = input.nextDouble();

        double kembalian = uangBayar - harusDibayar;

        System.out.println("\n--- Rincian Pembayaran ---");
        System.out.println("Total Belanja    : Rp" + totalBelanja);
        System.out.println("Diskon           : Rp" + diskon);
        System.out.println("Yang Harus Dibayar: Rp" + harusDibayar);
        System.out.println("Uang Kembalian   : Rp" + kembalian);
    }
}
