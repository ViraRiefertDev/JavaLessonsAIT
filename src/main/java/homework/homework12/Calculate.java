package homework.homework12;
/*
Напишите программу на Java, которая демонстрирует работу с методами. Ваша программа должна
включать метод calculateArea, который принимает в качестве аргументов значения типа double:
длину и ширину прямоугольника, и возвращает значение его площади. Также должен быть реализован
метод calculatePerimeter, принимающий те же аргументы и возвращающий периметр прямоугольника.
Главный метод (main) должен считывать значения длины и ширины, переданные пользователем,
вызывать оба эти метода для расчета площади и периметра, и выводить результаты расчетов на экран.
 */
import java.util.Scanner;
public class Calculate {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите длинну прямоугольника: ");
        checkValidData();
        double lengthOfRectangle = scanner.nextDouble();
        System.out.print("Введите ширину треугольника: ");
        checkValidData();
        double widthOfRectangle = scanner.nextDouble();


        double areaOfRectangle = calculateArea(lengthOfRectangle,widthOfRectangle);
        print(areaOfRectangle, 'a');


        double perimeterOfRectangle = calculatePerimeter(lengthOfRectangle,widthOfRectangle);
        print(perimeterOfRectangle, 'p');
    }

    public static void checkValidData(){
        while(!scanner.hasNextDouble()){
            System.out.println("Введите корректные данные: ");
            scanner.next();
        }
    }

    public static double calculateArea(double length, double width){
        return length*width;
    }

    public static double calculatePerimeter(double length, double width){
        return (length+width)*2;
    }

    public static void print(double result, char parameter){
        if (parameter == 'a'){
            System.out.println("Площадь прямоугльника= " + result);
        }
        else {
            System.out.println("Периметр прямоугольника= " + result);
        }
    }
}
