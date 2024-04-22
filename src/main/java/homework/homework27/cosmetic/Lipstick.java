package homework.homework27.cosmetic;

public class Lipstick extends CosmeticProduct{
    private String color;

    public Lipstick(String productName, String brand, double price, String color) {
        super(productName, brand, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "--------------\n" + super.toString()+ '\n' + "color = " + color +"\n--------------";
    }


      @Override
    public void apply(){
        super.apply();
          System.out.println("Apply to the lip area. \nDo not use in the eye area!");

      }
}
