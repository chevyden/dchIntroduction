package lesson4;

import java.util.Random;

public class Conditional {
    /**
     * @param value Принимаемый параметр
     *              Функция содержащая условную конструкцию if else-if else
     */
    public void ifElseExample1(int value) {
        if (value > 5) {
            System.out.println("We are in the 'if' case");
        } else if (value < 5) {
            System.out.println("We are in the 'else-if' case");
        } else {
            System.out.println("We are in the 'else' case");
        }
    }

    /**
     * @param value Принимаемый параметр
     *              Возможно использование условного оператора без {}, если в них одна строка реализации,
     *              Но не желательно!
     */
    public void ifElseExample1Clone(int value) {
        if (value > 5) System.out.println("We are in the 'if' case");
        else if (value < 5) System.out.println("We are in the 'else-if' case");
        else System.out.println("We are in the 'else' case");
    }

    /**
     * @return Возвращает либо массив, если его размер больше 0, либо null(ничего)
     * В данном методе создается массив размером от 0 до 1, от чего зависит возвращаемые данные
     */
    public int[] ifElseExample2() {
        Random random = new Random();
        int randomLength = random.nextInt(2);
        int[] array = new int[randomLength];
        System.out.println("Array length: " + array.length);

        if (array.length > 0) {
            System.out.println("We can work with this array");
            return array;
        } else {
            System.out.println("We can't work");
        }
        return null;
    }

    /**
     * @param range Принимаемый параметр для указания максимального рандомного значения класса Random
     * Данный метод похож на методы ifElseExample2, только в нем массив создается размером от 0 до значения 'range'
     * Для вывода информации используется тернарный оператор
     */
    public void ifElseTernExample1(int range) {
        Random random = new Random();
        int randomLength = random.nextInt(range);
        int[] array = new int[randomLength];
        System.out.println("Array length: " + array.length);
        System.out.println(array.length > 0 ? "We can work with this array" : "We can't work");
    }

}
