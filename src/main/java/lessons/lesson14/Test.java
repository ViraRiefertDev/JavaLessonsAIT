package lessons.lesson14;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        //Строка -> число
        String numberString ="34";
        int numberInt = Integer.parseInt(numberString);
        System.out.println(numberInt - 4);

        //число --> строка
        int ageInt = 49;
        String ageString = String.valueOf(ageInt);
        System.out.println(ageString.concat(" years"));
    }



}
