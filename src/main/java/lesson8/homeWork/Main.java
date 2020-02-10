package lesson8.homeWork;

public class Main {

    public static void main(String[] args) {

        House firstHouse = new House();
        firstHouse.setTableInLivingRoom(new Table(1.5, 0.8, "wood", "IKEA"));
        firstHouse.setTvSetInLivingRoom(new TvSet(1091.6, 634.6, "Samsung"));
        firstHouse.setChairInLivingRoom(new Chair(0.5, "IKEA", "Classic"));
        firstHouse.setChairInDinnerRoom(new Chair(0.6, "Epicentr K", "Modern"));
        firstHouse.setBedInBedRoom(new Bed(2.2, 2.0, "IKEA"));

        System.out.println("The first house has: " + "\n" + firstHouse.getTableInLivingRoom().toString()
                + "\n" +firstHouse.getTvSetInLivingRoom().toString()+ "\n" +firstHouse.getChairInLivingRoom().toString()
                + "\n" +firstHouse.getChairInDinnerRoom().toString()+ "\n" +firstHouse.getBedInBedRoom().toString());
//        VariablesFinal variablesFinal = new VariablesFinal();
//        int first = variablesFinal.getFIRST_FINAL_VARIABLE();
//        System.out.println(first);

    }
}
