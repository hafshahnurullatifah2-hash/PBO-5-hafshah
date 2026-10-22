package pertemuan4;

import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Tahun : ");
        int tahun = input.nextInt();
        
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)){
            System.out.println("Termasuk Tahun Kabisat : "+ tahun);
        }else{
            System.out.println("Tidak Termasuk tahun Kabisat : "+ tahun);
        }
    }
}
