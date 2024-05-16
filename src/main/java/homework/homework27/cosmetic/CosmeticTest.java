package homework.homework27.cosmetic;

public class CosmeticTest {
    public static void main(String[] args) {
        Lipstick rosewood = new Lipstick("Colour Elixir","MaxFactor", 7.95,"110 Rich");
        rosewood.apply();
        Mascara lash = new Mascara("Lash Sensational","Sky High",11.95,true);
        lash.apply();
        System.out.println(rosewood);
        System.out.println(lash);

        LipstickStore lipStore = new LipstickStore("Lippy","Köln");
        lipStore.describe();
        lipStore.addNewProduct(rosewood);
        lipStore.addPopularBrand(rosewood);
        lipStore.displayProducts();
        lipStore.displayPopularBrands();

        MascaraStore masStore = new MascaraStore("Maska","Düsseldorf");
        masStore.describe();
        masStore.addNewBestSeller(lash);
        masStore.displayBestSellers();

    }
}
