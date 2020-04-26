package lesson7.ClassWork0402;

public class FrontSimulator {

    /**
     * @return Возвращаяет условно пользователя, которого прислали с фронт-енд
     */
    public User userForRegister() {
        return new User("Alex", "Bob", "alex@mail.com", "", "man", 18);
    }
}

