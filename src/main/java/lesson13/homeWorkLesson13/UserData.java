package lesson13.homeWorkLesson13;

import java.util.HashMap;
import java.util.Scanner;

public class UserData {
    private final String ANSWER_NAME = "Enter your name:";
    private final String ANSWER_COUNTRY = "Enter your country:";
    private final String ANSWER_EMAIL = "Enter your e-mail:";
    private final String ANSWER_AGE = "Enter your age:";

    private String name = "";
    private String country;
    private String email;
    private Integer age;

    private HashMap<String, Object> user = new HashMap<>();
    private HashMap<String, HashMap<String, Object>> usersInfoHashMap = new HashMap<>();

    public UserData() {
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Object> getUser() {
        return user;
    }


    public HashMap<String, Object> scanUserInfo() {
        Scanner scanner = new Scanner(System.in);

        while (name.isEmpty()) {                  //проверка на заполнение
            System.out.println(ANSWER_NAME);
            this.name = scanner.nextLine();
        }
        System.out.println(ANSWER_COUNTRY);
        this.user.put(ANSWER_COUNTRY, this.country = scanner.nextLine());
        System.out.println(ANSWER_EMAIL);
        this.user.put(ANSWER_EMAIL, this.email = scanner.nextLine());
        System.out.println(ANSWER_AGE);
        this.user.put(ANSWER_AGE, this.age = scanner.nextInt());

        return user;
    }

    public HashMap<String, HashMap<String, Object>> setUserByName(String name, HashMap<String, Object> user) {
        usersInfoHashMap.put(name, user);

        return usersInfoHashMap;
    }
}
