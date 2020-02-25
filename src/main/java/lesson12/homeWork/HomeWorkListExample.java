package lesson12.homeWork;

import java.util.LinkedList;

public class HomeWorkListExample {
    public static void main(String[] args) {
        /*Выполните все пункты как одно решение задачи:
1. Создайте 3 класса, в каждом из которых будет по одному методу с разным названием(Остальное не имеет значения);
2. Создайте Список(List);
3. Создайте метод, который будет принимать и возвращать Список, и проводить с ним следующие итерации:
а). Если список пустой, добавьте в него 6 объектов 1го Вашего класса;
б). После добавьте в начало списка 3 объекта 2го Вашего класса;
в). После замените последние 3 элемента списка на 3 объекта 3го Вашего класса;
4. Создайте второй метод, который на вход будет принимать Список и возвращать список и будет выполнять следующую логику:
Проверять количество экземпляров класса в принятом Списке и оставлять только по 2 экземпляра каждого из 3 Ваших классов
(то есть, 6 объектов в сумме).
5. Создать третий метод, который также будет принимать Список и будет в зависимости от экземпляра класса вызывать Ваши
методы.
После вызова всех методов всех классов очистите Список.
6. Повторите описанную логику Выше с набором(Set). В данном задании Вам понадобиться воспользоваться Итератором(Iterator).
        */

        LinkedList firstLinkedList = new LinkedList();
        addOrChangeObjects(firstLinkedList);
        System.out.println(firstLinkedList.toString());

        checkObjects(firstLinkedList);
        System.out.println(firstLinkedList.toString());

        callMethodForObjectAndClean(firstLinkedList);
        System.out.println("List: " + firstLinkedList.toString());

    }

    public static LinkedList addOrChangeObjects(LinkedList list) {
        if (list.isEmpty()) {
            for (int i = 0; i < 6; i++) {
                FirstClass firstClassObject = new FirstClass();
                list.add(i, firstClassObject);
            }
            for (int i = 0; i < 3; i++) {
                SecondClass secondClass = new SecondClass();
                list.add(i, secondClass);
            }
            for (int i = list.size() - 3; i < list.size(); i++) {
                ThirdClass thirdClass = new ThirdClass();
                list.set(i, thirdClass);
            }
        }
        return list;
    }

    public static LinkedList checkObjects(LinkedList list) {
        int counterFirst = 0;
        int counterSecond = 0;
        int counterThird = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof FirstClass) {
                counterFirst++;
                if (counterFirst > 2) {
                    list.remove(list.get(i));
                    i--;
                    counterFirst--;
                }
            } else if (list.get(i) instanceof SecondClass) {
                counterSecond++;
                if (counterSecond > 2) {
                    list.remove(list.get(i));
                    i--;
                    counterSecond--;
                }
            } else if (list.get(i) instanceof ThirdClass) {
                counterThird++;
                if (counterThird > 2) {
                    list.remove(list.get(i));
                    i--;
                    counterThird--;
                }
            }
        }
        return list;
    }

    public static void callMethodForObjectAndClean(LinkedList list) {
        for (Object o : list) {
            if (o instanceof FirstClass) {
                ((FirstClass) o).firstClassMethod();
            } else if (o instanceof SecondClass) {
                ((SecondClass) o).secondClassMethod();
            } else if (o instanceof ThirdClass) {
                ((ThirdClass) o).thirdClassMethod();
            }
        }
        list.clear();
    }
}
