import java.util.Scanner;

public class PRAK102_2410817220023_ClarissaDheaAllisya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("");
        int startnumber = input.nextInt();

        int number = startnumber;
        int counter = 0;

        while (counter < 11) {
            if (number % 5 == 0) {
                int result = (number / 5) - 1;
                System.out.print(result);
            } else {
                System.out.print(number);
            }

            if (counter < 10) {
                System.out.print(", ");
            }
            number++;
            counter++;
        }
    }
}