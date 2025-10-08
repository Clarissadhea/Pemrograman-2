package praktikum2.soal3;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //pada baris ini terjadi error karena tidak ada titik koma
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //nilai umur belum di inisialisasikan sehingga nilanya akan 0 dan tidak sesuai output
        p1.umur = 17;
        //output yang diminta adalah "Nama: " bukan "Nama Pegawai: "
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //output yang diminta adalah "17 tahun" sehingga perlu menambahkan string "tahun"
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}