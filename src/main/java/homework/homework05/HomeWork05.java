package homework.homework05;

public class HomeWork05 {
    public static void main(String[] args) {
      /*
      Задание 1
        Напишите программу, которая сравнивает два введенных числа a и b. Программа должна выводить:

        "a больше b", если a > b
        "a меньше b", если a < b
        "a равно b", если a и b равны
       */
        int a = 122, b =122;
        if(a>b)
            System.out.println("a больше b");
        else
            if(a<b)
            System.out.println("a меньше b");
            else
            System.out.println("a равно b");
        System.out.println("----------------------------------------------------------------");


        /*
        Задание 2
        Даны три целых числа x, y и z. Напишите программу, которая проверяет, лежит ли y между x и z. Ваша программа
        должна выводить true, если y находится между x и z, и false в противном случае.
         */
        int x=23, y=33, z=55;
        if(y>x && y<z)
            System.out.println(true);
        else
            System.out.println(false);
        System.out.println("----------------------------------------------------------------");

        if(x-y < 0 && y-z < 0){
            System.out.println(true);
        }
        else
            System.out.println(false);

        boolean isBetweenResult = (x>y)&&(x<z);
        System.out.println(isBetweenResult);

        /*
        Задание 3
        Напишите программу, которая проверяет, соответствует ли введенный возраст условиям для получения водительских
        прав. В разных странах возраст, когда можно начать учиться водить машину, может отличаться. Пусть в вашей
        программе минимальный возраст будет 16 лет, а максимальный – 75 лет. Программа должна выводить true, если
        возраст соответствует условиям, и false – если нет.
         */
        byte age =12;
        if(age>=16 && age<=75)
            System.out.println(true);
        else
            System.out.println(false);
        System.out.println("----------------------------------------------------------------");
        boolean isCheck;

        /*
        Задание 4
        Напишите программу, которая оценивает результаты теста. Пусть результат теста хранится в переменной score. Если
        score больше или равно 90, выведите "Отлично", если score между 70 и 89 – выведите "Хорошо",
        если между 50 и 69 – "Удовлетворительно", и "Неудовлетворительно" во всех остальных случаях.
         */

        int score =70;
        if(score>=90)
            System.out.println("Отлично");
        else if(score>=70 && score<90)
            System.out.println("Хорошо");
        else if(score>=50&&score<70)
            System.out.println("Удовлетворительно");
        else
            System.out.println("Неудовлетворительно");
    }
}
