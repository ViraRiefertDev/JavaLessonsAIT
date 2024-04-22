package homework.homework27.filmStudio;

public class CameraOperator extends FilmStudioEmployee{
    public CameraOperator(String name, String position, int experienceYears) {
        super(name, position, experienceYears);
    }
    public void operateCamera(){
        System.out.println("Operator controls the camera.");
    }

    @Override
    public void work(){
        super.work();
        System.out.println("He makes short videos for all candidates for the role.");
    }
}
