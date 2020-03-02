package lesson14.homeWorkLesson14;

import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.file.FileAlreadyExistsException;
import java.rmi.server.ExportException;
import java.util.Scanner;

public class HomeWorkLesson14 {

    /*1. Создайте класс, в которому будут 3 отдельных метода, логика которых будет вызывать 3 разные
   “проверяемые”(checked) ошибки. Ошибки можете вызвать принудительно в ходе какой-то логики(не принципиально);
2. Создайте еще один класс, у которого будет также три промежуточных метода, которые просто будут вызывать по одному
   методу первого класса. Эти методы не должны обрабатывать возможные ошибки, а просто пробрасывают полученную ошибку выше;
3. Используя методы второго класса(промежуточного), в классе Main реализуйте методы использования следующих
   конструкций обработки ошибок:
    а). try-catch-finally;
    б). try-catch-catch-finally;
    в). try-catch-catch-catch-finally;
    г). try(with resources)-catch-finally;
    д). try-finally;
    (в каждой конструкции try должны быть вызовы 3х методов промежуточного класса с разными ошибками).
    */
    public static void main(String[] args)  {

        tryCatchFinallyMethod();
        tryCatchCatchFinallyMethod();
        tryCatchCatchCatchFinallyMethod();
        tryWithResourcesCatchFinallyMethod();
        tryFinallyMethod();


    }

    private static void tryCatchFinallyMethod() {
        try {
            CallExceptionMethodsClass.callThirdExceptionMethod();
            CallExceptionMethodsClass.callFirstExceptionMethod();
            CallExceptionMethodsClass.callSecondExceptionMethod();
        } catch (ExportException | FileAlreadyExistsException | ClosedByInterruptException e) {
            System.out.println("a).Возможная(-ые) ошибка(-и) из всех трёх методов: " + e);

        } finally {
            System.out.println("a). Вывод этой строки в любом случае.");
        }
    }

    private static void tryCatchCatchFinallyMethod() {
        try {
            CallExceptionMethodsClass.callSecondExceptionMethod();
            CallExceptionMethodsClass.callFirstExceptionMethod();
            CallExceptionMethodsClass.callThirdExceptionMethod();
        } catch (FileAlreadyExistsException e) {
            System.out.println("б).Возможная ошибка из SecondExceptionMethod метода: " + e);
        } catch (ExportException | ClosedByInterruptException e) {
            System.out.println("б).Возможная(-ые) ошибка(-и) из FirstExceptionMethod и/или ThirdExceptionMethod методов: " + e);
        } finally {
            System.out.println("б). Вывод этой строки в любом случае.");
        }
    }

    private static void tryCatchCatchCatchFinallyMethod() {
        try {
            CallExceptionMethodsClass.callFirstExceptionMethod();
            CallExceptionMethodsClass.callSecondExceptionMethod();
            CallExceptionMethodsClass.callThirdExceptionMethod();
        } catch (ExportException e) {
            System.out.println("в).Возможная ошибка из FirstExceptionMethod метода: " + e);
        } catch (FileAlreadyExistsException e) {
            System.out.println("в).Возможная ошибка из SecondExceptionMethod метода: " + e);
        } catch (ClosedByInterruptException e) {
            System.out.println("в).Возможная ошибка из ThirdExceptionMethod метода: " + e);
        } finally {
            System.out.println("в). Вывод этой строки в любом случае.");
        }

    }

    private static void tryWithResourcesCatchFinallyMethod() {

        String path = "/home/dbhc/IdeaProjects/introduction/src/main/resources/lesson13/homeWorkLesson13/UsersInfo.txt";
        try (FileReader fileReader = new FileReader(path);
             Scanner scanner = new Scanner(fileReader)) {
            if (scanner.hasNextLine()) {
                try {
                    CallExceptionMethodsClass.callFirstExceptionMethod();
                    CallExceptionMethodsClass.callSecondExceptionMethod();
                    CallExceptionMethodsClass.callThirdExceptionMethod();
                } catch (ExportException | FileAlreadyExistsException | ClosedByInterruptException e) {
                    System.out.println("г).Возможная(-ые) ошибка(-и) из всех трёх методов: " + e);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("г). Вывод этой строки в любом случае.");
        }
    }

    private static void tryFinallyMethod() {

        try {
            throw new RuntimeException();
        } finally {
            try {
                CallExceptionMethodsClass.callThirdExceptionMethod();
                CallExceptionMethodsClass.callFirstExceptionMethod();
                CallExceptionMethodsClass.callSecondExceptionMethod();
            } catch (ExportException | FileAlreadyExistsException | ClosedByInterruptException e) {
                System.out.println("д).Возможная(-ые) ошибка(-и) из всех трёх методов: " + e);

            }
        }


    }

}
