package lessons.lesson26;

public enum Season {
    /*
    Создайте enum `Season`, который включает четыре времени года: `SPRING`, `SUMMER`, `AUTUMN`, `WINTER`.
    Напишите метод в этом enum, который возвращает рекомендуемую активность для каждого сезона (например, лыжи зимой).
     */

    /*

     */
    SPRING("Running"),
    SUMMER("Swimming"),
    AUTUMN("Bycicle"),
    WINTER("Ski");
    private String activity;
    Season(String activity){
        this.activity = activity;
    }

    public String getActivity(){
        return activity;
    }


}
