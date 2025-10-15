package soal2;

public class dog extends pet2{
    private String furcolor;
    private String[] abilitiy;

    public dog(String name, String breed, String furcolor, String[] abilitiy){
        super(name, breed);
        this.furcolor = furcolor;
        this.abilitiy = abilitiy;
    }
    public String getFurcolor() {
        return furcolor;
    }
    public String[] getabilitiy() {
        return abilitiy;
    }
    public void displayDogDetail(){
        super.display();
        System.out.println("Memiliki warna bulu : " + getFurcolor());
        System.out.print("Memiliki kemampuan : ");
        if (getabilitiy()!=null){
            for(int i=0;i<getabilitiy().length;i++){
                System.out.print(getabilitiy()[i]);
            }
        }
    }
}