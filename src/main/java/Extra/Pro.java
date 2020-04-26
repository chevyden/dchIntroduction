package Extra;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Pro {
    public static void main(String[] args) throws IOException {

        /*
        5. Написать программу “login”. Условия:
        о При запуске программ должна просить ввести данные для входа: логин и пароль;
        о Сверку данных проводить из того же файла users.txt. Если пользователь с введенными логином и паролем есть,
        то выводить сообщение-приветствие. Если нет - то просить ввести повторно.
        о Если 3 попытки ввода логина и пароля были неуспешны, то выводить сообщение о просьбе повторить позже и
        останавливать программу.
*/

//        String login = readConsoleLogin();
//        String password = readConsoleLogin();

        readUsersTrue(readConsoleLogin(),readConsolePass());


    }


    private static void readUsersTrue(String logConsole, String passConsole) throws IOException {
        String fileLogPassPath = "/home/dbhc/IdeaProjects/introduction/src/main/resources/lesson6/homeWorkLesson6/users.txt";
        FileReader fileReader = new FileReader(fileLogPassPath);
        Scanner scanLogPassUsers = new Scanner(fileReader);
        String userLogin1 = logConsole;
        String userPass1 = passConsole;

        while (scanLogPassUsers.hasNextLine()) {
            String userLogin = scanLogPassUsers.nextLine();
            String userPass = scanLogPassUsers.nextLine();
            if (userLogin1.equals(userLogin) && userPass1.equals(userPass)) {

                System.out.println("Приветствую " + userLogin1 + " !");
                break;
            }
            else {           //  1
                System.out.println("Попробуйте еще раз!");
                userLogin1 = readConsoleLogin();
                userPass1 = readConsolePass();
                while (scanLogPassUsers.hasNextLine()) {
                     userLogin = scanLogPassUsers.nextLine();
                     userPass = scanLogPassUsers.nextLine();
                    if (userLogin1.equals(userLogin) && userPass1.equals(userPass)) {
                        System.out.println("Приветствую " + userLogin1 + " !");
                        return;
                    }else{           //  2
                    System.out.println("Попробуйте еще раз!");
                        userLogin1 = readConsoleLogin();
                        userPass1 = readConsolePass();
                        while (scanLogPassUsers.hasNextLine()) {
                            userLogin = scanLogPassUsers.nextLine();
                            userPass = scanLogPassUsers.nextLine();
                            if (userLogin1.equals(userLogin) && userPass1.equals(userPass)) {
                                System.out.println("Приветствую " + userLogin1 + " !");
                                scanLogPassUsers.close();
                                fileReader.close();
                                return;
                            } else {           //  3
                                System.out.println("Попробуйте еще раз!");
                                userLogin1 = readConsoleLogin();
                                userPass1 = readConsolePass();
                                while (scanLogPassUsers.hasNextLine()) {
                                    userLogin = scanLogPassUsers.nextLine();
                                    userPass = scanLogPassUsers.nextLine();
                                    if (userLogin1.equals(userLogin) && userPass1.equals(userPass)) {
                                        System.out.println("Приветствую " + userLogin1 + " !");
                                        scanLogPassUsers.close();
                                        fileReader.close();
                                        return;
                                    }
//            System.out.println("TRy more 1");
//            check(readConsoleLogin(), readConsolePass());
//            System.out.println("TRY more 2");
//            check(readConsoleLogin(), readConsolePass());
//            System.out.println("TRY More 3");
//            check(readConsoleLogin(), readConsolePass());

            System.out.println("Попробуйте позже!!!");
            scanLogPassUsers.close();
            fileReader.close();
            break;

                                }
                            }
                        }


                }


                }

            }

        }
//        scanLogPassUsers.close();
//        fileReader.close();
    }



    private static void check(String logConsole, String passConsole) throws IOException {
        String fileLogPassPath = "/home/dbhc/IdeaProjects/introduction/src/main/resources/lesson6/homeWorkLesson6/users.txt";
        FileReader fileReader = new FileReader(fileLogPassPath);
        Scanner scanLogPassUsers = new Scanner(fileReader);

//        String userLogin1 = logConsole;
//        String userPass1 = passConsole;
        while (scanLogPassUsers.hasNextLine()) {
            String userLogin = scanLogPassUsers.nextLine();
            String userPass = scanLogPassUsers.nextLine();
            if (logConsole.equals(userLogin) && passConsole.equals(userPass)) {
                System.out.println("Приветствую " + logConsole + " !");
                scanLogPassUsers.close();
                fileReader.close();
                return;
            }
        }
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
