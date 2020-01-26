package lesson4;

public class HomeWorkLesson4 {
    public static void main(String[] args) {
/*
        1. Вывести на экран числа от 1 до 10 используя while.
        Пример: 1 2 3 4 5 6 7 8 9 10
        Реализовать в отдельном методе.
*/
        System.out.println("Задание 1.");
        soutNuberFrom1To10ByWhile();

        System.out.println("");

/*
        2. Вывести на экран числа от 1 до 10 используя for.
        Пример: 1 2 3 4 5 6 7 8 9 10
        Реализовать в отдельном методе.
*/
        System.out.println("Задание 2.");
        soutNumbersFrom1To10ByFor();

        System.out.println("");
/*
        3. Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц. Использовать while.
        Пример: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0
        Реализовать в отдельном методе.
*/
        System.out.println("Задание 3.");
        soutNumbersDecreaseStep10ByWhile();
        System.out.println("");

/*
        4. Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц. Использовать for.
        Пример: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0
        Реализовать в отдельном методе.
*/
        System.out.println("Задание 4.");
        soutNumbersDecreaseStep10ByFor();
        System.out.println("");

/*
        5. Дано 10 чисел. Напечатайте наибольшее из них в консоль, используя циклические и условные операторы.
*/
        //Создаем массив из 10-ти чисел:
        int[] arreyNumbMaxValue = new int[]{-901, -5, -56, -12, -9001, -1, -32, -12, -34, -56};
        int maxValue = arreyNumbMaxValue[0]; //Создаем переменную для циклической проверки чисел.

        for (int i = 0; i <arreyNumbMaxValue.length ; i++) {
            if (maxValue <= arreyNumbMaxValue[i]) {
                maxValue = arreyNumbMaxValue[i];
            }
        }
        System.out.println(maxValue);

/*
        6. Дано 10 чисел. Напечатайте наименьшее из них в консоль, используя циклические и условные операторы.
*/
         //Создаем массив из 10-ти чисел:
        int[] arreyNumbersMinValue = new int[]{-901, -5, -56, -12, -9001, -1, -32, -12, -34, -56};
        int minValue = arreyNumbersMinValue[0]; //Создаем переменную для циклической проверки чисел.

        for (int i = 0; i <arreyNumbersMinValue.length ; i++) {
            if (minValue >= arreyNumbersMinValue[i]) {
                minValue = arreyNumbersMinValue[i];
            }
        }
        System.out.println(minValue);
/*
        7. Создайте переменную равную 5. Используя один из циклических оператор, напечатайте “Hillel the Best”
        пока созданная переменная меньше 0. Текст необходимо чтобы вывелся только один раз.
*/
        int varHillel = 5;
        do {
            System.out.println("Hillel the Best");
        } while (varHillel < 0);
/*
        8. Создайте массив из 10 чисел от 1 до 10. В одном из циклических операторов пройдетесь по нему и
        выведете следующие сообщения:
        о Если четное - “{число} - это четно число”
        о Если не четное - “{число} - это число не четное”
        Пример:
        1 - не четное число
        2- четное число
        3 - не четное число
        ...
*/

        int[] arreyNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i += 2) {
            System.out.println(arreyNumbers[i] + " - не четное число");
            System.out.println(arreyNumbers[i + 1] + " - четное число");
        }
    }


    private static void soutNumbersDecreaseStep10ByFor() {
        for (int i = 100; i >= 0; i -= 10) {
            System.out.print(i + ", ");
        }
    }

    private static void soutNumbersDecreaseStep10ByWhile() {
        int number = 100;
        while (number >= 0) {
            System.out.print(number + ", ");
            number -= 10;
        }
    }

    private static void soutNumbersFrom1To10ByFor() {
        for (int i = 1; i < 11; i++) {
            System.out.print(i + ", ");

        }
    }

    private static void soutNuberFrom1To10ByWhile() {
        int number = 1;
        while (number <= 10) {
            System.out.print(number + ", ");
            number++;
        }
    }
}