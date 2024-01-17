package lesson1.demo2;

public class Main {
    public static void main(String[] args) {
        System.out.println("start program");
        User user = new User();
        user.id = 1;
        user.name = "Vasil";
        user.status = true;
        user.weight = 80.0;
        System.out.println(user);
        //System.out.println(user.id + " " + user.name + " " + user.status + " " + user.weight);

        System.out.println("end program");
    }
}
