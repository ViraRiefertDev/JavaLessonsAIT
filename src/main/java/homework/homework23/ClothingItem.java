package homework.homework23;

import java.util.Objects;

//1.Создайте класс ClothingItem с характеристиками: name (название), size (размер), color (цвет) и category
//(категория, например, верхняя одежда, нижняя одежда, обувь). Все поля должны быть приватными с геттерами и сеттерами.
public class ClothingItem {
    private String name;
    private int size;
    private String color;
    private String category;

    public ClothingItem(String name, int size, String color, String category) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //2. Переопределите методы equals() и hashCode() в классе ClothingItem. equals() должен сравнивать одежду по всем
    // характеристикам, кроме name, предполагая, что одежда одинакова, если она имеет тот же размер, цвет и категорию.
    // hashCode() должен генерировать хеш-код, основываясь на тех же критериях.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClothingItem that = (ClothingItem) o;
        return Objects.equals(size, that.size) && Objects.equals(color, that.color) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color, category);
    }
}
