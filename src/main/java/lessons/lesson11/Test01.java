package lessons.lesson11;
//Демонстрация бесконечного цикла и условия выхода из него
public class Test01 {
    public static void main(String[] args) {
        while (true) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            System.out.println(randomNumber);
            if (randomNumber == 50) {
                break;
            }
            if(randomNumber == 99){
                System.out.println("BINGO");
            }
        }
        System.out.println("STOP");
    }
}
