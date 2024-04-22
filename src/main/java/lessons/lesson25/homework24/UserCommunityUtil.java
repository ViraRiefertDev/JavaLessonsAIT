package lessons.lesson25.homework24;

import java.util.HashMap;

public class UserCommunityUtil {
    private HashMap<Integer,User> allUsers = new HashMap<>();
    private HashMap<String,Community> allCommunity = new HashMap<>();

    public void addUser(User user){
        allUsers.put(user.getId(),user);
    }
//    public void addCommunity (Community community){
//        allCommunity.put(community.)
//    }
}
