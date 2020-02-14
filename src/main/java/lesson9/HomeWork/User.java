package lesson9.HomeWork;
/*
1. Создайте класс User, у которого будет несколько полей(имя, фамилия, почта, пароль, пол, страна).
Соблюдая принципы инкапсуляции реализуйте в нем все необходимые методы/конструкторы для дальнейшей работы.
2. ак же у данного класса должно быть 2 метода:
а). Читать. Принимает текст, ничего не возвращает, выводит сообщение принятое в консоль. Данный метод
необходимо задать как “неизменяемый”.
б). Писать. Ничего не принимает, просто считывает текст с клавиатуры и сохраняет введенный текст в файл.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class User {
    private String name;

    private String surname;
    private String email;
    private String password;
    private String sex;
    private String origin;

    public User() {
    }

    public User(String name, String surname, String email, String password, String sex, String origin) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.sex = sex;
        this.origin = origin;
    }

    public final void readText(String textString) {

        System.out.println(textString);
    }

    public void writeTextConsoleInFile() throws IOException {
        System.out.println("Напишите текст для записи в файл:");
        Scanner textConsole = new Scanner(System.in);
        String userTextConsole = textConsole.nextLine();

        String pathUserTextFile = "/home/dbhc/IdeaProjects/introduction/src/main/resources/lesson9/homeWorkLesson9/UserText.txt";

        Path directoryPath = Paths.get(pathUserTextFile);
        if (!Files.exists(directoryPath.getParent())) {
            Files.createDirectories(directoryPath.getParent());
        }

        FileWriter fileUserTextWriter = new FileWriter(pathUserTextFile, true);
        fileUserTextWriter.write(userTextConsole + "\n");
        fileUserTextWriter.close();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
