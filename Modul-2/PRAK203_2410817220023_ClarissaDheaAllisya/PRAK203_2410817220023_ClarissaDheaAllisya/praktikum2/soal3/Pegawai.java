package praktikum2.soal3;

//pada baris ini terjadi error karena seharusnya nama class sama dengan nama file
//public class Employee {
    public class Pegawai {
    public String nama;
    //tipe data ini salah karena char hanya bisa menampung satu karakter
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    //pada baris ini terjadi error karena method setJabatan tidak memiliki parameter untuk menerima nilai jabatan baru.
    //public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}