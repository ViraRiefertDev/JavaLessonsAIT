package homework.homework12;
/*
 Разработайте класс StringProcessor, который будет предоставлять статические методы для
 работы со строками:
 Метод reverseString, который принимает строку и возвращает её в перевёрнутом виде.
 Метод isPalindrome, который проверяет, является ли переданное слово палиндромом (читается
 одинаково в обоих направлениях). Метод должен возвращать булево значение.
 */
//import java.util.Scanner;
public class StringProcessor {
//    static Scanner scanner = new Scanner(System.in);

//    public static void main(String[] args) {
////        System.out.println("Введите строку которую надо перевернуть");
////        String str = scanner.nextLine().trim();
////        String reverse = reverseString(str);
////        System.out.println(reverse);
////
//        System.out.println("Введите слово, а мы проверим полиндром ли оно");
//        String word = scanner.next();
//
//        boolean isPalindrome = isPalindrome(word);
//
//        if(isPalindrome){
//            System.out.println("Слово является полиндромом");
//        }else{
//            System.out.println("Слово не является полиндромом");
//        }
//    }

    public static String reverseString(String str){
        String reverseString = "";
        for(int i = (str.length()-1); i>=0;i--){
           reverseString += str.charAt(i);
        }
        return reverseString;
    }

    public static boolean isPalindrome(String word){
        boolean isPalindrome = true;
        char[] charWord = word.toCharArray();
        int halfLength =word.length()/2;
        for (int i = 0; i<halfLength; i++){
            if(charWord[i]!=(charWord[charWord.length-i-1])){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
