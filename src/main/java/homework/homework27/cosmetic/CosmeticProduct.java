package homework.homework27.cosmetic;

import java.util.Objects;

public class CosmeticProduct {
    private String productName;
    private String brand;
    private double price;

    public CosmeticProduct(String productName, String brand, double price) {
        this.productName = productName;
        this.brand = brand;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "productName = " + productName + '\n' +
                "brand = " + brand + '\n' +
                "price = " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CosmeticProduct that = (CosmeticProduct) o;
        return Objects.equals(productName, that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }

    public void apply(){
        System.out.println(productName + " use according to the following instruction: ");
    }
}
