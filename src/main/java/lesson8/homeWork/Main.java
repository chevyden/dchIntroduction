package lesson8.homeWork;

public class Main {
    /*
    3. Создайте класс House. Заполните Ваш новый дом “мебелью”(подсказка: отдельные классы), для примера
    достаточно до 5 вещей. У каждой вещи также должно быть пару характеристик.
    */
    public static void main(String[] args) {

        //Создаём Дом и наполняем его мебелью:
        House firstHouse = new House();

        Table tableInLivingRoom = new Table(1.5, 0.8, "Wood", "IKEA");
        firstHouse.setTableInLivingRoom(tableInLivingRoom);

        Chair chairInLivingRoom = new Chair(0.5, "UkrEnergo", "Electric");
        firstHouse.setChairInLivingRoom(chairInLivingRoom);

        TvSet tvSetInLivingRoom = new TvSet(1.0916, 0.6346, "Samsung");
        firstHouse.setTvSetInLivingRoom(tvSetInLivingRoom);

        Chair chairInDinnerRoom = new Chair(0.6, "TEMP", "Modern");
        firstHouse.setChairInDinnerRoom(chairInDinnerRoom);

        Bed bedInBedRoom = new Bed(2.2, 2.0, "Veneto LTD");
        firstHouse.setBedInBedRoom(bedInBedRoom);

        System.out.println("The first house has: " + "\n" + firstHouse.toString());

    }
}
