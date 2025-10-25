package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class CountryMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> monthNames = new HashMap<>();
        monthNames.put(1, "Januari");
        monthNames.put(2, "Februari");
        monthNames.put(3, "Maret");
        monthNames.put(4, "April");
        monthNames.put(5, "May");
        monthNames.put(6, "Juni");
        monthNames.put(7, "Juli");
        monthNames.put(8, "Agustus");
        monthNames.put(9, "September");
        monthNames.put(10, "Oktober");
        monthNames.put(11, "November");
        monthNames.put(12, "Desember");

        int numberOfCountries = input.nextInt();
        input.nextLine();

        LinkedList<Country> countries = new LinkedList<>();

        for (int i = 0; i < numberOfCountries; i++) {
            String countryName = input.nextLine();
            String leadershipType = input.nextLine();
            String leaderName = input.nextLine();

            if (leadershipType.equalsIgnoreCase("monarki")) {
                Country country = new Country(countryName, leadershipType, leaderName);
                countries.add(country);
            } else {
                int independenceDay = input.nextInt();
                int independenceMonth = input.nextInt();
                int independenceYear = input.nextInt();
                input.nextLine();
                Country country = new Country(countryName, leadershipType, leaderName, independenceDay, independenceMonth, independenceYear);
                countries.add(country);
            }
        }
        System.out.println();

        for (Country country : countries) {
            String leaderTitle;
            switch (country.getLeadershipType()) {
                case "monarki":
                    leaderTitle = "Raja";
                    break;
                case "presiden":
                    leaderTitle = "Presiden";
                    break;
                case "perdana menteri":
                    leaderTitle = "Perdana Menteri";
                    break;
                default:
                    leaderTitle = country.getLeadershipType();
                    break;
            }
            System.out.println("Negara " + country.getCountryName() + " mempunyai " +  leaderTitle + " bernama " + country.getLeaderName());

            if (country.getIndependenceYear() != 0) {
                String monthName = monthNames.get(country.getIndependenceMonth());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + country.getIndependeceDay() + " " + monthName + " " + country.getIndependenceYear());
            }
            System.out.println();
        }
    }
}