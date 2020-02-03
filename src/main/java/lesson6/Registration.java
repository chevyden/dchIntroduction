package lesson6;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) throws IOException {

/*
        4. Написать программу “registration”. Условия:
        о При запуске, программа должна просить задать логин и пароль;
        о Поле пароль необходимо запросить 2 раза для правильного ввода;
        о В случае несовпадения паролей, программа должна выводить сообщение о не соответствии паролей и выходить.
        о В случае, если все указано верно, то данный (логин и пароль) должны записать в файл users.txt
          (где будут храниться все данные про пользователей);
*/

        writeFile();
    }

    private static void writeFile() throws IOException {
        String filePoemsPath = "/home/dbhc/IdeaProjects/introduction/src/main/resources/lesson6/homeWorkLesson6/users.txt";
        Path dirPath = Paths.get(filePoemsPath);
        if (!Files.exists(dirPath.getParent())) {
            Files.createDirectories(dirPath.getParent());
        }
        FileWriter filePoemsWriter = new FileWriter(filePoemsPath, true);
        Scanner scanlogPass = new Scanner(System.in);

        System.out.println("Введите имя пользователя:");
        String userName = scanlogPass.next();

        System.out.println("Введите пароль:");
        String userPassFirst = scanlogPass.next();
        System.out.println("Повторите пароль:");
        String userPassSecond = scanlogPass.next();

        if (userPassFirst.equals(userPassSecond)) {
            filePoemsWriter.write(userName.concat(userPassSecond).concat(" "));
            filePoemsWriter.close();
        } else {
            System.out.println("Вы сделали ошибку. Попробуйте еще раз");
        }

    }



}
