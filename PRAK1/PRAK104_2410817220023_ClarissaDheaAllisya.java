import java.util.Scanner;

public class PRAK104_2410817220023_ClarissaDheaAllisya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String[] Abuchoices = input.nextLine().split(" ");
        System.out.print("Tangan Bagas: ");
        String[] Bagaschoices = input.nextLine().split(" ");

        int Abuscore = 0;
        int Bagasscore = 0;

        for (int i = 0; i < 3; i++) {
            String Abu = Abuchoices[i];
            String Bagas = Bagaschoices[i];

            if (Abu.equals(Bagas)) {
                continue;
            } else if ((Abu.equals("B") && Bagas.equals("G")) ||
                       (Abu.equals("G") && Bagas.equals("K")) ||
                       (Abu.equals("K") && Bagas.equals("B"))) {
                Abuscore++;
            } else {
                Bagasscore++;
            }
        }

        if (Abuscore > Bagasscore) {
            System.out.println("Abu");
        } else if (Bagasscore > Abuscore) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}