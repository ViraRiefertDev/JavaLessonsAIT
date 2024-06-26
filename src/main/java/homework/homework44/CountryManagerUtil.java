package homework.homework44;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

public final class CountryManagerUtil{



    private static List<Country> countryList;
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryManagerUtil.class);
    private static final File file = Path.of("src", "main", "resources", "hw44_countries.txt").toFile();
    private static final FileManager<Country> fileManager = new FileManager<>(Country.class);

    //Статический блок инициализации выполняется один раз при загрузке класса в память.
    static{
        countryList = fileManager.ArrayOfStringsInListOfObjects(file);
    }

    //метод вывода данных о всех странах
    public static void getCountries() {
        if(!countryList.isEmpty()){
            for (Country country : countryList) {
                System.out.println(country);
            }
        }
        else{
            LOGGER.error("File is empty, no countries were found!");
        }

    }


    //метод добавления новой страны
    public static void addNewCountry(Country country) {
        if(!countryList.contains(country)){
            countryList.add(country);
            fileManager.ListOfObjectsInArrayOfStringsAndSafeInFile(countryList,file);
            LOGGER.info("Country: " + country.getCountryName() + " was successful added into the list.");
        }
        else{
            LOGGER.error("This country is already exist in the list");
        }
    }

    //метод удаления страны
    public static void deleteCountry(Country country) {
        if(countryList.contains(country)){
            countryList.remove(country);
            fileManager.ListOfObjectsInArrayOfStringsAndSafeInFile(countryList,file);
            LOGGER.info("Country " + country.getCountryName() + " was successful removed from the list.");
        }
        else{
            LOGGER.error("Country " +country.getCountryName()+" is not exist in the list");
        }
    }

    public static void deleteCountry(String countryName) {
        boolean isExist = false;
            for (Country country : countryList) {
               if (country.getCountryName().equalsIgnoreCase(countryName)){
                   countryList.remove(country);
                   isExist = true;
                   fileManager.ListOfObjectsInArrayOfStringsAndSafeInFile(countryList,file);
                   LOGGER.info("Country " + countryName + " was successful removed from the list.");
                   break;
                }
            }
        if(!isExist){
            LOGGER.error("Country " +countryName+" is not exist in the list");
        }
    }

    //методы обновления данных о стране
    public static void updateAllCountryData(String countryName, String newCountryCapital, int newCountryPopulation, int newCountryArea) {
        boolean isExist = false;
            for (Country country : countryList) {
                if(country.getCountryName().equalsIgnoreCase(countryName)){
                    isExist = true;
                    country.setCapital(newCountryCapital);
                    country.setPopulation(newCountryPopulation);
                    country.setArea(newCountryArea);
                    fileManager.ListOfObjectsInArrayOfStringsAndSafeInFile(countryList,file);
                    LOGGER.info("All data of " + countryName + "were successfully updated");
                    break;
                }
            }
        if(!isExist) {
            LOGGER.error("Country " +countryName+" is not exist in the list");
        }
    }

    public static void updateCountryCapital(String countryName, String newCountryCapital) {
       boolean isExist = false;
            for (Country country : countryList) {
                if(country.getCountryName().equalsIgnoreCase(countryName)){
                    isExist = true;
                    country.setCapital(newCountryCapital);
                    fileManager.ListOfObjectsInArrayOfStringsAndSafeInFile(countryList,file);
                    LOGGER.info("Capital of " + countryName + "was successfully updated");
                    break;
                }
            }


        if(!isExist) {
            LOGGER.error("Country " +countryName+" is not exist in the list");
        }
    }

    public static void updateCountryPopulation(String countryName, int newCountryPopulation){
        boolean isExist = false;
            for (Country country : countryList) {
                if(country.getCountryName().equalsIgnoreCase(countryName)){
                    isExist = true;
                    country.setPopulation(newCountryPopulation);
                    fileManager.ListOfObjectsInArrayOfStringsAndSafeInFile(countryList,file);
                    LOGGER.info("Population of " + countryName + " was successfully updated");
                    break;
                }
            }


            if(!isExist){
            LOGGER.error("Country " +countryName+" is not exist in the list");
        }
    }

    public static void updateCountryArea(String countryName, int newCountryArea){
        boolean isExist = false;
            for (Country country : countryList) {
                if(country.getCountryName().equalsIgnoreCase(countryName)){
                    isExist = true;
                    country.setArea(newCountryArea);
                    fileManager.ListOfObjectsInArrayOfStringsAndSafeInFile(countryList,file);
                    LOGGER.info("Area of " + countryName + " was successfully updated");
                    break;
                }
            }
        if(!isExist){
            LOGGER.error("Country " +countryName+" is not exist in the list");
        }
    }
}
