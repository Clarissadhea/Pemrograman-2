package soal2;

public class pet2 {
    private String name, breed;

    public pet2(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public void display(){
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah : " + getName());
        System.out.println("Dengan ras : " + getBreed());
    }
}
