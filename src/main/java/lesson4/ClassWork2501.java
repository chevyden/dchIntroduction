package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClassWork2501 {
    public static void main(String[] args) {

        //Примеры циклических операций

//        whileExample1();

//        int[] array = new int[]{1, 2, 3, 4, 5};
//        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70};
//
//        //Вынесен массив вне метода для возможности переиспользования
//        whileExample2(array);
//        whileExample2(arr);

//        doWhileExample1();
//        doWhileExample2();

//        forExample1();
//        forExample2();


        //Примеры условных операций:

        //Пример вызова функции с условным оператором
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter some value:");
//        int val = scanner.nextInt();
        Conditional conditional = new Conditional();
//        conditional.ifElseExample1(val);
//
//        System.out.println("Enter second number:");
//        int value = scanner.nextInt();
//        conditional.ifElseExample1(value);
//
//        int[] arr = conditional.ifElseExample2();
//        System.out.println("Length returned array is: " + arr.length);

        conditional.ifElseTernExample1(2);

    }

    /**
     * Первый пример использования while
     */
    private static void whileExample1() {
        int first = 10;
        int second = 5;

        while (first >= second) {
            System.out.println(first + second);
            first--;
        }
    }

    /**
     * @param array Для возможности переиспользовать метод с другим массивом.
     *              Пример while
     */
    private static void whileExample2(int[] array) {
        int increment = 0;
        int result;
        while (increment < array.length) {
            result = array[increment];
            System.out.println("Element " + increment + ": " + result);
            increment++;
        }
    }

    /**
     * Пример do-while. Сначало делает, потом проверяет
     */
    private static void doWhileExample1() {
        int first = 100;
        int second = 90;
        do {
            System.out.println(first + second);
            first--;
        } while (first <= second);
    }

    /**
     * Пример do-while. Сначала вводим значение, потом проверям
     */
    private static void doWhileExample2() {
        Scanner scanner = new Scanner(System.in);
        String next;
        do {
            System.out.println("Enter 'x' for Exit");
            next = scanner.next();
        } while (!next.equals("x"));

        //Реализаци do-while выше можем заменить на:
//        String incorrect = "";
//        while (!incorrect.equals("x")) {
//            System.out.println("Enter 'x' for Exit");
//            incorrect = scanner.next();
//        }
    }

    /**
     * for цикл, пример применения
     */
    private static void forExample1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Increment = " + i);
        }
    }

    /**
     * for цикл, пример использования.
     * Считываем заданный размер массива, создаем массив,
     * И в цикле заполняем созданный массив значениями, равными индексу внутри цикла
     */
    private static void forExample2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length:");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Array length equals: " + array.length);
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        System.out.println(Arrays.toString(array));
    }

}
