package lesson6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class HomeWorkLesson6 {
    public static void main(String[] args) throws IOException {
//        /*
//       +- 1. Дана строка: “ Hillel is my feature. I will be developer   ”
//        Необходимо выполнить следующие действия:
//        +о Проверить не пустой ли заданный текст;
//        +о Вывести длину данного текста;
//        +о Вывести длину данного текста убрав лишние пробелы вначале и конце текста;
//        +о Используя команду получения значения из строки по индексу вывести “I”;
//        +о Используя команду обрезания вывести “developer”;
//        +о Добавить в конце строки знак “!”;
//        +о Выполните сравнение заданной строки со строкой: “Hillel is my feature. I will be DEVELOPER” так,
//        чтобы в одном случае они были равны, а в другом не равны;
//        +о Выведите данную строку в нижнем регистре;
//        +о Выведите данную строку в верхнем регистре;
//*/
//        String hillel = " Hillel is my feature. I will be developer   ";
//        System.out.println(hillel.isEmpty());
//        System.out.println(hillel.length());
//
//        String hillelTrim = hillel.trim();
//        System.out.println(hillelTrim);
//
//        System.out.println(hillel.charAt(23));
//        System.out.println(hillel.substring(33, 42));
//        System.out.println(hillelTrim.concat("!"));
//
//        String hillelUpperDev = "Hillel is my feature. I will be DEVELOPER";
//        System.out.println(hillelTrim.equals(hillelUpperDev));
//        System.out.println(hillelTrim.equalsIgnoreCase(hillelUpperDev));
//
//        System.out.println(hillel.toLowerCase());
//        System.out.println(hillel.toUpperCase());
//
///*
//       + 2. Используя таблицу Unicode напечатайте 5 “необычных” символов, выберите из отпраленной таблицы символов;
//*/
//        char firstUnicode = 2368;
//        System.out.print(firstUnicode + "    ");
//        char secondUnicode = 2508;
//        System.out.print(secondUnicode + "    ");
//        char thirdUnicode = 2964;
//        System.out.print(thirdUnicode + "    ");
//        char fourthUnicode = 4172;
//        System.out.print(fourthUnicode + "    ");
//        char fifthUnicode = 5147;
//        System.out.println(fifthUnicode);

/*
       + 3. Необходимо записать любое четверостишие в файл и считать.Условия:
        о Директории, в которую будет запись файла, может изначально не существовать. Необходимо это учесть;
        о Файл соответственно должен создаваться при записи;
        о После записи необходимо проверить все ли записалось и вывести сообщение об успешной записи;
        о В завершение необходимо считать стих из созданного файла и вывести в консоль.\


*/

        writeFile();
        checkRecordFile();
        readFile();

/*
        4. Написать программу “registration”. Условия:
        о При запуске, программа должна просить задать логин и пароль;
        о Поле пароль необходимо запросить 2 раза для правильного ввода;
        о В случае несовпадения паролей, программа должна выводить сообщение о не соответствии паролей и выходить.
        о В случае, если все указано верно, то данный (логин и пароль) должны записать в файл users.txt
        (где будут храниться все данные про пользователей);
*/



/*
        5. Написать программу “login”. Условия:
        о При запуске программ должна просить ввести данные для входа: логин и пароль;
        о Сверку данных проводить из того же файла users.txt. Если пользователь с введенными логином и паролем есть,
        то выводить сообщение-приветствие. Если нет - то просить ввести повторно.
        о Если 3 попытки ввода логина и пароля были неуспешны, то выводить сообщение о просьбе повторить позже и
        останавливать программу.
*/
    }

    private static void writeFile() throws IOException {
        String filePoemsPath = "/home/dbhc/IdeaProjects/introduction/src/main/resources/lesson6/homeWorkLesson6/PoemsFile.txt";
        Path dirPath = Paths.get(filePoemsPath);
        if (!Files.exists(dirPath.getParent())) {
            Files.createDirectories(dirPath.getParent());
        }
        FileWriter filePoemsWriter = new FileWriter(filePoemsPath, true);
//        filePoemsWriter.close();
        filePoemsWriter.write("- Это кто упал? Серёжа?\n" +
                "- Нет, не он, - его одёжа.\n" +
                "- Что же стукнула одёжа?\n" +
                "- В середине был Серёжа.\n" +
                "                     Самуил Маршак\n");
        filePoemsWriter.close();
    }

    private static void checkRecordFile() throws IOException {
        String filePoemsPath = "/home/dbhc/IdeaProjects/introduction/src/main/resources/lesson6/homeWorkLesson6/PoemsFile.txt";

        FileReader checkRecord = new FileReader(filePoemsPath);
        Scanner scanCheckRecord = new Scanner(checkRecord);

        if (scanCheckRecord.hasNextLine()) {
            System.out.println("Всё записано, нажмите 1 и ENTER для продожения.");
            Scanner scanner = new Scanner(System.in);
            int scan = scanner.nextInt();

            /*
             *Есть ли необходимость в if else???
             */

            if (scan == 1) {
            } else {
                return;
            }
        } else {
            System.out.println("Запись в файл провалена, попробуйте ещё раз!");
        }

        checkRecord.close();
        scanCheckRecord.close();
    }

    private static void readFile() throws IOException {
        String filePoemsPath = "/home/dbhc/IdeaProjects/introduction/src/main/resources/lesson6/homeWorkLesson6/PoemsFile.txt";

        FileReader filePoemsReader = new FileReader(filePoemsPath);
        Scanner scanFilePoems = new Scanner(filePoemsReader);
        while (scanFilePoems.hasNextLine()) {
            System.out.println(scanFilePoems.nextLine());
        }
        filePoemsReader.close();
        scanFilePoems.close();

    }
}
