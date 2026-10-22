package pertemuan4;

import java.util.Scanner;

public class HitungGajiBersih {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Kode Golongan (1-4): ");
        int golongan = input.nextInt();

        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = input.nextInt();

        double gajiPokok = 0;

        // Menentukan gaji pokok berdasarkan kode golongan
        switch (golongan) {
            case 1:
                gajiPokok = 1200000;
                break;
            case 2:
                gajiPokok = 1500000;
                break;
            case 3:
                gajiPokok = 1750000;
                break;
            case 4:
                gajiPokok = 2000000;
                break;
            default:
                System.out.println("Kode golongan tidak valid!");
                return;
        }

        // Perhitungan tunjangan
        double tunjanganPasangan = 0.10 * gajiPokok;
        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
        double totalTunjangan = tunjanganPasangan + tunjanganAnak;

        // Gaji bersih
        double gajiBersih = gajiPokok + totalTunjangan;

        System.out.println("\n--- Rincian Gaji Karyawan ---");
        System.out.println("NIK             : " + nik);
        System.out.println("Nama            : " + nama);
        System.out.println("Gaji Pokok      : Rp" + gajiPokok);
        System.out.println("Total Tunjangan : Rp" + totalTunjangan);
        System.out.println("Gaji Bersih     : Rp" + gajiBersih);
    }
}
