package homework.homework44;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

public class AuthenticationManagerUtil {

    private static List<User> personList;
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationManagerUtil.class);
    private static final File file = Path.of("src", "main", "resources", "hw44_User.txt").toFile();
    private static final FileManager<User> fileManager = new FileManager<>(User.class);

    //Статический блок инициализации выполняется один раз при загрузке класса в память.
    static{
        personList = fileManager.ArrayOfStringsInListOfObjects(file);
    }

    //метод идентификации, есть ли такой пользователь в списке
    public static boolean isRegisteredUser(String userName, String password){
        for (User user : personList) {
           if(user.getUserName().equals(userName) && user.getPassword().equals(password)) {
               return true;
           }
        }
        LOGGER.error("User is not found or password is wrong");
        return false;

    }


    //метод который проверяет является ли эта персона user или admin
    public static boolean isAdmin(String userName, String password){
        for (User user : personList) {
            if(user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                if(user.getRole().equals("admin")){
                    return true;
                }
            }

        }
        return false;
    }

}
