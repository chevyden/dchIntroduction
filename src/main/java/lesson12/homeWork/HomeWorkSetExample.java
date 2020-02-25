package lesson12.homeWork;

import java.util.HashSet;
import java.util.Iterator;

public class HomeWorkSetExample {
    public static void main(String[] args) {


        HashSet firstSet = new HashSet();
        addOrChangeObjects(firstSet);
        System.out.println(firstSet.toString());

        checkObjects(firstSet);
        System.out.println(firstSet.toString());

        callMethodForObjectAndClean(firstSet);
        System.out.println(firstSet.toString());

    }

    private static HashSet addOrChangeObjects(HashSet set) {
        Iterator iterator = set.iterator();
        if (set.isEmpty()) {
            for (int i = 0; i < 6; i++) {
                set.add(new FirstClass());
            }
        }

        for (int i = 0; i < 3; i++) {
            set.add(new SecondClass());
        }

        int counter = 0;
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof FirstClass) {
                counter++;
                iterator.remove();
                if (counter == 3) {
                    break;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            set.add(new ThirdClass());
        }
        return set;
    }


    public static HashSet checkObjects(HashSet set) {
        int counterFirst = 0;
        int counterSecond = 0;
        int counterThird = 0;
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();

            if (o instanceof FirstClass) {
                counterFirst++;
                if (counterFirst > 2) {
                    iterator.remove();
                    counterFirst--;
                }
            } else if (o instanceof SecondClass) {
                counterSecond++;
                if (counterSecond > 2) {
                    iterator.remove();
                    counterSecond--;
                }
            } else if (o instanceof ThirdClass) {
                counterThird++;
                if (counterThird > 2) {
                    iterator.remove();
                    counterThird--;
                }
            }
        }
        return set;
    }

    public static void callMethodForObjectAndClean(HashSet set) {
        for (Object o : set) {
            if (o instanceof FirstClass) {
                ((FirstClass) o).firstClassMethod();
            } else if (o instanceof SecondClass) {
                ((SecondClass) o).secondClassMethod();
            } else if (o instanceof ThirdClass) {
                ((ThirdClass) o).thirdClassMethod();
            }
        }
        set.clear();
    }
}

