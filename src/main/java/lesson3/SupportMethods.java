package lesson3;

import java.util.Random;
import java.util.Scanner;

public class SupportMethods {

//                          Опросчик для Задания №1.
    public String interrogatorString() {
        Scanner stringInfo = new Scanner(System.in);
        String inStringInfo = stringInfo.next();
        return inStringInfo;

    }

    public int interrogatorInt() {
        Scanner stringInfo = new Scanner(System.in);
        int inIntInfo = stringInfo.nextInt();
        return inIntInfo;

    }
    public String interrogatorLine() {
        Scanner stringInfo = new Scanner(System.in);
        String inLineInfo = stringInfo.nextLine();
        return inLineInfo;

    }
//                   Метод "Лотерея"
    public int surprise() {
        Scanner numbOfMembers = new Scanner(System.in);
        int numberOfMembers = numbOfMembers.nextInt();
        Random random = new Random();
        int winner = random.nextInt(numberOfMembers) + 1;//исключаем 0.
        return winner;
    }

//                         Генератор зарплаты методом Random))
    public int salaryRand() {
        Random salaryR = new Random();
        int mySalaryR = (salaryR.nextInt(10001) + 40000);// от 40000 грн до 50000 грн включительно.
        return mySalaryR;
    }

//                         Генератор зарплаты методом Math.Random))

    public int salaryMathRand() {
        int salaryMathR = (int) (Math.random() * 10001) + 40000;// от 40000 грн до 50000 грн включительно.
        return salaryMathR;
    }


//                                Help Me Math Methods.

    public int calcPlus(int first, int second, int third) {
        return first + second + third;
    }

    public int calcMinus(int first, int second, int third) {
        return first - second - third;

    }
    public static double calcDiv(double firstDoub, double secondDoub, double thirdDoub) {
       return  firstDoub / secondDoub/ thirdDoub;

    }
    public static double calcMultiplic(double firstDoub, double secondDoub, double thirdDoub) {
        return firstDoub * secondDoub * thirdDoub;

    }
}
