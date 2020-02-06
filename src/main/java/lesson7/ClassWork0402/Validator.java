package lesson7.ClassWork0402;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Validator {
    /**
     * @param user Данные необходимые для сохранения
     * @throws IOException возможная ошибка метода
     * Метод сохраняет полученного пользователя с  фронт-енд в файл
     */
    public static void saveUser(User user) throws IOException, IOException {
        FileWriter fileWriter = new FileWriter("/Users/kreeck/IdeaProjects/hillel/src/main/resources/lesson7/users.txt");
        Scanner scanner = new Scanner(System.in);
        fileWriter.write(user.toString());
        fileWriter.close();
    }
}
