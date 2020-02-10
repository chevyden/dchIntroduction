package lesson8.homeWork;

public class Main {

    public static void main(String[] args) {

        House firstHouse = new House();
        firstHouse.setTableInLivingRoom(new Table(1.5, 0.8, "wood", "IKEA"));
        firstHouse.setTvSetInLivingRoom(new TvSet(1091.6, 634.6, "Samsung"));
        firstHouse.setChairInLivingRoom(new Chair(0.5, "IKEA", "Classic"));

        firstHouse.setChairInDinnerRoom(new Chair());
        firstHouse.getChairInDinnerRoom().setHeight(0.6);
        firstHouse.getChairInDinnerRoom().setManufacturer("Temp");
        firstHouse.getChairInDinnerRoom().setStyle("Electric)))");

        firstHouse.setBedInBedRoom(new Bed());
        firstHouse.getBedInBedRoom().setLength(2.2);
        firstHouse.getBedInBedRoom().setWidth(2.0);
        firstHouse.getBedInBedRoom().setManufacturer("Veneto LTD");

        System.out.println("The first house has: " + "\n" + firstHouse.getTableInLivingRoom().toString()
                + "\n" + firstHouse.getTvSetInLivingRoom().toString() + "\n" + firstHouse.getChairInLivingRoom().toString()
                + "\n" + firstHouse.getChairInDinnerRoom().toString() + "\n" + firstHouse.getBedInBedRoom().toString());

    }
}
