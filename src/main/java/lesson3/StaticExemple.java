package lesson3;


public class StaticExemple {
    private void first() {
        second();
    }

    private static void second() {
//       first(); // Из static метода невозможно вызвать не static метод текущего класс
    }
 }
