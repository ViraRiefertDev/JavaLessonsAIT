package lessons.lesson15;

public class Dog {
    private String name;
    private String color;
    private String breed;
    private boolean canBellt;
    private boolean serviceDog;

    //конструктор это кусочек кода, который по шаблону создает объект класса
    // Чем конструктор отличатеся от метода
    //Конструкторы и классы называются одинаково всегда
    //обязательно надо передать все параметры конструктора, чтоб создать объект собака
    //конструктор всегда публичный и не возвращает никакое значения

    public Dog(String name, String color, String breed, boolean canBellt, boolean serviceDog) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.canBellt = canBellt;
        this.serviceDog = serviceDog;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isCanBellt() {
        return canBellt;
    }

    public boolean isServiceDog() {
        return serviceDog;
    }
}
