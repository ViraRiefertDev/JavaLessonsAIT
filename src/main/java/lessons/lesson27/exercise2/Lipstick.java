package lessons.lesson27.exercise2;

public class Lipstick extends CosmeticProduct{
    private String color;

    public Lipstick(String productName, String brand, double price, String color) {
        super(productName, brand, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Lipstick{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }

    @Override
    public void apply(){
        super.apply();
        System.out.println("Apply to the lip area. \nDo not use in the eye area!");
    }
}
