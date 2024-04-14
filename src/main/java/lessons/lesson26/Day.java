package lessons.lesson26;

public enum Day {
    //Enum сприсок из значений которые могут принимать переменные
    //Есть переменная, которая может обозначать день недели
    //MONDAY(),TUESDAY, WEDNESDAY,THUSDAY,FRIDAY,SATURDAY,SUNDAY  - простой конструктор
    //где тип boolean, enum использовать не надо

    MONDAY("Montag are bad day"),
    TUESDAY("Tuesday are bad day"),
    WEDNESDAY("Wednesday is a small Friday"),
    THUSDAY("Thursday is a small Saturday"),
    FRIDAY("Friday is cool"),
    SATURDAY("Saturday is a small monday"),
    SUNDAY("Cool!!");

    private String description;
    Day(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }


}
