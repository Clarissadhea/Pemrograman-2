import java.util.Scanner;

public class PRAK101_2410817220023_ClarissaDheaAllisya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap: ");
        String name = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String birthplace = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        int birthdate = input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        int birthmonth = input.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        int birthyear = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        int height = input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        double weight = input.nextDouble();

    String month = switch(birthmonth){
        case 1 -> "Januari";
        case 2 -> "Februari";
        case 3 -> "Maret";
        case 4 -> "April";
        case 5 -> "Mei";
        case 6 -> "Juni";
        case 7 -> "Juli";
        case 8 -> "Agustus";
        case 9 -> "September";
        case 10 -> "Oktober";
        case 11 -> "November";
        case 12 -> "Desember";
        default -> "Bulan tidak valid";
    };
        System.out.println("Nama Lengkap " + name + ", Lahir di " + birthplace + " pada Tanggal " + birthdate + " " + month + " " + birthyear);
        System.out.println("Tinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram");
    }
}