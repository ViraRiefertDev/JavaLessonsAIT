package homework.homework27.filmStudio;

import java.util.ArrayList;

import java.util.HashMap;
public class MovieSet {
    //private HashMap<String,FilmStudioEmployee> employee = new HashMap<>();
    public static void simulateDayOfWork(ArrayList<FilmStudioEmployee> employers){
        for(FilmStudioEmployee employee:employers){
            employee.work();
            System.out.println("----------------------");
        }
    }

}
