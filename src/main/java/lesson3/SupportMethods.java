package lesson3;

import java.util.Random;
import java.util.Scanner;

public class SupportMethods {

//                          Опросчик для Задания №1.
    public String interrogatorString() {
        Scanner stringInfo = new Scanner(System.in);
        return stringInfo.next();

    }

    public int interrogatorInt() {
        Scanner stringInfo = new Scanner(System.in);
        return stringInfo.nextInt();

    }
    public String interrogatorLine() {
        Scanner stringInfo = new Scanner(System.in);
        return stringInfo.nextLine();
    }

//                          Метод "Лотерея"
    public int surprise() {
        Scanner numbOfMembers = new Scanner(System.in);
        int numberOfMembers = numbOfMembers.nextInt();
        Random random = new Random();
        return random.nextInt(numberOfMembers) + 1;//исключаем 0.
    }

//                         Генератор зарплаты методом Random))
    public int salaryRand() {
        Random salaryR = new Random();
        return (salaryR.nextInt(10001) + 40000);// от 40000 грн до 50000 грн включительно.
    }

//                         Генератор зарплаты методом Math.Random))

    public int salaryMathRand() {
        return (int) (Math.random() * 10001) + 40000;// от 40000 грн до 50000 грн включительно.
    }


}
