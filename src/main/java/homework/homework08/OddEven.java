package homework.homework08;

public class OddEven {
    public static void main(String[] args) {
        //Напечатать в консоль все парные числа от 1 до 20
        // c for
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");

        //c while
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println(" ");

        //c do while
        i = 1;
        do{
            if(i%2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }while(i<=20);

    }
}
