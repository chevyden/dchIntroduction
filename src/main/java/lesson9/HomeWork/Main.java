package lesson9.HomeWork;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    /*
    (Все пункты задания выполнить как последовательные действия одной задачи, а не 6 разных задач.
    В сумме получится полноценная программа)
1. Создайте класс User, у которого будет несколько полей(имя, фамилия, почта, пароль, пол, страна).
Соблюдая принципы инкапсуляции реализуйте в нем все необходимые методы/конструкторы для дальнейшей работы.
2. Так же у данного класса должно быть 2 метода:
а). Читать. Принимает текст, ничего не возвращает, выводит сообщение принятое в консоль. Данный метод
необходимо задать как “неизменяемый”.
б). Писать. Ничего не принимает, просто считывает текст с клавиатуры и сохраняет введенный текст в файл.
3. Создать 2 Класса-наследника от User: Support & Admin. Данные классы должны быть заданы, как классы от
которых невозможно больше наследоваться. Так же для этих классов необходимо определить все необходимые базовые
методы для дальнейшей работы.
4. У класса Support определить дополнительный метод-проверки строки.
Этот метод должен на вход принимать строку и проверять наличие этой строки в файле. Обратно возвращать значение
“содержит/не содержит”(подумайте какая переменная лучше всего подходит для данного типа)
5. У класса Admin реализовать другой метод-удаления. Данный метод на вход получает значение “содержит/ не содержит”
 и в зависимости от этого значения удаляет файл(если содержит).
6. Далее имея все необходимые классы, зная принцип “динамической диспетчеризации методов” и команду “instanceof”
 создайте метод, который будет принимать на вход User(какого-то) и в зависимости от типа вызывать методы:
User = написать строку
Support = написать строку + проверить наличие этой строки в файле
Admin = написать строку + проверить + удалить файл, если такая строка найдена.

     */
    public static void main(String[] args) throws IOException {

        User firstUser = new User();
        firstUser.setName("Tramph");

        Support secondUser = new Support();
        secondUser.setOrigin("USA");

        Admin thirdUser = new Admin();
        thirdUser.setPassword("qwerty");

        User fourthUser = new Admin();
        User fifthUser = new Support();

//  firstUser.writeTextConsoleInFile();   //разкоментировать для создания текстового файла, если его нет, и/или записи текста в файл.

        checkUsers(fourthUser);

    }

    public static void checkUsers(User user) throws IOException {

        if (user instanceof User) {                    // условие будет срабатывать каждый раз, поскольку все объекты
            System.out.println("Instance of User");    //наследники класса User и являются экземплярами этого класса.
//            inputString();                             //
        }

        if (user instanceof Support) {
            System.out.println("Instance of Support");
            ((Support) user).checkStringInFile(inputString());
        }

        if (user instanceof Admin) {
            System.out.println("Instance of Admin");
            Support support = new Support();
            user = support;
            boolean check = ((Support) user).checkStringInFile(inputString());
            Admin admin = new Admin();
            user = admin;
            ((Admin) user).fileDeleter(check);

        }


    }

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String inputText = scanner.nextLine();
        return inputText;
    }
}
