import java.util.Scanner;

public class PRAK103_2410817220023_ClarissaDheaAllisya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("");
        int n =  input.nextInt();
        int startnumber = input.nextInt();

        int number = startnumber;
        int counter = 0;

        do {
            if(number % 2 != 0) {
                System.out.print(number);
                counter++;

                if(counter < n) {
                    System.out.print(", ");
                }
            }
            number++;
        } while (counter < n);
    }
}