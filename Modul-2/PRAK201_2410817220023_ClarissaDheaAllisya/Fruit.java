public class Fruit {
    private String fruit;
    private double weight, price, amount;

    public Fruit(String fruit, double weight, double price, double amount) {
        this.fruit = fruit;
        this.weight = weight;
        this.price = price;
        this.amount = amount;
    }

    public String getFruit() {
        return fruit;
    }
    public double getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
    public double getPriceBefore(){
        return price * (amount / weight);
    }
    public double getDiscount(){
        int discountperkg = (int) (this.amount / 4);
        double discount = discountperkg * (4 * this.price) * 0.02;
        return discount;
    }
    public double getPriceAfter(){
        return getPriceBefore() - getDiscount();
    }
    public void showFruitInfo(){
        System.out.println("Nama Buah: " + fruit);
        System.out.println("Berat: " + weight);
        System.out.println("Harga: " + price);
        System.out.println("Jumlah Beli: " + amount + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", getPriceBefore());
        System.out.printf("Total Diskon: Rp%.2f\n", getDiscount());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", getPriceAfter());
    }
}