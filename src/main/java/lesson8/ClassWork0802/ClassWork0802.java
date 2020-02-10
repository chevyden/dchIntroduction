package lesson8.ClassWork0802;


import test.HumanValidate;

public class ClassWork0802 {
    public static void main(String[] args) {

        //Создание объекта с помощью конструктора
        Human human = new Human("Alex", "Bob", 12, 45);
        //Использование Getter
        System.out.println(human.getName());
//        human.setName("John"); // Setter не создан, не можем изменить имя!
        //Использование Setter
        System.out.println(human.getName());

        //Пример создание с конструктором по-умолчанию и заданием нескольких полей
        House house = new House();
        System.out.println(house.toString());
        house.setCustom(true);
        house.setCost(10000);
        System.out.println(house.toString());

        int third = 1000;
        int[] test = test(third);

        //Пример вызова публичного метода с вложенными private методами
        HumanValidate humanValidate = new HumanValidate();
        humanValidate.validateNameAndSurname(" ", " ");

        //Пример использования модификатора final с переменными(Константами)
        int salaryWithTax = Constants.HOUR_SALARY * 40 * 4;
        System.out.println("Salary with tax: " + salaryWithTax);
    }


    /**
     * @param third Входящий параметр
     * @return возвращает массив с двум я параметрами!
     */
    public static int[] test(int third) {
        int[] array = new int[2];
        int first = 10;
        String second = "Second;";
        array[0] = third;
        array[1] = first;

        return array;

    }
}