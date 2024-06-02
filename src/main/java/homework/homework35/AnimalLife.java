package homework.homework35;

import lessons.logging.UserInteraction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AnimalLife {
    private static final Logger LOGGER = LoggerFactory.getLogger(AnimalLife.class);
    public static void main(String[] args) {

        //Zoo.checkAnimal();

        Animal dog = new Animal("Barsik");


        Animal dog2 = new Animal("Barsik");
        dog.play();
        dog.eat();
        dog.sleep();
        dog.play();
        dog.play();
        dog.play();

        Animal dog3 = new Animal("Pushok");
        dog3.play();
        dog3.eat();
        dog3.sleep();
        dog3.play();

        Animal dog4 = new Animal();



        Zoo.checkAnimal();

    }
}
