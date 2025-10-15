package soal2;

import java.util.Scanner;
public class pet2Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String name = input.nextLine();
            System.out.print("Ras: ");
            String breed = input.nextLine();
            System.out.print("Warna Bulu: ");
            String furcolor = input.nextLine();

            cat Cat = new cat(name, breed, furcolor);
            Cat.displayCatDetail();
        }
        else if (choice == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String name = input.nextLine();
            System.out.print("Ras: ");
            String breed = input.nextLine();
            System.out.print("Warna Bulu: ");
            String furcolor = input.nextLine();
            System.out.print("Kemampuan : ");
            String inputabilitiy = input.nextLine();
            String[] ability = inputabilitiy.split(",");

            dog Dog = new dog(name, breed, furcolor, ability);
            Dog.displayDogDetail();
        }
        else {
            System.out.println("ERROR : Pilihan tidak valid");
        }
    }
}