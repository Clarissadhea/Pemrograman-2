package soal2;

public class cat extends pet2{
    private String furcolor;

    public cat(String name, String breed, String furcolor) {
        super(name, breed);
        this.furcolor = furcolor;
    }
    public String getFurcolor() {
        return furcolor;
    }

    public void displayCatDetail(){
        super.display();
        System.out.println("Memiliki warna bulu : " + getFurcolor());
    }
}