package lessons.lesson27.exercise2;

public class CosmeticProduct {
    private String productName;
    private String brand;
    private double price;

    public CosmeticProduct(String productName, String brand, double price) {
        this.productName = productName;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CosmeticProduct{" +
                "productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
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

    public void apply(){
        System.out.println(productName + " use according to the following instruction: ");
    }
}
