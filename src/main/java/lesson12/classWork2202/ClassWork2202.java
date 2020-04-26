package lesson12.classWork2202;

import lesson7.ClassWork0402.User;

import java.util.*;

public class ClassWork2202 {
    public static void main(String[] args) {

//        //LIST EXAMPLES:
//
//        ArrayList list = new ArrayList();
////        System.out.println("ArrayList size when create: " + list.size());
//        if (!list.isEmpty()) {
//            System.out.println(list.get(0));
//        }
//
//        list.add("Element1");
//        list.add("Element2");
//        list.add("Element3");
////        System.out.println("ArrayList with elements: " + list.size());
////        System.out.println("List get method: " + list.get(1));
////
////        list.add(1, "InnerElement");
////        System.out.println("ArrayList with elements: " + list.size());
////        System.out.println("List get method: " + list.get(1));
//
//        System.out.println("List element 0: " + list.get(0));
//        System.out.println("ArrayList with elements: " + list.size());
//        list.set(0, "SetElement");
//        System.out.println("List element 0: " + list.get(0));
//        System.out.println("ArrayList with elements: " + list.size());
//
//        if (list.contains("SetElement")) {
//            System.out.println("List c contains 'SetElement'");
//        } else {
//            System.out.println("List doesn't contains it");
//        }
//
//        System.out.println("List size before remove some element: " + list.size());
//        list.remove("Element2");
//        System.out.println("List size after remove some element: " + list.size());
//
//        list.clear();
//        System.out.println("List isEmpty after clear: " + list.isEmpty());
//
//        LinkedList linkedList = new LinkedList();
//        int[] array = {1, 2, 3, 4, 5};
//        linkedList.addAll(list);

        //SET EXAMPLES:

        HashSet set = new HashSet();
        System.out.println("Set empty size: " + set.size());
        set.add("Element1");
        set.add("Element2");
        set.add("Element3");
        set.add("Element3");
        System.out.println("Set not empty size: " + set.size());

        System.out.println("Set isEmpty: " + set.isEmpty());
        System.out.println("Set contains element 'text': " + set.contains("text"));

        System.out.println("Set size before remove: " + set.size());
        set.remove("text");
        System.out.println("Set size after remove: " + set.size());

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList list = new ArrayList();
        list.addAll(set);
        Collections.reverse(list);

        for (Object o : list) {
            System.out.println(((String) o));
        }

        set.clear();
        System.out.println("Set size after clear: " + set.size());


        /*We can add any Objects in our set/list*/
        list.add(new User());
        list.add(155);
        list.add(1555);

        /*In our set/list now we have Object therefore we need check what object in used before call his methods*/
        for (Object o : list) {
            if (o instanceof String) {
                System.out.println("It's a String type: " + o);
            } else if (o instanceof User) {
                User user = (User) o;
                System.out.println("It's a User" + user);
            } else {
                System.out.println("It's other type: " + o);
            }
        }
    }
}
