package lesson13.homeWorkLesson13;

import lesson9.ClassWork1102.Animal;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class HomeWorkLesson13Task1 extends UserData {
    /*
Задача 1:
Создайте программу-опросник(Можно вынести в отдельный класс с необходимым(и) методом(ами)).
Данная программа должна просить ввести пользователя свое имя, после чего проводить опрос(достаточно 2-3 вопроса).
Введенные данные сохраняются в виде ключ-значение, где ключ - это имя пользователя, а значение это данные в виде
тоже ключ-значение(где ключ - это вопрос, а значение - ответ).
Тип значения ответа на вопрос указать на свое усмотрение.
После проведенного опроса программа должна записать результат в файл.
     */
    public static void main(String[] args) throws IOException {

        UserData firstUser = new UserData();
        firstUser.scanUserInfo();
        writeUserInfoToFile(firstUser.setUserByName(firstUser.getName(), firstUser.getUser()).toString());

    }

    public static void writeUserInfoToFile(String userInfo) throws IOException {
        String pathTextFile = "/home/dbhc/IdeaProjects/introduction/src/main/resources/lesson13/homeWorkLesson13/UsersInfo.txt";

        Path directoryPath = Paths.get(pathTextFile);
        if (!Files.exists(directoryPath.getParent())) {
            Files.createDirectories(directoryPath.getParent());
        }

        FileWriter fileUserTextWriter = new FileWriter(pathTextFile, true);
        fileUserTextWriter.write(userInfo + "\n");
        fileUserTextWriter.close();
    }

}

