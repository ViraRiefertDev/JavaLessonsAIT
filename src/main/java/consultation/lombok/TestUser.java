package consultation.lombok;


import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
@Slf4j
public class TestUser {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Alex");
        user.setAge(20);
        System.out.println( user.toString());
        log.info("fsf");
    }
}
