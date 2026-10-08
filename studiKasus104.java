import java.util.Scanner;

public class studiKasus104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan Jumlah Cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan Jumlah uang yang dibayarkan: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup*hargaPerCup;
        diskon = 0;

        if (totalHarga>=100000) {
            diskon = totalHarga*10/100;
        }
            totalBayar = totalHarga - diskon;
        
            System.out.println("total Bayar: Rp" +totalBayar);
            System.out.println("total diskon: Rp" +diskon);
            System.out.println("total bayar: Rp" +totalBayar);

        if (uangBayar>=totalBayar) {
            kembalian = uangBayar - totalBayar;

            System.out.print("Kembalian: Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;

            System.out.print("kurang: Rp" + kurang);
        }
        sc.close();
    }
    
}
