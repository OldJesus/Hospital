package hospital;
import java.util.Scanner;

public class Hostage {
    private String name;
    private String surname;
    private String login;

    public Hostage(String name, String surname, String login) {
        this.name = name;
        this.surname = surname;
        this.login = login;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getLogin() {
        return login;
    }
}