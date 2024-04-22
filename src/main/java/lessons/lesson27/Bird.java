package lessons.lesson27;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }
    //переопределение методов родителя (переписываем)
    //при переопределении сигнатура метода должна быть полностью одинакова
    //надо добавить @Override для контроля, что мы правильно переписываем родительский метод
    @Override
    public void eat(){
        //вызов метода родителя
        super.eat();
        System.out.println("I'm bird, I'm hungry");
    }

}
