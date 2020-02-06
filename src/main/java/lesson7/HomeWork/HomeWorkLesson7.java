package lesson7.HomeWork;

public class HomeWorkLesson7 {
    public static void main(String[] args) {
/*
+1. Задача на работу с классом/объектами:
 о Создайте 2 Класса: Cat & Dog;
 о У каждого класса задайте по 3 параметра;
 о Создайте конструкторы без параметров, с 1, 2 и 3 параметрами;
 о Важно: Имена параметров классов и входящих параметров в конструкторах должны совпадать! (Используем this);
 о Создайте объекты описанных классов, используя все заданные конструкторы, в классе Main;
*/
        Cat firstCat = new Cat();
        firstCat.age = 5;
        firstCat.breed = "Seam";
        firstCat.name = "Barsik";

        Cat secondCat = new Cat("Alyosha");
        Cat thirdCat = new Cat("Murzik", 3);
        Cat fourthCat = new Cat("Sirko", "Metis", 1);


        Dog firstDog = new Dog();
        firstDog.name = "Palkan";
        firstDog.breed = "Colly";
        firstDog.weight = 10;

        Dog secondDog = new Dog("Husky");
        Dog thirdDog = new Dog("Spaniel", 7);
        Dog fourthDog = new Dog("Lisa", "Fox terrier", 5);

/*
+2. В классах Cat & Dog создайте для каждого из параметров два метода:
о Один метод должен записывать значение параметра (например: для name -> setName(String name));
о Второй метод должен возвращать значение необходимого параметра (например: для name -> getName());
о Для каждого параметра каждого класса должно быть 2 метода (1 set & 1 get);

3. После чего попробуйте в классе Main задать параметры и вывести их значение в консоль обращаясь напрямую к
параметрам и через созданные методы.
*/
        /*                                CATS                                           */

        System.out.println(secondCat.toString());             // sout:Cat{name='Alyosha', breed='null', age=0}// look method 'toString' in class "Cat"
        System.out.println(secondCat.name);                   // sout:Alyosha
        System.out.println(secondCat.breed);                  // sout:null
        System.out.println(secondCat.age);                    // sout:0

        secondCat.setCatName("Luchano");
        secondCat.setCatBreed("Angora");
        secondCat.setCatAge(2);
        System.out.println(secondCat.getCatName());          // sout:Luchano
        System.out.println(secondCat.getCatBreed());         // sout:Angora
        System.out.println(secondCat.getCatAge());           // sout:2
        System.out.println(secondCat.toString());            // sout:Cat{name='Luchano', breed='Angora', age=2}

//        System.out.println(firstCat.equals(secondCat));      // sout:false          //equals & hashCode
//        firstCat.setCatName(secondCat.getCatName());
//        firstCat.breed = secondCat.getCatBreed();
//        firstCat.age = secondCat.age;
//        System.out.println(firstCat.equals(secondCat));      // sout:true

        /*                                DOGS                                           */
        System.out.println("Dogs");
        System.out.println(secondDog.toString());             // sout:Dog{name='null', breed='Husky', weight=0}// look method 'toString' in class "Dog"
        System.out.println(secondDog.name);                   // sout:null
        System.out.println(secondDog.breed);                  // sout:Husky
        System.out.println(secondDog.weight);                 // sout:0

        secondDog.setDogName("Lora");
        secondDog.setDogWeight(12);
        System.out.println(secondDog.getDogName());          // sout:Lora
        System.out.println(secondDog.getDogBreed());         // sout:Husky
        System.out.println(secondDog.getDogWeight());        // sout:12
        System.out.println(secondDog.toString());            // sout:Dog{name='Lora', breed='Husky', weight=12}

//        System.out.println(thirdDog.equals(fourthDog));      // sout:false          //equals & hashCode
//        thirdDog = fourthDog;
//        System.out.println(thirdDog.toString());             // sout:Dog{name='Lisa', breed='Fox terrier', weight=5}
//        System.out.println(thirdDog.equals(fourthDog));      // sout:true

    }
}