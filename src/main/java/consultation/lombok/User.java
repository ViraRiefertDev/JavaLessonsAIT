package consultation.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter
@Getter
@EqualsAndHashCode(exclude = "name")
@ToString (exclude = "age")
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
//@Data
public class User {
    private String name;

    private int age;
}
