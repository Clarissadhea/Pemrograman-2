package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class DiceMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int diceTotal = input.nextInt();

        LinkedList<Dice> diceList = new LinkedList<>();

        for (int i = 0; i < diceTotal; i++) {
            diceList.add(new Dice());
        }
        int total = 0;
        for (int i = 0; i < diceList.size(); i++) {
            int value = diceList.get(i).getValue();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + value);
            total += value;
        }
        System.out.print("Total nilai dadu keseluruhan " + total);
    }
}