package lesson2;

import java.util.Arrays;

public class homeWorkLesson2 {
    public static void main(String[] args) {

        /* 1. Создать переменную = 1 и используя инкремент и декремент напечатать:

        1
        0
        1
        1
        1
        2
        1
        1
*/
        System.out.println("Задание 1.");
        int var = 1;

        System.out.println(var); // = 1
        System.out.println(--var); // = 0
        System.out.println(++var); // = 1
        System.out.println(var--); // = 1
        System.out.println(++var); // = 1
        System.out.println(++var); // = 2
        System.out.println(--var); // = 1
        System.out.println(var); // = 1

// TODO: 2. Условно создать таблицу из столбцов и строк всех 8 примитивов и выполнить преобразование один к другому.
        /** Пометить "а" - автоматическое(неявное) /
         * "пт" - приведение типов(явное) /
         * "х" - там где невозможно приведение выполнить.
         */
        /*3. Создать 3 целочисленных и 3 дробных переменных,
выполнить несколько неявных преобразований и вывести сумму всех 6 переменных преобразовав к строке(тип String);
 */

        System.out.println("Задание 3.");
//        Создаём переменные:
        byte varByte1 = 16;
        int varInt1 = 100;
        long varLong1 = 500;
        float varFloat1 = 1.1234f;
        double varDoub1 = 2.456, varDoub2 = 9.7632;
//        Выполняем неявные преобразования:
        varLong1 = varInt1 = varByte1;
        varDoub1 = varFloat1;
//        Суммируем значения всех переменных:
        double varDoubRes = varByte1 + varInt1 + varLong1 + varFloat1 + varDoub1 + varDoub2;

        String print = Double.toString(varDoubRes); //Преобразование результата в "String"
        System.out.println(print); //Вывод результата.

//TODO: 4. Создавать комментарии всех рассмотренных видов хотя бы по одному примеру;
        /*5. Создать одномерный массив любого размера. Записать в него 10 примитивов.
Значение в ячейках, индекс которых имеет нечетное значение, увеличить вдвое.
Значение в ячейках, индекс которых имеет четное значение, уменьшить на 2.
Вывести значение массива до изменения и после для сравнения результата.
         */
        System.out.println("Задание 5.");

        int[] arreyInt = new int[]//создание одномерного массива
                {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};//запись значений примитивов int

        System.out.println(Arrays.toString(arreyInt) + " - Заданный масив."); //вывод заданного массива

        arreyInt[0] -= 2; //изменение значения с присвоением = arreyInt[0] - 2
        arreyInt[1] *= 2; //изменение значения с присвоением = arreyInt[1] * 2
        arreyInt[2] -= 2;
        arreyInt[3] *= 2;
        arreyInt[4] -= 2;
        arreyInt[5] *= 2;
        arreyInt[6] -= 2;
        arreyInt[7] *= 2;
        arreyInt[8] -= 2;
        arreyInt[9] *= 2;

        System.out.println(Arrays.toString(arreyInt) + " - Изменённый масив."); //вывод изменённого массива

        /*6. Создайте многомерный массив, в котором будет 3 строки и 3 столбца. Запишите в него числа от 1 до 9.
Выполните с данным массивом определенные действия, чтобы числа хранились от 9 до 1.
Выведите результат до и после изменения многомерного массива.
         */


        System.out.println("Задание 6.");

        int[][] arrMult = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Созданный массив:");
        System.out.println(Arrays.toString(arrMult[0]));
        System.out.println(Arrays.toString(arrMult[1]));
        System.out.println(Arrays.toString(arrMult[2]));

        arrMult[0] = new int[]{9, 8, 7};
        arrMult[1] = new int[]{6, 5, 4};
        arrMult[2] = new int[]{3, 2, 1};

        System.out.println("Изменённый массив:");

        System.out.println(Arrays.toString(arrMult[0]));
        System.out.println(Arrays.toString(arrMult[1]));
        System.out.println(Arrays.toString(arrMult[2]));



    }
}
