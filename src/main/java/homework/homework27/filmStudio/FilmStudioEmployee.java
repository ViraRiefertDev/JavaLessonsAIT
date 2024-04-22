package homework.homework27.filmStudio;

public class FilmStudioEmployee {
    private String name;
    private String position;
    private int experienceYears;

    public FilmStudioEmployee(String name, String position, int experienceYears) {
        this.name = name;
        this.position = position;
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void work(){
        System.out.println(getName() + " works on her current task.");
    }
}
