package lesson10.HomeWork;

public final class Chair extends LivingRoomFurniture {
    private double chairHeight;
    private double chairWidth;

    public Chair() {
    }

    public Chair(String material, String style, String insert, boolean collapsible, double chairHeight, double chairWidth) {
        super(material, style, insert, collapsible);
        this.chairHeight = chairHeight;
        this.chairWidth = chairWidth;
    }

    public double getChairHeight() {
        return chairHeight;
    }

    public void setChairHeight(double chairHeight) {
        this.chairHeight = chairHeight;
    }

    public double getChairWidth() {
        return chairWidth;
    }

    public void setChairWidth(double chairWidth) {
        this.chairWidth = chairWidth;
    }

    @Override
    public void whereToInstall() {
        System.out.println("Install near the table.");

    }

    @Override
    public void howManyItems() {
        System.out.println("Install 4 PCS.");
    }

    @Override
    public void manufacturer() {
        System.out.println("Manufacturer is IKEA");

    }

    @Override
    public void colorOfUpholstery() {
        System.out.println("Upholstery - black leather.");

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
        return "Chair{" +
                "chairHeight=" + chairHeight +
                ", chairWidth=" + chairWidth +
                '}';
    }
}
