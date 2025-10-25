package soal2;

public class Country {
    private String countryName, leadershipType, leaderName;
    private int independeceDay, independenceMonth, independenceYear;

    public Country(String countryName, String leadershipType, String leaderName, int independeceDay, int independenceMonth, int independenceYear) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
        this.independeceDay = independeceDay;
        this.independenceMonth = independenceMonth;
        this.independenceYear = independenceYear;
    }

    public Country(String countryName, String leadershipType, String leaderName) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getLeadershipType() {
        return leadershipType;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public int getIndependeceDay()   {
        return independeceDay;
    }

    public int getIndependenceMonth() {
        return independenceMonth;
    }

    public int getIndependenceYear() {
        return independenceYear;
    }
}