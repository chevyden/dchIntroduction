package lesson10.HomeWork;

public class Main {
        /*
    Задание по уроку 10.
Имея представления об обычных классах, абстрактных классах и интерфейсах необходимо создать следующие реализации:
Создайте 2 цепочки классов(из примера в классе: “Animal <- Cat <- Persian” / “People <- Employee <- FireMan”),
только придумать свои классы. Условия:
а). Всего классов для каждой цепочки должно быть 5;
б). Один главный класс, второй - наследуется от главного, и еще 3 класса, которые наследуются от второго;
в). Главный класс и второй класс наследник должен быть “без возможности создавать экземпляр класса”
(подумайте какими именно должны быть классы?)
г). В каждом класса должно быть минимум по 2 характеристики и по 1 методу(дополнительному);
д). Для каждого класса реализуйте все необходимые методы для работы, зная пройденные принципы ООП;
е). Финальные 3 класса-наследника в каждой цепочке должны быть “не наследуемые”;
Создайте 5 интерфейсов со следующими условиями:
а). Должно быть 2 пары, один интерфейс наследуется от другого и 1 отдельный интерфейс;
б). У каждого из 5 интерфейсов определите 2 заданных метода;
в). Одна цепочка классов должна имплементировать одну связку интерфейсов, а вторая цепочка классов должна
имплементировать другую связку интерфейсов и оставшийся отдельный интерфейс;
В классе Main создайте экземпляры всех классов и интерфейсов, запишите значения характеристик там где возможно
и вызовите все реализованные дополнительные методы в них.
     */


    public static void main(String[] args) {
        /*_______________________________________TELEPHONES____________________________________________*/

        FirstGeneration iphoneThirdG = new FirstGeneration(4, 3.5, "iPhone 3G",
                true, "3", true);
        System.out.print("Hello! ");
        iphoneThirdG.myName();
        iphoneThirdG.evolution();
        newAndYear(iphoneThirdG);
        iphoneThirdG.myGeneration();

        SecondGeneration iphoneFourth = new SecondGeneration(4, 3.5, "Iphone 4",
                true, 9.3, true);
        newAndYear(iphoneFourth);
        iphoneFourth.thinnest();

        ThirdGeneration iphoneFifth = new ThirdGeneration(4, 4.0, "Iphone 5",
                true, 2, true);
        newAndYear(iphoneFifth);
        iphoneFifth.iHas();

        /*_______________________________________FURNITURE____________________________________________*/

        Chair chairInLivingRoom = new Chair("Wood", "Classic", "Leather", false, 0.55, 0.60);
        System.out.println(chairInLivingRoom.toString());
        installAndCharacteristics(chairInLivingRoom);

        Table tableInLivingRoom = new Table("Wood", "Classic", "Glass", true, 2.00, 0.75);
        System.out.println(tableInLivingRoom.toString());
        installAndCharacteristics(tableInLivingRoom);

        Sofa sofaInLivingRoom = new Sofa("Wood", "Classic", "Chrome", false, 1.60, 3);
        System.out.println(sofaInLivingRoom.toString());
        installAndCharacteristics(sofaInLivingRoom);

    }

    public static void newAndYear(Telephone telephone) {

//        System.out.println(((Iphone) telephone).toString());
        System.out.println(((Iphone) telephone).getName());
        telephone.newInTheModel();
        telephone.productionYear();
        telephone.colours();
        telephone.phonePrise();
        System.out.println("Attention!!!");
        telephone.salePrise();
        telephone.preview();
    }

    public static void installAndCharacteristics(Furniture furniture) {
        furniture.colour();
        furniture.howManyItems();
        furniture.whereToInstall();
        ((LivingRoomFurniture) furniture).withInserts(((LivingRoomFurniture) furniture).getInsert());
        furniture.colorOfUpholstery();
        furniture.manufacturer();
    }

}

