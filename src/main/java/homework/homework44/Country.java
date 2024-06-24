package homework.homework44;

import java.io.Serializable;
import java.util.Objects;

public class Country implements Serializable {
    private String countryName;
    private String capital;
    private int population;
    private int area;

    public Country(String countryName, String capital, int population, int area) {
        this.countryName = countryName;
        this.capital = capital;
        this.population = population;
        this.area = area;
    }

    public String getCountryName() {
        return countryName;
    }


    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName);
    }

    @Override
    public String toString() {
        return "Country: " + countryName +
                ", capital: " + capital +
                ", population: " + population +
                ", area: " + area;

    }
}
