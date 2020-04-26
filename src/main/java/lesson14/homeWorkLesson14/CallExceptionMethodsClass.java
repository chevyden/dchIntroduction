package lesson14.homeWorkLesson14;

import java.nio.channels.ClosedByInterruptException;
import java.nio.file.FileAlreadyExistsException;
import java.rmi.server.ExportException;

public class CallExceptionMethodsClass {

    //Примечание: данный класс можно было-бы наследовать от первого, и переопределить методы(с условием не static)

//    @Override
//    public void firstExceptionMethod() throws ExportException {
//        super.firstExceptionMethod();
//    }


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
