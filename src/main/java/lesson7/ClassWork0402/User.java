package lesson7.ClassWork0402;

public class User {
    String name;
    String surname;
    String email;
    String password;
    String sex;
    int age;

    public User() {
    }

    public User(String name, String surname, String email, String password, String sex, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}

