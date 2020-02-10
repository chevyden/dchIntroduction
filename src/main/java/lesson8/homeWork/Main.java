package lesson8.homeWork;

public class Main {
/*
3. Создайте класс House. Заполните Ваш новый дом “мебелью”(подсказка: отдельные классы), для примера
достаточно до 5 вещей. У каждой вещи также должно быть пару характеристик.
*/
    public static void main(String[] args) {

        //Создаём Дом и наполняем его мебелью:
        House firstHouse = new House();  //создали дом

        //1-й способ:  Вносим в Дом новые стол и стул используя конструкторы:
        firstHouse.setTableInLivingRoom(new Table(1.5, 0.8, "wood", "IKEA"));
        firstHouse.setChairInLivingRoom(new Chair(0.5, "UkrEnergo", "Electric"));

        //2-й способ: Создаём новый телевизор и устанавливаем ему параметры с помощью сеттера:
        TvSet tvSet = new TvSet();
        tvSet.setLength(1.0916);
        tvSet.setWidth(0.6346);
        tvSet.setManufacturer("Samsung");
        firstHouse.setTvSetInLivingRoom(tvSet); //Сеттером вносим в Дом телевизор

        //3-й способ: Создаем стул с помощью конструктора и ставим его в Дом с помощью сеттера:
        Chair chairInDinnerRoom = new Chair(0.6, "TEMP", "Modern");
        firstHouse.setChairInDinnerRoom(chairInDinnerRoom);

        //4-й способ:  Сеттером ставим в Дом кровать без параметров
        firstHouse.setBedInBedRoom(new Bed());
        //Обращаясь непосредственно к кровати в Доме, присваиваем параметры:
        firstHouse.getBedInBedRoom().setLength(2.2);
        firstHouse.getBedInBedRoom().setWidth(2.0);
        firstHouse.getBedInBedRoom().setManufacturer("Veneto LTD");

        System.out.println("The first house has: " + "\n" + firstHouse.getTableInLivingRoom().toString()
                + "\n" + firstHouse.getTvSetInLivingRoom().toString() + "\n" + firstHouse.getChairInLivingRoom().toString()
                + "\n" + firstHouse.getChairInDinnerRoom().toString() + "\n" + firstHouse.getBedInBedRoom().toString());

    }
}
