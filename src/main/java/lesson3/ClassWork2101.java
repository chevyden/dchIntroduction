package lesson3;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class ClassWork2101 {
    public static void main(String[] args) {

//        System.out.println("Standard method");
//        "".equals("");

//        User user = new User();
//        user.move(); // Внутри данного метода вызывается private метод
//
//        String res = user.print(); // Метод с возвращающим параметром String
//        System.out.println(res);

//        // Перегрузка метода
//        Calculate calculate = new Calculate();
//        int sum = calculate.sum(5, 10);
//        System.out.println(sum);
//        int sum1 = calculate.sum(5, 10,12);
//        System.out.println(sum1);


//        innerMethod(); // Внутренний метод
//        System.out.println(Calculate.minus(10, 5)); // Правильное обращение к статическому методу из вне
//        Calculate calculate = new Calculate();
//        System.out.println(calculate.minus(10, 6)); // Возможен вызов статического метода

//        // Пример использования не статическиого
//        User alex = new User();
//        alex.age = 18;
//        alex.name = "Alex";
//        alex.surname = "Unknown";
//
//        alex.introduce();

            //Scanner
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter some text:");
////        String next = scanner.next(); // Считать строку до пробела
//        String next = scanner.nextLine(); // Считать строку полностью
//        System.out.println("Entered text is: " + next);
//
//        System.out.println("How old are you?");
//        int age = scanner.nextInt();
//        System.out.println("You are " + age);

//        System.out.println("Enter your weight:");
//        double weight = scanner.nextDouble();
//        System.out.println("Your weight is: " + weight);

//        //Math
//        System.out.println(Math.sqrt(9));
//        System.out.println(Math.abs(-15));
//        System.out.println(Math.min(5, 7));
//        System.out.println(Math.max(15, 7));
//        System.out.println(Math.random());
//
//        int rand = (int) (Math.random() * 100);
//        System.out.println(rand);

            //Random
//        Random random = new Random();
//        System.out.println(random.nextInt());
//        System.out.println(random.nextDouble());
//        System.out.println(random.nextBoolean());
//        System.out.println(random.nextInt() + random.nextDouble());

            //Для ограничиения диапазона случайных чисел, можно задать лимит:
            Random random = new Random();
            System.out.println(random.nextInt(3)); // Будет выводить от 0 до 2. Отрицательных чисел не будет
            System.out.println(random.nextInt(3) + 1); // Будет выводить от 1 до 3. Отрицательных чисел не будет


//            //equals and ==
//            User user1 = new User();
//            user1.name = "Bob";
//            user1.surname = "Bobob";
//            user1.age = 18;
//
//            User user2 = new User();
//            user2.name = "Bob";
//            user2.surname = "Bobob";
//            user2.age = 18;
//
//            System.out.println(user1 == user2);
//            System.out.println(user1.equals(user2)); // user1 == user2 (стандартная реализация)


        }


        private static void innerMethod() {
            System.out.println("Inner method example");
    }



}
