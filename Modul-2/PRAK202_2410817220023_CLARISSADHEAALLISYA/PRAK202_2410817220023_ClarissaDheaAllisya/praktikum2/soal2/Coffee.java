package praktikum2.soal2;
public class Coffee {
    String CoffeeName, size;
    double price;
    private String buyer;

    public String getCoffeeName() {
        return CoffeeName;
    }
    public void setCoffeeName(String CoffeeName) {
        this.CoffeeName = CoffeeName;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getBuyer() {
        return buyer;
    }
    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }
    public double getTax(){
        return this.price * 0.11;
    }
    public void info(){
        System.out.println("Nama Kopi: " + CoffeeName);
        System.out.println("Ukuran: " + size);
        System.out.println("Harga: Rp. " + price);
    }
}
