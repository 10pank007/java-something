package lesson1.demo7;

public class Main {
    public static void main(String[] args) {
//        String[] skills = new String[100];
//        skills[0] = "asd";
//        skills[1] = "ddd";
//        User user = new User(1, "vasia", skills);
//        System.out.println(user);
        User user = new User(1, "kokos");
        user.addSkill(0, "html");
        user.addSkill(1, "java");
        System.out.println(user);
    }
}
