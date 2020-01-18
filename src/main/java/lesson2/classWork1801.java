package lesson2;

import java.util.Arrays;

public class classWork1801 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 20;

//        var1++; // постинкремент
//        System.out.println(var1);
//
//        ++var1; // преинкремент
//        System.out.println(var1);

//        System.out.println(var1);
//        System.out.println(var2 + var1++); // сначала сложение и печать, потом инкремент
//        System.out.println(var1);


//        System.out.println(var1);
//        System.out.println(var2 + ++var1); // сначала инкремент, потом сложение и печать
//        System.out.println(var1);

//        System.out.println(var1);
//        System.out.println(var2 + var1--); // сначала сложение и печать, потом декремент
//        System.out.println(var1);

//        System.out.println(var1);
//        System.out.println(var2 + --var1); // сначала декремент, потом сложение и печать
//        System.out.println(var1);

//        // Фвтоматическое / Неявное преобразование
//        byte b = 5;
//        short s = 10;
//        int i = b;
//        double d = b;
//        float f = i;
//
//        int res = b + s;
//        double resD = res + d;
//
//        System.out.println(i);
//        System.out.println(d);
//        System.out.println(f);
//        System.out.println(res);
//        System.out.println(resD);

//        // Явное преобразование
//        int i = 15;
//        long l = 128;
//        byte b = (byte) i;
//
//        byte resMinus = (byte) (i - l);

//        // Преобразование вне допустимого лимита значения
//        int i = 35000;
//        short s = (short) i;
//        System.out.println(s);

//        String s = "Lesson";
//        String print = s + 2;
//        System.out.println(print);

//        // Преобразование строки в int и сложение
//        String s = "2";
//        int i = 2;
//        int res = i + Integer.parseInt(s);
//        System.out.println(res);
//
//        // Конкатинация строки и строки
//        String str = i + s;
//        System.out.println(str);

//        // Обрезается значение после запятой
//        double d = 12.6;
//        int i = (int) d;
//        System.out.println(i);

//        Массивы

//        // ctrl + shift + enter = автодополнение и форматирование
//        // ctrl + alt + v = создать переменную
//        int res = 5 + 1 - 10 * 12;
//        int[] array = new int[10];
//        int[] arr = new int[5];
//        int[] ints = new int[12];


//        int[] ints = new int[];
//        ints[0] = 5; // Тут будет ошибка, так как массив без ячеек
//        System.out.println(ints[0]);

//        int[] ints = new int[10];
//        double[] doubles = new double[10];
//
//        int[] res = new int[]{5, 10, 15, 20};
//        String[] strings = new String[]{"5", "10", "15", "20"};
//
//        float[] floats = {100, 200};

//        // Выводим размер массива заданного при инициализации
//        System.out.println(ints.length);
//        System.out.println(res.length);
//        System.out.println(floats.length);

//        // Для обращения к первой ячейке надо обратиться к 0 индексу
//        System.out.println(strings[0]);

//        // Пример присвоения значения определенной ячейке
//        ints[0] = 15;
//        System.out.println(strings[0]);
//        strings[0] = "Changed";
//        System.out.println(strings[0]);
//
//        // Для клонирования
//        String[] clone = strings.clone();
//
//        // Напечатает ссылку на массив
//        System.out.println(strings.toString());
//
//        // Arrays.toString(strings).sout + Enter
//        System.out.println(Arrays.toString(strings));


        // Многомерные массивы

        // Создание многомерного массива.
        int[][] ints = new int[5][10];
        int[][] array = new int[][]{{15,20},{45,115}, {1000, 2000}};
        int[][] arr = {{15,20},{45,115}, {1000, 2000}};

        //Печатаем конкретный вложенный массив
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(array[2]));

        // Сначала идет индекс строки, потом столбца
        System.out.println(array[0][0]);
        System.out.println(array[0][1]);
        System.out.println(array[2][0]);

        // Размер вложенных массивов
        System.out.println(array.length);

        // Размер конкретного вложенного массива
        System.out.println(array[0].length);

        System.out.println(array[2][0]);
        array[2][0] = 555;
        System.out.println(array[2][0]);

    }
}
