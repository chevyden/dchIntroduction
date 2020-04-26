package lesson10.HomeWork;

public final class Sofa extends LivingRoomFurniture {

    private double sofaLong;
    private int numbersOfPersons;

    public Sofa() {
    }

    public Sofa(String material, String style, String insert, boolean collapsible, double sofaLong, int numbersOfPersons) {
        super(material, style, insert, collapsible);
        this.sofaLong = sofaLong;
        this.numbersOfPersons = numbersOfPersons;
    }

    public double getSofaLong() {
        return sofaLong;
    }

    public void setSofaLong(double sofaLong) {
        this.sofaLong = sofaLong;
    }

    public int getNumbersOfPersons() {
        return numbersOfPersons;
    }

    public void setNumbersOfPersons(int numbersOfPersons) {
        this.numbersOfPersons = numbersOfPersons;
    }

    @Override
    public void whereToInstall() {
        System.out.println("Install on the corner");

    }

    @Override
    public void howManyItems() {
        System.out.println("Install 1 PC.");
    }

    @Override
    public void manufacturer() {
        System.out.println("Manufacturer - IKEA");
    }

    @Override
    public void colorOfUpholstery() {
        System.out.println("Upholstery - black and red leather");
    }

    @Override
    public void withInserts(String insert) {
        super.withInserts(insert);
    }


    @Override
    public void colour() {
        System.out.println("Venge colour");
    }


    @Override
    public String toString() {
        return "Sofa{" +
                "sofaLong=" + sofaLong +
                ", numbersOfPersons=" + numbersOfPersons +
                '}';
    }
}
