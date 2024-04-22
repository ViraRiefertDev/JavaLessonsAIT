package lessons.lesson27.exercise2;

public class Mascara extends CosmeticProduct{
    private String volumeEffect;

    public Mascara(String productName, String brand, double price, String volumeEffect) {
        super(productName, brand, price);
        this.volumeEffect = volumeEffect;
    }

    @Override
    public String toString() {
        return "Mascara{" +
                "volumeEffect='" + volumeEffect + '\'' +
                "} " + super.toString();
    }

    @Override
    public void apply(){
        super.apply();
        System.out.println("Apply to eyelash area. \nAvoid contact with water!!");
    }
}
