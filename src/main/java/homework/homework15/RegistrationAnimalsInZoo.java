package homework.homework15;
import java.util.Scanner;
public class RegistrationAnimalsInZoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Создания массива
        String[] animalSpacies = new String[4];
        String[] animalSounds = new String[4];
        //2. Инициализация массива
        animalSpacies[0] = "Cлон";
        animalSounds[0] = "Ty-ту-тууу";
        animalSpacies[1] = "Лев";
        animalSounds[1] = "Рррррррр";
        animalSpacies[2] = "Обезьяна";
        animalSounds[2] = "Уааауауауа";
        animalSpacies[3] = "Лошадь";
        animalSounds[3] = "Иго-го";
        printAnimalSounds(animalSpacies,animalSounds);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Введите название животного!");
        String animal = scanner.next().trim().toLowerCase();
        findAnimalSound(animal,animalSpacies,animalSounds);
    }

    //3.Вывод информации о животных
    public static void printAnimalSounds(String[] animals, String[] sounds){
        if(animals.length==sounds.length){
            for(int i=0;i< animals.length;i++){
                System.out.println("Животное " + animals[i] + " издает звук \"" + sounds[i] + "\"");
            }
        }
        else{
            System.out.println("ERROR Massiv Length!!");
        }
    }

    // Поиск животного по названию
    public static void findAnimalSound(String animalName,String[] animals,String[] sounds){
        boolean isFound = false;
        for(int i=0; i<animals.length;i++){
            if(animalName.equals(animals[i].toLowerCase())){
                System.out.println("Это животное издает звук \"" + sounds[i] + "\"");
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Животное не найдено");
        }
    }
}
