package lessons.lesson27;

//Собака является наследником Animal
public class Dog extends Animal{
    //Наследник должен создать конструктор, который передаст параметры, которые требуются для конструктора родителя
    //Сделали конструктор в родителе Animal, где он просит имя как параметр и вот так через super мы передаем имя
    //родителю super через конструктор наследника
    public Dog(String name) {
        super(name);
    }

    public void bark(){
        //Наследник имеет прямой доступ к методу класса getName()
        System.out.println(getName() + "barks");
    }
}
