package homework.homework35;

import lessons.logging.UserInteraction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Animal {
    private static final Logger LOGGER =LoggerFactory.getLogger(Animal.class);
    private String name;
    private int energy;

    public Animal(String name) {
        this.name = name;
        this.energy = 100;
        Zoo.addNewAnimalInList(this);
    }
    public Animal() {
        this.energy = 100;
        Zoo.addNewAnimalInList(this);
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void eat(){
        energy +=20;
        LOGGER.debug("Животное {} поело и его енергия теперь {}",name,energy);
    }

    public void sleep(){
        energy+=30;
        LOGGER.debug("Животное  {} поспало и его енергия теперь {}",name,energy);
    }

    public void play(){
        energy-=40;
        LOGGER.debug("Животное {} поиграло и его енергия теперь {}", name,energy);
        if(energy<0){
            LOGGER.warn("Животное устало и нуждается в отдыхе");
        }
    }
}
