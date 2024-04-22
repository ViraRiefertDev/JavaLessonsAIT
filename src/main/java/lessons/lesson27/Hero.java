package lessons.lesson27;

public class Hero extends MovieCharacter {

//    private String role = "Hero";

    public Hero(String name, String role) {
        super(name, "Hero");
    }
    @Override
    public void speak(){
        super.speak();
        System.out.println("I'm a hero!!! Expeliarmus");
    }
}
