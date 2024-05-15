package homework.homework32;

public class Task03 {

    //Метод, который принимает строку и возвращает ее в верхнем регистре
    public String stringUppercase(String string){
        if(string == null){
            return null;
        }
        else if(string.isEmpty()){
            return "String is empty";
        }
        else {
            return string.toUpperCase();
        }
    }
}
