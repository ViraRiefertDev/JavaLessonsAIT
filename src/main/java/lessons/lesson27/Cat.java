package lessons.lesson27;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void sayMjao(){
        System.out.println(getName() + " say mjao");
    }
}
