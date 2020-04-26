package lesson14.homeWorkLesson14;

import java.nio.channels.ClosedByInterruptException;
import java.nio.file.FileAlreadyExistsException;
import java.rmi.server.ExportException;

public class FirstCheckedExceptionClass {
    //будут 3 отдельных метода, логика которых будет вызывать 3 разные “проверяемые”(checked) ошибки.

    public static void firstExceptionMethod() throws ExportException {
        throw new ExportException("EXCEPTION FIRST METHOD");
    }

    public static void secondExceptionMethod() throws FileAlreadyExistsException {
        throw new FileAlreadyExistsException("exception second method");
    }

    public static void thirdExceptionMethod() throws ClosedByInterruptException {
        throw new ClosedByInterruptException();
    }
}
