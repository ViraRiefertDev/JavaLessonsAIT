package lesson12;
/*
 если метод static, то его можно вызывать без создания объекта

 перегрузка методов Overloading названия методов одинаковые, но значения, которые мы туда посылаем разные
 (Аргумент класса String одинаков хоть и имена могут быть разные), тоесть аргументы должны отличаться типами или
 количеством аргументов
один метод, но различная реализация метода
*/
public class JavaMethods {
    public static void main(String[] args) {
        printGreeting();
        printGreetingStudent("Anna");
        printGreetingStudent("Anna", 42.2);
        boolean checkResult = checkStudent("Anna");
        System.out.println(checkResult);
        //checkGroupNumber(34);
        int factorial = getFactorial(5);
        System.out.println(factorial);
    }

    public static void printGreeting() {
        System.out.println("Hallo Berlin!!!");
    }

    public static void printGreetingStudent(String studentName) {
        System.out.println("Hallo " + studentName);
    }

    public static void printGreetingStudent(String studentName, double groupNumber) {
        System.out.println("Hallo " + studentName + " your group " + groupNumber);
    }

    public static boolean checkStudent(String studentName) {
        if (studentName.equals("Anna")) {
            return true;
        } else {
            return false;
        }
    }

        //return studentName.equals("Anna");


    //рекурсивный метод
    //Нужен когда есть выход, есть return
    // иначе получаем бесконечный цикл
//    public static boolean checkGroupNumber(double groupNumber) {
//        System.out.println(groupNumber);
//
//        //метод вызывает сам себя
//        checkGroupNumber(groupNumber);
//        return true;
//    }


    //рекурсивный метод рабочий
    //расчет факториала
    public static int getFactorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * getFactorial(number - 1);
        }
    }

    /*
    ------Хорошие и плохие практики------
    * название метода должне отажать что делает этот метод(его функцию)
    если метод требует пояснений то можно добавть комментарий

    * внутри метода тоже можно добавлять комментарий рядом с важными узлами
    * //findUserByName хорошее название метода сначала идет глагол

    * старайтесь чтоб метод принимал не более 3 параметров иначе требуется refactoring метода
      тоесть параметры заключить в отдельный класс (все объединить в объект и передать объект
      с этими параметрами

    * рефакторинг когда смотрим на код и думаем как его лучше сделать
      или приходят изменения из вне и надо поменять код учитывая эти изменения

    * простота метода
       метод должен быть максимально коротким, тоесть решать одну примитивную задачу
       чем примитивней метод, тем лучше его тестировать

    * валидация входящих параметров
      метод получает какие то данные (число. номер группы) то проверку (валидацию) входящих данных
      лучше делать в методе
     */
}
