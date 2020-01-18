package lesson1;

public class homeWorkLesson1 {
    public static void main(String[] args) {

        /*Создайте все известные примитивы по 1 экземпляру(кроме int и double) и строку двумя разными способами.
         Создайте 3 переменные int в одну строку и 3 переменные double в одну строку.
       */
        byte varByte = 2;
        short varShort = -32768;
        long varLong = 32770;
        float varFloat = 2.376f;
        char varChar = 'q';
        boolean varBoolean = false;
        String varStr1 = "hello coach";
        String varStr2 = new String("hello my coach");
        int varInt1 = 10, varInt2 = 20, varInt3 = 30;
        double varDaub1 = 1.1, varDoub2 = 2.2, varDoub3 = 3.3;

         /*созданными переменными напишите 10 примеров с двумя любыми арифметическими операциями в
        каждом (5 дробных результата и 5 целочисленных) и выведите результаты.
         */

        double resDoub1 = varFloat + varDaub1*3;
        double resDoub2 = varDoub2 * varDoub3 - varDoub2;
        float resFlo1 = (varFloat + 35) * varFloat;
        float resFlo2 = varFloat * 2 - 3;
        double resDoub3 = varDoub3 * 10 + varFloat;
        System.out.println("Дробные результаты: " + resDoub1 + " / " + resDoub2 + " / " + resFlo1 + " / " +
                resFlo2 + " / " + resDoub3);
        int resInt1 = varInt1 - varInt3 + varInt2;
        int resInt2 = varInt3 / varInt1 -varInt1;
        int resInt3 = 1000 - varInt2 / varInt3;
        long resLong1 = varLong / varInt1 + varLong;
        long resLong2 = varLong - varInt3 / 2;
        System.out.println("Целочисленные результаты: " + resInt1+ " / " + resInt2 + " / " + resInt3 + " / " +
                resLong1 + " / " + resLong2);


        /*
        Напишите 10 примеров с арифметическими операциями с присвоением и выведите результат.
         */
        varDaub1+=varDoub2;
        varDoub2 *= varDoub3;
        varDoub3 -=varFloat;
        int resIntAppr1, resIntAppr2, resIntAppr3;
        resIntAppr1 = resIntAppr2  = varInt1;
        resIntAppr3 = 365;
        resIntAppr1 /=resIntAppr2;
        resIntAppr2 %=resIntAppr2;
        resIntAppr3 +=varInt3;
        double resDoubAppr1 = varDaub1;
        resDoubAppr1 +=resDoub1;
        long resLongAppr1 = varLong;
        resLongAppr1 -=resIntAppr1;
        short resShortAppr1 = varShort;
        resShortAppr1 -= resIntAppr3;
        byte resByteAppr1 = varByte;
        resByteAppr1 *=resByteAppr1;
        System.out.println(varDaub1 + " / " +  varDoub2 + " / " +  varDoub3 + " / " +  resIntAppr1 + " / " +  resIntAppr2 + " / " +
                resIntAppr3 + " / " +  resDoubAppr1 + " / " + resLongAppr1 + " / " + resShortAppr1 + " / " +  resByteAppr1);

        /*
        Напишите не менее 5 разных примеров используя логические операции с выводом результатов
        (несколько значений "true" & несколько значений "false").
         */
        boolean resBool1, resBool2, resBool3, resBool4, resBool5;
        //пустые строки
        resBool1 = varDoub2 > 0 & varDoub2 < 100;
        resBool2 = varInt2 == varInt3;
        resBool3 = resIntAppr2 < 0;
        resBool4 = varLong > varByte;
        resBool5 = varShort != varFloat;
        System.out.println(resBool1 + " / " + resBool2 + " / " + resBool3 + " / " + resBool4 + " / " + resBool5);
    }
}
