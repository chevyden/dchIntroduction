package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkLesson3 {

    public static void main(String[] args) {

/*1.
Используя класс Scanner, написать программу, которая будет запрашивать пользователя
ввести данные о себе для регистрации и после введенных данных будет выводить всю информацию в консоль:
 o Введите Ваше имя:
 о Введите Вашу фамилию:
 о Укажите сколько Вам полных лет:
 о Введите Вашу почту для регистрации:
 о Напишите несколько слов о себе:
ps: Можно оформить как в классе Main, так и в отдельном методе или классе. При этом надо показать как вы будете
вызывать данных класс или метод.
*/
        System.out.println("Задание 1.");

        String askName = "o Введите Ваше имя:";
        String askSurname = "о Введите Вашу фамилию:";
        String askAge = "о Укажите сколько Вам полных лет:";
        String askMail = "о Введите Вашу почту для регистрации:";
        String askAbout = "о Напишите несколько слов о себе:";

        System.out.println(askName);
        Scanner ask = new Scanner(System.in);
        String myName = ask.next();

        System.out.println(askSurname);
        String mySurname = ask.next();

        System.out.println(askAge);
        int myAge = ask.nextInt();

        System.out.println(askMail);
        String myMail = ask.next();

        System.out.println(askAbout);
        String aboutMysel = ask.nextLine();

        System.out.println("Вы ввели следуюую информацию о себе:");
        System.out.println(askName + " " + myName);
        System.out.println(askSurname + " " + mySurname);
        System.out.println(askAge + " " + myAge);
        System.out.println(askMail + " " + myMail);
        System.out.println(askAbout + " " + aboutMysel);

////        Реализация в отделном классе"SupportMethods".
//        SupportMethods askMe = new SupportMethods();
//
//        System.out.println(askName);
//        String myNameIs = askMe.interrogatorString();
//
//        System.out.println(askSurname);
//        String mySurameIs = askMe.interrogatorString();
//
//        System.out.println(askAge);
//        int myAgeIs = askMe.interrogatorInt();
//
//        System.out.println(askMail);
//        String myMailIs = askMe.interrogatorString();
//
//        System.out.println(askAbout);
//        String aboutMyself = askMe.interrogatorLine();
//
//        System.out.println("Вы ввели следуюую информацию о себе:");
//        System.out.println(askName + " " + myNameIs);
//        System.out.println(askSurname + " " + mySurameIs);
//        System.out.println(askAge + " " + myAgeIs);
//        System.out.println(askMail + " " + myMailIs);
//        System.out.println(askAbout + " " + aboutMyself);

/*
2. Создайте 3 переменные типа int и 3 переменные типа double используя класс Random,
выполните их сложение и выведите результат.
*/
        System.out.println("Задание 2.");
        Random randVar = new Random();
        int varIntFirst = randVar.nextInt();
        int varIntSecond = randVar.nextInt();
        double varDoubleFirst = randVar.nextDouble();
        double varDoubleSecond = randVar.nextDouble();
        double result= varIntFirst + varIntSecond + varDoubleFirst + varDoubleSecond;
        System.out.println("Результат:" + result);

/*
3. Создать метод, для розыгрыша приза в лотерее среди участников. Внутри метода сделать возможным каждый
раз при вызове вводить количество участников(При запуске программы должно спрашивать количество участников
(использовать Scanner), вы задаете количество участников и среди них производится розыгрыш). Используя класс
Random определить победителя и вывести поздравление в консоль.У данного метода не будет принимаемых параметров
и может быть, может не быть возвращаемый параметр с результатом победителя(зависит от того как вы реализуете).
*/
        System.out.println("Задание 3.");
        System.out.println("ЛОТЕРЕЯ НАЧИНАЕТСЯ, ВВЕДИТЕ КОЛИЧЕСТВО УЧАСТНИКОВ:");
        SupportMethods lottoSurprise = new SupportMethods();
        System.out.println("Поздравляю! Выиграл участник под номером " + lottoSurprise.surprise()+".");

 /*
 4. Используя класс Math напишите 7-8 примеров вызовов вспомогательных методов данного класса:
 о sqrt();
 o abs();
 o min();
 o max();
 o random();
 o ….(остальные на Ваш выбор);
 */
        System.out.println("Задание 4.");

        double resSqrt = Math.sqrt(4);
        int resAbs = Math.abs(-150);
        double resMin = Math.min(-2.5, 3.45);
        float resMax = Math.max(98212321.0292f, 734287239.329f);
        double resRandom = Math.random();
        double resSin = Math.sin(60.0);
        int resLog10Int = (int) Math.log10(10.3478);
        double resLog10Double = Math.log10(10.3478);

        System.out.println("Результат вычислений вспомогательных методов :");
        System.out.println(resSqrt + " / " + resAbs + " / " + resMin + " / " + resMax + " / " + resRandom + " / " + resSin +
                " / " + resLog10Int + " / " + resLog10Double);

/*
5. Создать 2 схожих метода, которые будут случайным образом генерировать Вашу зарплату. Обратите внимание,
что именно метода, а не просто вызовы указанных функций. В одном методе используйте класс Random, в другом Math.random.
Для себя поймите разницу в использовании. Если не хотите получать маленькую зарплату, то можете выполнить дополнительные
действия с Math.random)
*/
        System.out.println("Задание 5.");

        SupportMethods sal = new SupportMethods();

        System.out.println(sal.salaryRand() + " грн." + " - Зарплата методом Random");
        System.out.println(sal.salaryMathRand() + " грн." + " - Зарплата методом Math.Random");

/*
6. Создайте класс “Employee”, у которого будет три переменные: double:“salary”, String:“position”, int:”age”.
Выполните определенные действия, чтобы сравнение сотрудников производилось не по ссылке, а по значению полей.
В классе Main создайте 2 одинаковых сотрудника и выполните сравнения используя “==” и “equals()”.
*/
        System.out.println("Задание 6.");
        Employee FirstUser = new Employee();
        FirstUser.salary = 25000.00;
        FirstUser.position = "Chief";
        FirstUser.age = 36;

        Employee SecondUser = new Employee();
        SecondUser.salary = 25000.00;
        SecondUser.position = "Chief";
        SecondUser.age = 36;

        System.out.println(FirstUser == SecondUser);//не одинаковы

        System.out.println(FirstUser.equals(SecondUser));//одинаковы при сравнении значений полей.

/*
7. Создайте свой математический класс(наподобие Math) для помощи в дальнейших вычислениях.
Внутри нового класса создать 4 новых метода, 2 статических (static) и 2 обычных.
Этих 4 метода должны выполнять 4 математических операции (сложение(+), вычитание(-), деление(/), умножение(*)).
Все методы должны возвращать результат выполненной операции обратно.
Необходимо чтобы 2 метода принимали и возвращали целочисленные значения, а 2 - дробные значения.
В классе Main реализуйте вызовы созданных Вами новых методов. Запомните отличие вызовов статических и не статических методов.
*/
        System.out.println("Задание 7.");

        SuppMathMeth calc = new SuppMathMeth();
        int first = 10;
        double firstDoub = 3.0;

        System.out.println("Результат вычитания: " + calc.calcMinus(first, 20, 30));

        System.out.println("Результат сложения: " + calc.calcPlus(first, 20, 30));

        System.out.println("Результат деления: " + SuppMathMeth.calcDiv(firstDoub, 4.5, 5.5));//Static

        System.out.println("Результат умножения: " + SuppMathMeth.calcMultiplic(firstDoub, 4.5, 5.5));//Static


    }


}



