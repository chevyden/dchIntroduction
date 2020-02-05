package lesson6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LoginBeta {
    public static void main(String[] args) throws IOException {


/*
        5. Написать программу “login”. Условия:
        о При запуске программ должна просить ввести данные для входа: логин и пароль;
        о Сверку данных проводить из того же файла users.txt. Если пользователь с введенными логином и паролем есть,
        то выводить сообщение-приветствие. Если нет - то просить ввести повторно.
        о Если 3 попытки ввода логина и пароля были неуспешны, то выводить сообщение о просьбе повторить позже и
        останавливать программу.
*/


        boolean checkUsers = checkUserLogPass(readConsoleLogin(), readConsolePass()); // true or false
        for (int i = 0; i < 3; i++) {
            if (checkUsers) {
                break;
            } else {
                System.out.println("Введите логин и пароль ещё раз.\nУ Вас осталось: " + (3 - i) + " шанc(а)");
                checkUsers = checkUserLogPass(readConsoleLogin(), readConsolePass());
            }
            if (i == 2) {
                System.out.println("Что-то пошло не так. Повторите попытку позже.");
            }
        }
    }


    private static boolean checkUserLogPass(String loginCons, String passCons) throws IOException {
        String fileLogPassPath = "/home/dbhc/IdeaProjects/introduction/src/main/resources/lesson6/homeWorkLesson6/users.txt";
        FileReader fileReader = new FileReader(fileLogPassPath);
        Scanner scanLogPassUsers = new Scanner(fileReader);
        String userLoginConsole = loginCons;
        String userPassConsole = passCons;

        while (scanLogPassUsers.hasNextLine()) {
            String usersLogin = scanLogPassUsers.nextLine();
            String usersPass = scanLogPassUsers.nextLine();
//            boolean checkLoginPassword = userLoginConsole.equals(usersLogin) && userPassConsole.equals(usersPass);
            while (userLoginConsole.equals(usersLogin) && userPassConsole.equals(usersPass)) {
                boolean i = true;
                System.out.println("Добро пожаловать в систему, " + usersLogin + "!");
                scanLogPassUsers.close();
                fileReader.close();
                return i;
            }
        }
        scanLogPassUsers.close();
        fileReader.close();
        return false;
    }

    private static String readConsoleLogin() {
        Scanner scanLogPass = new Scanner(System.in);
        System.out.println("Введите логин:");
        String enterLog = scanLogPass.next();
        return enterLog;
    }

    private static String readConsolePass() {
        Scanner scanPass = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String enterPass = scanPass.next();
        return enterPass;
    }
}
