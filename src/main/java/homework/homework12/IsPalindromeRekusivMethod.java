package homework.homework12;



/*
Нам дается некий стринг. Определить явлеятся ли слово палиндромом используя рекурсию

 */
public class IsPalindromeRekusivMethod {
    public static void main(String[] args) {
        String s = "ABCBA";
        System.out.println(isPalindrome(s) ? "YES":"NO");
    }

    private static boolean isPalindrome(String s){

        if(s.length()==1 || s.isEmpty()){
            //Если метод дошел до этого шага, значит во всех
            // предыдущих шагах буквы друг другу равнялись и мы смело можем сказать что это true
            return true;//base step
        }
        //Если первый и последний символ строки ==, то тогда мы продолжаем вызывать
        //наш палиндром(тоесть еще есть шанс, что это будет палиндром
        if(s.charAt(0)==s.charAt(s.length()-1)){
            //первую и последнюю букву обрезаем и уменьшаем String с обеих строн убирая
            // по одной букве
            return isPalindrome(s.substring(1,s.length()-1));//recursive step
        }
        return false;
    }
}
