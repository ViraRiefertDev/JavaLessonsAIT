package lessons.lesson26;

public class TestSeasons {
    public static void main(String[] args) {
        System.out.println(Season.SUMMER.getActivity());
        whatToWear(Season.SUMMER);
    }
    /*
    Используя созданный enum `Season`, напишите метод, который принимает значение `Season` и выводит сообщение о том,
    как одеваться в этот сезон, используя конструкцию `switch`.
     */
    public static void whatToWear(Season season){
        switch (season){
            case SUMMER:
                System.out.println("Шорты и майка, вот ваш выбор");
                break;
            case AUTUMN:
                System.out.println("Идут дожди не забудьте дождевик или зонтик");
                break;
            case WINTER:
                System.out.println("Оденьтесь по теплее, ожидаются морозы, а лучше сидите дома!");
                break;
            case SPRING:
                System.out.println("K.A. April macht was er will :)");
                break;
        }
    }

}
