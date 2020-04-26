package lesson7.ClassWork0402;

import java.io.IOException;

public class ClassWork0402 {
    public static void main(String[] args) throws IOException {
//        // Пример использования разных конструкторов
//        Car car = new Car();
//        Car car1 = new Car("1");
//        Car car2 = new Car("2", "sedan");
//        Car car3 = new Car(null, 12, "sese");
//        System.out.println(car3.type); //Данное поле  еще не задано
//
//        car3.type = "!!!!"; //Сдесь будет задано  значение поля вне конструктора
//        System.out.println(car3.type); //Проверяем результат
//
//        car.setNumber("123141"); // Задаем значение через метод set
//        car.color = "Black"; // Задаем значение на прямую обращаясь к переменной
//        System.out.println(car.getNumber()); //Получаем значение переменной через get
//        System.out.println(car2.toString());
//
//        PoliceCar policeCar = new PoliceCar(); // Создание класса-наследника
//        System.out.println(policeCar.id);


        FrontSimulator frontSimulator = new FrontSimulator(); //Эмулятор фронт-енд части
        User user = frontSimulator.userForRegister(); //Получаем пользователя со стороны фронт-енд
        Validator.saveUser(user); //сохраняем его значения в файл

    }
}
