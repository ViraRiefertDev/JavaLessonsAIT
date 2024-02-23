package lessons.lesson11;
import java.util.Scanner;
public class JavaSwitchCase {
    public static void main(String[] args) {
        String expression = "value1";
        switch (expression){
            case "value1":
                //Код для выполнения если expression == "value1"
                break;
            case "Value2":
                //Код для выполнения если expression == "value2"
                break;
            case "value3":
                //Код для выполнения если expression == "value3"
                break;
            default:
                //Код для выполнения если expression не соответствует ни одному case

        }

        int day = 3;
        String dayString;
        switch (day){
            case 1:
                dayString = "Понедельник";
                break;
            case 2:
                dayString  = "Вторник";
                break;
            case 3:
                dayString = "Среда";
                break;
            default:
                dayString = "Остальные дни";
        }
        //работает по принципу ключ занчение. сразу уходит в нужный кейс
        //поэтому работает быстрее чем if else
        //строка 44 }; ; изза оператора ->

        // если пишем больше одной строки кода,
        // код надо помещать в {} и dayString = "Рабочий день";

        //код должен быть типа void невозвращаемый (если пишем одну строку кода)
        // тоесть print не получится написать в одну строку

        // если пишем код то для всех кейсов, если задаем значение то для всех так
        // (тоесть для всех кейсов должно быть все однообразно)
        dayString = switch (day){
            case 1,2,3,4,5 -> "Рабочий день";
            case 6,7 -> "Выходной";
            default -> "ОШИБКА!!!!";
        };
        System.out.println(dayString);
    }
}
