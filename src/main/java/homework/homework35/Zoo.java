package homework.homework35;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private static final Logger LOGGER = LoggerFactory.getLogger(Zoo.class);
    private static Map<String,Animal> animalList = new HashMap<>();

    public static void addNewAnimalInList(Animal animal){
        if(animalList.containsKey(animal.getName())){
            LOGGER.error("Животное с именем {}, уже существует", animal.getName());
        }
        else{
            LOGGER.info("Животное с именем {} было добавлено в список",animal.getName());
            animalList.put(animal.getName(),animal);
        }
    }

    public static void checkAnimal(){
        if (animalList == null || animalList.isEmpty()) {
            LOGGER.error("список Животных не может быть null или пустым!");
            throw new NullPointerException("список Животных не может быть null или пустым!");
        }
        for(Animal animal:animalList.values()){
            LOGGER.info("Имя животного: {}, енергия животного: {}",animal.getName(),animal.getEnergy());
            if(animal.getName()==null||animal.getName().isEmpty()){
                LOGGER.error("Имя животного отсутствует!");
            }
            if(animal.getEnergy()<0){
                LOGGER.error("Животному {} нужно отдохнуть его енергия {}",animal.getName(),animal.getEnergy());
            }
        }
    }
}
