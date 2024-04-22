package lessons.lesson27;

import org.w3c.dom.ls.LSOutput;

public class AnimalTest {
    public static void main(String[] args) {
        Dog hatiko = new Dog("Hatiko");
        //то, что обозначено жирным цветом, это метод наследника, не жирным это методы родителя
        System.out.println(hatiko.getName());
        hatiko.bark();
        hatiko.eat();
        Bird bird = new Bird("Fenix");
        bird.eat();
    }

}
