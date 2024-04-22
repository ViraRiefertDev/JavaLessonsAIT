package lessons.lesson27.exercise2;

public class TestCosmeticProduct {
    public static void main(String[] args) {
        Lipstick rosewood = new Lipstick("Colour Elixir","MaxFactor", 7.95,"110 Rich");
        rosewood.apply();
        Mascara lash = new Mascara("Lash Sensational","Sky High",11.95,"Lengthens, increase in volume");
        lash.apply();
        System.out.println(rosewood);
        System.out.println(lash);
    }


}
