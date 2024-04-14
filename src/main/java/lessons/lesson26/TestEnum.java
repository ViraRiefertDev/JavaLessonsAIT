package lessons.lesson26;

import java.net.http.HttpHeaders;
import java.util.EnumMap;
import java.util.EnumSet;

public class TestEnum {
    //Enum сприсок из значений которые могут принимать переменные
    //Есть переменная, которая может обозначать день недели
    //Применяется когда список ограничени и не будет меняться, и пользователь обязан выбрать один из этих параметров.

    private static AccessLevel accessLevel = AccessLevel.WRITE;
    private static Day dayOfWeek = Day.MONDAY;

    //список из 2ух элементов
    //как расположены в enum так они и сохраняются в enumSet и поэтому лучше HashSet
    private static EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY,Day.SUNDAY);
    //Указываем в скобка к какому классу относиться ключ
    //Упорядочивает по ключам наш список
    private static EnumMap<Day,String> dayStringEnumMap = new EnumMap<>(Day.class);
    public static void main(String[] args) {
        weekend.add(Day.FRIDAY);
        System.out.println(weekend);

        dayStringEnumMap.put(Day.FRIDAY,"Super !!!");
        dayStringEnumMap.put(Day.MONDAY, "Kaka");
        dayStringEnumMap.put(Day.SATURDAY,"Cool !!");


        System.out.println(HttpStatus.NOT_FOUND.getMessage());




        //if(dayOfWeek.equals(Day.MONDAY)
        if(dayOfWeek.name().equals("MONDAY")){
            System.out.println("MONDAY");
            System.out.println(Operations.MINUS.apply(100,50));
        }
        //выполняется, если пользователь имеет доступ write
        if(accessLevel.canWrite()){
            //Method to change file
            //он защищен тем, что к нему имеет доступ только пользователь с правами write
            System.out.println("File was changed");
        }
        else{
            System.out.println("Low access level");
        }

        checkDayOfWeek(dayOfWeek);
    }

    public static void checkDayOfWeek(Day day){
        switch (day){
            case MONDAY:
                System.out.println(day.name() + day.getDescription());
                break;
            case TUESDAY:
                System.out.println(day.name() + day.getDescription());
                break;
            case FRIDAY:
                System.out.println(day.name() + day.getDescription());
                break;
            default:
                System.out.println(day.name() + day.getDescription());
                break;
        }
    }
}
