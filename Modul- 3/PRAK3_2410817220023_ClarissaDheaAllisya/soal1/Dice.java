package soal1;
import java.util.Random;

public class Dice {
    private int value;

    public Dice() {
        randomValue();
    }

    private void randomValue() {
        Random random = new Random();
        this.value = random.nextInt(6) + 1;
    }

    public int getValue() {
        return this.value;
    }
}
