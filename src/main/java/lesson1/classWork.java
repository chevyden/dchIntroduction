package lesson1;

public class classWork {
    public static void main(String[] args) {
        String resultPrint = "Hello Hillel";
        String resultPrint2 = "Hello Hillel";
        System.out.println(resultPrint); //sout + enter

        byte b = 0, t = 4;
        short s = 1;
        short s2 = 1;
        int i = 1; // +
        long l = 1;
        float f = 1.2f;
        double d = 1.2; // +
        char c = 'c'; // +
        boolean bool = true; // +

        //TODO: need hotfix

        int first = 10;
        int second = 3;
        int resultSum = first + second;
        int res = first % second; // + - / * %

        int q = 20;
//        q += 1; // = q = q + 1;
//        q -= 1; // = q = q - 1;
//        q *= 1; // = q = q * 1;
//        q /= 1; // = q = q / 1;
//        q %= 1; // = q = q % 1;


        boolean we = "Hello" == "Hello"; // true
        boolean ew = "Hello" == new String("Hello"); // false
        System.out.print(first == second); // печать в консоль без перехода на следующую строку
        System.out.println(resultPrint == resultPrint2); // печать в консоль с переходом на следующую строку
        System.out.println(we);
    }
}
