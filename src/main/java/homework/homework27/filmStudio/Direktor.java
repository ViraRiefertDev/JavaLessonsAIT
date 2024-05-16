package homework.homework27.filmStudio;

public class Direktor extends FilmStudioEmployee{
    public Direktor(String name, String position, int experienceYears) {
        super(name, position, experienceYears);
    }

    public void direct(){
        System.out.println("Director leads the film crew.");
    }

    @Override
    public void work(){
        super.work();
        System.out.println("He is casting for the lead role in a new film.");
    }
}
