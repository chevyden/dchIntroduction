package lesson6;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws IOException {

/*
        5. Написать программу “login”. Условия:
        о При запуске программ должна просить ввести данные для входа: логин и пароль;
        о Сверку данных проводить из того же файла users.txt. Если пользователь с введенными логином и паролем есть,
        то выводить сообщение-приветствие. Если нет - то просить ввести повторно.
        о Если 3 попытки ввода логина и пароля были неуспешны, то выводить сообщение о просьбе повторить позже и
        останавливать программу.
*/


        boolean check = logPassCheck();

        for (int i = 1; i <= 3; i++) {
            if (check == false) {
                System.out.println("Введите логин и пароль ещё раз.\nУ Вас осталось: " + (4-i)+" шанc(а)");
                check = logPassCheck();

            } else  {
                System.out.println("Приветствуем Вас в системе!");
                break;
            }
            if (i==3){
                System.out.println("Повторите попытку позже");}

        }
    }


    private static boolean logPassCheck() throws IOException {
        Scanner scanLogPass = new Scanner(System.in);
        String fileLogPassPath = "/home/dbhc/IdeaProjects/introduction/src/main/resources/lesson6/homeWorkLesson6/users.txt";

        System.out.println("Введите логин:");
        String enterLog = scanLogPass.next();

        System.out.println("Введите пароль:");
        String enterPass = scanLogPass.next();

        FileReader fileReader = new FileReader(fileLogPassPath);
        Scanner scanLogPassUsers = new Scanner(fileReader);
        String users = scanLogPassUsers.nextLine();

        scanLogPassUsers.close();
        fileReader.close();

        boolean check = users.contains(enterLog.concat(enterPass));
        return check;

    }

}
