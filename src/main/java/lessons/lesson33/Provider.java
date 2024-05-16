package lessons.lesson33;

import java.util.stream.Stream;

public class Provider {

    static Stream<String> stringProvider(){
        return Stream.of("apple","banana","cherry");
    }
}
