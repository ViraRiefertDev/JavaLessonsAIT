package homework.homework26.cafeMenu;

public class MenuTest {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Pizza Mozarella",MenuItemType.DISH);
        MenuItem item2 = new MenuItem("Pizza Diavollo", MenuItemType.DISH);
        MenuItem item3 = new MenuItem("Coca-Cola", MenuItemType.DRINK);
        MenuItem item4 = new MenuItem("Fanta", MenuItemType.DRINK);
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println(item4);
    }
}
