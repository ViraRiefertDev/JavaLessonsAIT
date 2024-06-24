package homework.homework44;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CountryAppRunner {
    static Scanner scanner = new Scanner(System.in);
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryAppRunner.class);

    public static void main(String[] args) {
        System.out.println("Введите ваш логин:");
        String userName = scanner.next();
        System.out.println("Введите ваш пароль: ");
        String password = scanner.next();
        UserRole userRole = AuthenticationManagerUtil.isRegisteredUser(userName, password);
        if (userRole.equals(UserRole.ADMIN)) {
            LOGGER.info("The user " + userName + " is logged in as administrator.");
            boolean isExit = false;
            while (!isExit) {
                System.out.println("1: if you want to view a list of countries enter ");
                System.out.println("2: if you want to add a new country to the list");
                System.out.println("3: if you want to remove country from the list");
                System.out.println("4: if you want to update data of country");
                System.out.println("0: if you want to exit");
                String answer = scanner.next().trim();
                switch (answer) {
                    case "1":
                        CountryManagerUtil.getCountries();
                        break;
                    case "2":
                        CountryManagerUtil.addNewCountry(createCountry());
                        break;
                    case "3":
                        System.out.println("Enter the country Name: ");
                        String countryName = scanner.next();
                        CountryManagerUtil.deleteCountry(countryName);
                        break;
                    case "4":
                        updateData();
                        break;
                    case "0":
                        isExit = true;
                        break;
                    default:
                        System.out.println("You entered something wrong!");
                }
            }
        } else if (userRole.equals(UserRole.USER)){
            boolean isExit = false;
            LOGGER.info("The user " + userName + " is logged in as user.");
            while (!isExit) {
                System.out.println("1: if you want to view a list of countries enter ");
                System.out.println("0: if you want to exit");
                String answer = scanner.next();
                switch (answer) {
                    case "1":
                        CountryManagerUtil.getCountries();
                        break;
                    case "0":
                        isExit = true;
                        break;
                    default:
                        System.out.println("You entered something wrong!");
                }
            }
        }
        else{
            LOGGER.error("You are not a registered user, login denied!");
        }

    }


    private static Country createCountry() {
        System.out.println("Enter the country Name: ");
        String countryName = scanner.next();
        System.out.println("Enter the country capital: ");
        String capital = scanner.next();
        System.out.println("Enter the country population: ");
        checkValue();
        int population = scanner.nextInt();
        System.out.println("Enter the country area");
        checkValue();
        int area = scanner.nextInt();
        Country country = new Country(countryName, capital, population, area);
        return country;
    }

    private static void updateData() {
        System.out.println("Enter the name of the country you want to update");
        String countryName = scanner.next();
        System.out.println("What data do you want to update?");
        System.out.println("1: capital");
        System.out.println("2: population");
        System.out.println("3: area");
        System.out.println("4: all of this data");
        String answer = scanner.next();
        switch (answer) {
            case "1":
                System.out.println("Enter the new capital of " + countryName);
                String newCapitalName = scanner.next();
                CountryManagerUtil.updateCountryCapital(countryName, newCapitalName);
                break;
            case "2":
                System.out.println("Enter the new population of " + countryName);
                checkValue();
                int newPopulation = scanner.nextInt();
                CountryManagerUtil.updateCountryPopulation(countryName, newPopulation);
                break;
            case "3":
                System.out.println("Enter the new area of " + countryName);
                checkValue();
                int newArea = scanner.nextInt();
                CountryManagerUtil.updateCountryArea(countryName, newArea);
                break;
            case "4":
                System.out.println();
                System.out.println("Enter the new capital of " + countryName);
                newCapitalName = scanner.next();
                System.out.println("Enter the new population of " + countryName);
                checkValue();
                newPopulation = scanner.nextInt();
                System.out.println("Enter the new area of " + countryName);
                checkValue();
                newArea = scanner.nextInt();
                CountryManagerUtil.updateAllCountryData(countryName, newCapitalName, newPopulation, newArea);
        }


    }

    private static void checkValue() {
        while (!scanner.hasNextInt()) {
            System.out.println("It must be a number! Enter again");
            scanner.next();
        }
    }


}
