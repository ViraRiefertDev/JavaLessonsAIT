package lessons.lesson22;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //этот метод влияет на то зайдет ли наш элемент в список или нет
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        //конфигурируетя как сравниваем элементы, если совпадут имя и возраст, то элемент не добавится в наш HashSet
        //тут указываем параметры которые важны для проверки на уникальность
        return age == person.age && Objects.equals(name, person.name);
    }


    //метод, который генерирует ХЭШ
    //если считаем что для подсчета уникальности важно тольк имя, то возраст убираем
    //не влияет на то, какой элемент зайдет в список какой нет,
    //а только в каком порядке будут отображаться элементы
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
