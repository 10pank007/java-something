package lesson2.demo2_enums;

public enum ROLE {
    ADMIN("foo"),
    MANAGER("bar"),
    SUPERVISER;
    private String token;

    ROLE(String token) {
        this.token = token;
    }

    ROLE() {

    }

    public String getToken() {
        return token;
    }
}
