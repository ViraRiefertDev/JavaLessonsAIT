package homework.homework33;

/*
Создать класс ClothingItem:

Поля:
String name - название одежды
String type - тип одежды (например, "Футболка", "Джинсы", "Куртка")
String size - размер одежды (например, "S", "M", "L", "XL")
double price - цена одежды
Конструктор, геттеры и сеттеры
 */

public class ClothingItem {
    private String name;
    private String type;
    private String size;
    private double price;

    public ClothingItem(String name, String type, String size, double price) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
