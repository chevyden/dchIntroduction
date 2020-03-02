package lesson14.homeWorkLesson14;

import java.nio.channels.ClosedByInterruptException;
import java.nio.file.FileAlreadyExistsException;
import java.rmi.server.ExportException;

public class CallExceptionMethodsClass {
    //будет также три промежуточных метода, которые просто будут вызывать по одному методу первого класса.
    //Эти методы не должны обрабатывать возможные ошибки, а просто пробрасывают полученную ошибку выше;

    public static void callFirstExceptionMethod() throws ExportException {
        FirstCheckedExceptionClass.firstExceptionMethod();
    }

    public static void callSecondExceptionMethod() throws FileAlreadyExistsException {
        FirstCheckedExceptionClass.secondExceptionMethod();
    }

    public static void callThirdExceptionMethod() throws ClosedByInterruptException {
        FirstCheckedExceptionClass.thirdExceptionMethod();
    }

}
