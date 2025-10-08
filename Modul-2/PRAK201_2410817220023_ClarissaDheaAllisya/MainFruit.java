public class MainFruit {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apel", 0.4, 7000, 40.0);
        Fruit mango = new Fruit("mangga", 0.2, 3500, 15.0);
        Fruit avocado = new Fruit("alpukat", 0.25, 10000, 12.0);

        apple.showFruitInfo();
        mango.showFruitInfo();
        avocado.showFruitInfo();
    }
}