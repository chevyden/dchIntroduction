package lesson13.homeWorkLesson13;

import java.util.HashSet;
import java.util.LinkedList;

public class HomeWorkLesson13Task2 {
    /*    Задача 2:
1. Создайте 3 класса, которые линейно наследуются друг от друга. Должна быть возможность создать экземпляр класса
каждого из наследников(подумайте какой тип класса должен быть).
2. В каждом из классов должно быть 3 поля(на свое усмотрение), которые имеют тип переменной List/Set/Map, то есть
будут по 1 переменной с типом List, Set и Map.(Зная принципы ООП будьте внимательны реализуя переменные в классах!).
3. Далее зная про Wildcards реализуйте метод, который на вход будет принимать 2 List/Set/Map(На Ваше усмотрение,
не принципиально), один из которых будет разрешать передать всех наследников от среднего класса(Вашего),
второй - будет разрешать передать всех кто выше в наследовании от среднего класса(Вашего).
4. Логика внутри метода данного: заполнение из одной коллекции данными в другую коллекцию.
    */

    public static void main(String[] args) {
        LinkedList<ThirdClass> thirdClassLinkedList = new LinkedList<>();
        thirdClassLinkedList.add(0, null);
        thirdClassLinkedList.add(1, new ThirdClass());

        HashSet<FirstClass> firstClassHashSet = new HashSet<>();
        firstClassHashSet.add(new FirstClass());

        loadToCollections(thirdClassLinkedList, firstClassHashSet);
    }

    public static void loadToCollections(LinkedList<? extends SecondClass> linkedList,
                                         HashSet<? super SecondClass> hashSet) {

        for (int i = 0; i < linkedList.size(); i++) {
            hashSet.add(linkedList.get(i));
        }
    }
}
