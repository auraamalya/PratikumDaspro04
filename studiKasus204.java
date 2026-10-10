import java.util.Scanner;

public class studiKasus204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan, status;
        int jumlahDokumen;
        int peringkatJuara = 0;
        int statusPKM = 0;

        System.out.print("Nama Mahasiswa: ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan(BELMAWA, BAKORMAN, MANDIRI, PKM, Lainnya");
        jenisKegiatan = sc.nextLine();
        System.out.print("Jumlah dokumen yang diupload (0-4): ");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equals("BELMAWA")|| jenisKegiatan.equals("BAKORMA")||jenisKegiatan.equals("MANDIRI")) {

            System.out.print("Peringkat juara (1, 2, 3; isi 0 jika bukan juara): ");
            peringkatJuara = sc.nextInt();
        
        } else if (jenisKegiatan.equals("PKM")) {
            System.out.println("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPKM = sc.nextInt();
        }

        if (jenisKegiatan.equals("BELMAWA")|| jenisKegiatan.equals("BAKORMA")||jenisKegiatan.equals("MANDIRI")) {

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {

                if (jumlahDokumen == 4) {
                    status = "Dana penghargaan diberikan";  
                } else {
                    status = "Dokumen tidak lengkap. Dana penghargaan tidak diberikan.";
                }
            } else{
                status = "Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.";
            }

        } else if (jenisKegiatan.equals("PKM")){

            if (statusPKM == 1) {

                if (jumlahDokumen == 4) {
                    status = "Dana penghargaan diberikan"; 
                } else {
                    status = "Dokumen tidak lengkap. Dana penghargaan tidak diberikan.";  
                }
            } else {
                status = "PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.";
            }
            
        } else if (jenisKegiatan.equals("PKM")) {

            if (statusPKM == 1) {

                if (jumlahDokumen == 4){
                    status = "Dana penghargaan diberikan";
                } else {
                    status = "Dokumen tidak lengkap. Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.";
            }
            
        } else if (jenisKegiatan.equals("Lainnya")) {
            status = "Kegiatan lainnya tiak memperoleh penghargaan."; 

        } else {
            status = "Jenis kegiatan tidak valid."; 
        }

        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Jenis Kegiatan: " + jenisKegiatan);
        System.out.println("Jumlah Dokumen: " + jumlahDokumen);
        System.out.println("Status: " + status);
            
        if (jumlahDokumen >= 0 && jumlahDokumen <= 4) {
            if (jumlahDokumen < 4) {
                System.out.println("Dokumen kurang: " + (4-jumlahDokumen));   
            } else {
                System.out.println("Dokumen kurang : 0");
            }
            
        }
            
        sc.close();
    }
}
