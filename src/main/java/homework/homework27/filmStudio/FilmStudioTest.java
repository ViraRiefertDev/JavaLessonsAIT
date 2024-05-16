package homework.homework27.filmStudio;

import java.util.ArrayList;
import java.util.HashMap;

public class FilmStudioTest {
    public static void main(String[] args) {
        Direktor direktor = new Direktor("Alex","Director",20);
        CameraOperator operator = new CameraOperator("Banderos","Camera Operator", 12);
        SoundEngineer soundEngineer = new SoundEngineer("Efiop","Sound Ingeneer",1);
        ArrayList<FilmStudioEmployee> employees = new ArrayList<>();
        employees.add(direktor);
        employees.add(soundEngineer);
        employees.add(operator);
        MovieSet.simulateDayOfWork(employees);
    }
}
