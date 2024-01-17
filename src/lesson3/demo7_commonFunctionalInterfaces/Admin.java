package lesson3.demo7_commonFunctionalInterfaces;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Admin {
    private String name;
    private String login;
    private String password;
}
