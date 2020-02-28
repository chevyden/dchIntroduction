package lesson13.homeWorkLesson13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
        FirstClass firstClassObject = new FirstClass();
        firstClassObject.setLinkedListFirstClass(new LinkedList<>());
        firstClassObject.setHashSetFirstClass(new HashSet<>());
        firstClassObject.setHashMapFirstClass(new HashMap<>());
        firstClassObject.getLinkedListFirstClass().add(0, "1111");
        firstClassObject.getLinkedListFirstClass().add(1, "2222");
        firstClassObject.getHashSetFirstClass().add("one");
        firstClassObject.getHashSetFirstClass().add("two");
        firstClassObject.getHashMapFirstClass().put("first", 1.1);
        firstClassObject.getHashMapFirstClass().put("second", 2.2);

        System.out.println(firstClassObject.toString());

        SecondClass secondClassObject = new SecondClass();
        secondClassObject.setLinkedListFirstClass(new LinkedList<>());
        secondClassObject.setHashSetFirstClass(new HashSet<>());
        secondClassObject.setHashMapFirstClass(new HashMap<>());
        System.out.println(secondClassObject.toString());

        ThirdClass thirdClassObject = new ThirdClass();
        thirdClassObject.setLinkedListFirstClass(new LinkedList<>());
        thirdClassObject.setHashSetFirstClass(new HashSet<>());
        thirdClassObject.setHashMapFirstClass(new HashMap<>());
        System.out.println(thirdClassObject.toString());

//        reloadCollections(thirdClassObject.getLinkedListFirstClass(),firstClassObject.getHashSetFirstClass());

    }

    public static HashSet reloadCollections(LinkedList <? extends SecondClass> linkedList ,
                                         HashSet<? super SecondClass> hashSet) {
        Iterator objectIterator = hashSet.iterator();
        while (objectIterator.hasNext()) {
            objectIterator.remove();           //TODO: iterator.next.remove!!!!!!
        }
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
            hashSet.add(linkedList.get(i));
        }
        return hashSet;
    }
}
