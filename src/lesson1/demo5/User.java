package lesson1.demo5;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString(exclude = {"id"})
public class User {
    private int id;
    private String name;
    private boolean status;
    private double weight;

    public String greeting(String mes) {
        return mes + " my name is - " + this.name;
    }

}
