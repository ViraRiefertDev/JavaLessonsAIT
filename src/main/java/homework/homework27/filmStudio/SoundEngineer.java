package homework.homework27.filmStudio;

public class SoundEngineer extends FilmStudioEmployee{
    public SoundEngineer(String name, String position, int experienceYears) {
        super(name, position, experienceYears);
    }
    public void recordSound(){
        System.out.println("SoundEngineer records sound.");
    }

    @Override
    public void work(){
        super.work();
        System.out.println("He wipes the foggy camera lens.");
    }
}
