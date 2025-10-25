package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String ID = input.nextLine();

                    boolean IDExists = false;
                    for (Student student : students) {
                        if(student.getStudentID().equals(ID)) {
                            IDExists = true;
                            break;
                        }
                    }

                    if (IDExists) {
                        System.out.println("ERROR : NIM sudah terdaftar");
                    } else {
                        students.add(new Student(name, ID));
                        System.out.println("Mahasiswa " + name + " ditambahkan.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String IDtoRemove = input.nextLine();
                    boolean removed = false;

                    for (int i = 0; i < students.size(); i++) {
                        if(students.get(i).getStudentID().equals(IDtoRemove)) {
                            students.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + IDtoRemove + " dihapus.");
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Mahasiswa dengan NIM " +  IDtoRemove + " tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String IDtoSearch = input.nextLine();
                    boolean found = false;

                    for (Student student : students) {
                        if(student.getStudentID().equals(IDtoSearch)) {
                            System.out.println("Data Mahasiswa: " + student);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Mahasiswa dengan NIM " + IDtoSearch + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    if (students.isEmpty()) {
                        System.out.println("Daftar Mahasiswa kosong.");
                    } else {
                        System.out.println("Daftar Mahasiswa:");
                        for (Student student : students) {
                            System.out.println("NIM: " + student.getStudentID() + ", Nama: " + student.getName());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        } while (choice != 0);
    }
}