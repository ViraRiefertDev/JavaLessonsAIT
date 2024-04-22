package lessons.lesson27;

//Наследование. Наследник имеет доступ ко всем методам класса
//Наследник расширяет все свойства родителя, добавляя свою особенность
//Существует супер класс, родитель и его наследник
public class Animal {


//public final Animal(String name) final значит от этого класса нельзя создать больше наследников
    public Animal(String name) {
        this.name = name;
    }

    private String name;
    public void eat(){
        System.out.println(name + " " + "eats");
    }

    public String getName() {
        return name;
    }
}
