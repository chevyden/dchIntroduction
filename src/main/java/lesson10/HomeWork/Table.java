package lesson10.HomeWork;

public final class Table extends LivingRoomFurniture {

    private double tableLong;
    private double tableWidth;

    public Table() {
    }



    public Table(String material, String style, String insert, boolean collapsible, double tableLong, double tableWidth) {
        super(material, style, insert, collapsible);
        this.tableLong = tableLong;
        this.tableWidth = tableWidth;
    }

    public double getTableLong() {
        return tableLong;
    }

    public void setTableLong(double tableLong) {
        this.tableLong = tableLong;
    }

    public double getTableWidth() {
        return tableWidth;
    }

    public void setTableWidth(double tableWidth) {
        this.tableWidth = tableWidth;
    }

    @Override
    public void whereToInstall() {
        System.out.println("Install in the center of room.");

    }

    @Override
    public void howManyItems() {
        System.out.println("Install 1 PC");
    }

    @Override
    public void manufacturer() {
        System.out.println("Manufacturer - IKEA.");
    }

    @Override
    public void colorOfUpholstery() {
        System.out.println("Is not upholstery.");
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
        return "Table{" +
                "tableLong=" + tableLong +
                ", tableWidth=" + tableWidth +
                '}';
    }
}
