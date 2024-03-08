package lessons.lesson16;

public class ZooHW15 {
    private static final String[] animalSpecies = {"Лев", "Слон", "Обезьяна"};
    private static final String[] animalSounds = {"РРРРРы", "Тутутуту", "ОААААА"};

    public static void main(String[] args) {
        printAnimalSounds(animalSpecies, animalSounds);
        findAnimalSound("Левz", animalSpecies, animalSounds);
    }

    public static void printAnimalSounds(String[] animals, String[] sounds) {
        for (int i = 0; i < animals.length; i++) {
            String animalString = animals[i];
            String animalSoundString = sounds[i];
            System.out.println(animalString + " " + animalSoundString);
        }
    }

    public static void findAnimalSound(String animal, String[] animals, String[] sounds) {
        boolean found = false;

        for (int i = 0; i < animals.length; i++) {
            if (animal.equals(animals[i])) {
                System.out.println(sounds[i]);
                found=true;
            }

        }
        if (!found) {
            System.out.println("Животное " + animal + " не найдено !!!");
        }


        //второй вариант используя break
            for (int i = 0; i < animals.length; i++) {
                if (animal.equals(animals[i])) {
                    String sound = sounds[i];
                    System.out.println(sound);
                    break;
                }
                if(i == animals.length-1){
                    System.out.println("Животное " + animal + " не найдено !!!");
                }


        }
        }
    }

