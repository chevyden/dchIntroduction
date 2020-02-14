package lesson9.HomeWork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
5. У класса Admin реализовать другой метод-удаления. Данный метод на вход получает значение “содержит/ не содержит”
 и в зависимости от этого значения удаляет файл(если содержит).
 */
public final class Admin extends User {


    public Admin() {

    }

    public void fileDeleter(boolean thereIs) throws IOException {
        String pathUserTextFile = "/home/dbhc/IdeaProjects/introduction/src/main/resources/lesson9/homeWorkLesson9/UserText.txt";
        Path textFilePath = Paths.get(pathUserTextFile);
        if (thereIs) {
            Files.delete(textFilePath);
        }
    }
}
