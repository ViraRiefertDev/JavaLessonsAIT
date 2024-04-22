package lessons.lesson27;

public class AngryMan extends MovieCharacter {

    public AngryMan(String name) {
        super(name, "AnrgryMan");

    }

    @Override
    public void speak(){
        super.speak();
        System.out.println("I destroy the world!!!");
    }
}
