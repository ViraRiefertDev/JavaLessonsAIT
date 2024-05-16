package homework.homework27.cosmetic;

public class Mascara extends CosmeticProduct {
    private boolean volumeEffect;

    public Mascara(String productName, String brand, double price, boolean volumeEffect) {
        super(productName, brand, price);
        this.volumeEffect = volumeEffect;
    }

    public boolean isVolumeEffect() {
        return volumeEffect;
    }

    @Override
    public String toString() {
        return "--------------\n" + super.toString()+ '\n' +"volumeEffect = " + volumeEffect + "\n--------------";

    }

    @Override
    public void apply(){
        super.apply();
        System.out.println("Apply to eyelash area. \nAvoid contact with water!!");

    }
}
