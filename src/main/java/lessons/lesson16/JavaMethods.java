package lessons.lesson16;

public class JavaMethods {
    public static void main(String[] args) {
       int result = sum(5,6);
       int year = addSalary(3455);
       int yearSmall = addSalary(3454,45);
        System.out.println(result + " " +year+ " " + yearSmall);
        printNames();
        String[] array = new String[0];

    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }
    static int yearSalary =0;
    public static int addSalary(int monthSalary){
        yearSalary += monthSalary;
        return yearSalary;
    }

    public static int addSalary(int monthSalary, int smallSalary){
        yearSalary += monthSalary + smallSalary;
        return yearSalary;
    }

    //Varargs параметры должны быть последним в листе и единственным вараргсом
    public static void printNames(String ... names){
        for(String name: names){
            System.out.println(name);
        }
    }

}
