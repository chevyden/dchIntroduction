package lesson9.HomeWork;
/*
4. У класса Support определить дополнительный метод-проверки строки.
Этот метод должен на вход принимать строку и проверять наличие этой строки в файле. Обратно возвращать значение
“содержит/не содержит”(подумайте какая переменная лучше всего подходит для данного типа)
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public final class Support extends User {
    public Support() {
    }

    public Support(String name, String surname, String email, String password, String sex, String origin) {
        super(name, surname, email, password, sex, origin);
    }

    public boolean checkStringInFile(String inputString) throws IOException {
        String pathUserTextFile = "/home/dbhc/IdeaProjects/introduction/src/main/resources/lesson9/homeWorkLesson9/UserText.txt";
        FileReader readUserTextFile = new FileReader(pathUserTextFile);
        Scanner scanner = new Scanner(readUserTextFile);

        while (scanner.hasNextLine()) {
            String userTextFileLine = scanner.nextLine();
            if (inputString.equals(userTextFileLine)) {
                scanner.close();
                readUserTextFile.close();
                System.out.println("содержит");
                return true;
            }
        }
        scanner.close();
        readUserTextFile.close();
        System.out.println("не содержит");
        return false;
    }
}
