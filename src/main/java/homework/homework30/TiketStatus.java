package homework.homework30;

public enum TiketStatus {
    NEW("new task"),
    INWORK("the task is in work"),
    COMPLETED("the task is completed");

    private String description;

    //Конструктор с переменной description
    TiketStatus(String description){
        this.description = description;
    }
}
