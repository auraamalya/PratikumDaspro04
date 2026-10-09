import java.util.Scanner;

public class studiKasus204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan, status;
        int jumlahDokumen;
        int peringkatJuara = 0;
        int statusPKM = 0;

        System.out.print("Masukkan Nama Mahasiswa: ");
        namaMahasiswa = sc.nextLine();

        System.out.println("Masukkan Jenis Kegiatan (BELMAWA, BAKORMA, PKM, Lainnya): ");
        jenisKegiatan = sc.nextLine();

        System.out.print("Masukkan jumlah dokuemn yang diupload(0-4): ");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equals("BELMAWA")|| jenisKegiatan.equals("BAKORMA")|| jenisKegiatan.equals("MANDIRI")) {
            System.out.print("Peringkat juara(1, 2,3; isi 0 jika bukan juara): ");
            peringkatJuara = sc.nextInt();

        } else if (jenisKegiatan.equals("PKM")) {
            
            System.out.println("Status pendanaan PKM (1 = lolos,0 = tidak lolos): ");
            statusPKM = sc.nextInt();
        }

        if (jenisKegiatan.equals("BELMAWA") || jenisKegiatan.equals("BAKORMA")|| jenisKegiatan.equals("MANDIRI")){
            if (peringkatJuara >= 1 && peringkatJuara<= 3) {
                if (jumlahDokumen == 4) {
                    status = "Dana pengahargaan diberikan.";
                } else {
                    status = "Dokumen tidak lengkap. Dana penghargaan tidak diberikan.";
                    }
            } else {
                status = "Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.";
            }

            } else if (jenisKegiatan.equals("PKM")) {
                    if (statusPKM == 1){
                        if (jumlahDokumen == 4) {
                        status = "Dana penghargaam diberikan.";
                        } else {
                        status = "Dokumen tidak lengkap. Dana penghargaan tidak diberikan.";
                        }

        } else if (jenisKegiatan.equals("Lainnya")) {
            status = "Kegiatan lainnya tidak memeproleh dana penghargaan.";
        } else {
            status = "jenis kegiatan tidak valid."; 
        }   
        }

        sc.close();
    }
    
}
