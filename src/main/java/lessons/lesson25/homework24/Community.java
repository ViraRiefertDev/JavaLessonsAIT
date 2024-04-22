package lessons.lesson25.homework24;

import java.util.HashMap;
import java.util.HashSet;

public class Community {
    private String name;
    private HashSet<User> members = new HashSet<>();
    //pubclic потмоу что через геттер нельзя будет вызвать, ибо он к объекту применим
    public static HashMap<String, Community> communityHashMap = new HashMap<>();

    public Community(String name) {
        this.name = name;
    }

}
