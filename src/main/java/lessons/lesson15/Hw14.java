package lessons.lesson15;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Hw14 {

    //Вывели массив за пределы main потому что он нам понадобится множество раз
    //и доступ к массиву будет иметь любой метод класса
    private static String[] hobbies = {"рисование", "программирование","велосипед"};
    private static int[] ratings = {10,5,40};
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        showHobbies();
//        boolean foundHobby = findHobby("программирование");
//        if(foundHobby){
//            System.out.println("Хобби найдено.");
//        }
//        else{
//            System.out.println("Хобби не найдено");
//        }
//        System.out.println("Введите индекс хобби:");
//        while(!scanner.hasNextInt()){
//            System.out.println("Ошибка, введите число");
//            scanner.next();
//        }
//        int number = scanner.nextInt();
//        showFavoriteHobbyByNumber(number);
//
//        System.out.println("Введите новое хобби");
//        String newHobby= scanner.next();
//        addHobby(newHobby);
//        showHobbies();
        showHobbiesAndRatings();

    }

    //Выведите все хобби из массива на экран.
    public static void showHobbies(){
        //Если хранилище hobbies пустое, то в цикл не зайдет
        for(String hobby: hobbies){
            System.out.println(hobby);
        }
    }

    //Найти заданное хобби
    public static boolean findHobby(String hobbyToFind){
        boolean found = false;
        for(String hobby: hobbies){
            if(hobby.equals(hobbyToFind)){
                found = true;
                //улучшение
                break;
            }
        }

        return found;
    }


    //поиск через номер своего любимого хобби
    public static void showFavoriteHobbyByNumber(int number){
        if(number<0 || number>=hobbies.length){
            System.out.println("ERROR");
        }
        else{
            String fovoriteHobby = hobbies[number];
            System.out.println(fovoriteHobby);
        }
    }

    //Добавляем новое хобби в массив
    public static void addHobby(String newHobby){
        String[] hobbiesNew = new String[hobbies.length + 1];
        System.arraycopy(hobbies, 0, hobbiesNew,0,hobbies.length);
        hobbiesNew[hobbiesNew.length-1] = newHobby;
        hobbies=hobbiesNew;
    }

    //что такое placeHolder в java?? %s это placeholder
    public static void showHobbiesAndRatings(){
        if(hobbies.length != ratings.length){
            System.out.println("ERROR RATING!!!");
        }
        for(int i=0; i<hobbies.length;i++){
            String hobby = hobbies[i];
            int rating = ratings[i];
            System.out.println(String.format("Хобби %s рейтинг %d", hobby, rating));
        }
    }
}
