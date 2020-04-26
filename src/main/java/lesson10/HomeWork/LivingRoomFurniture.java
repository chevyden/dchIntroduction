package lesson10.HomeWork;

public abstract class LivingRoomFurniture extends Furniture {
    private String insert;
    private boolean collapsible;

    public LivingRoomFurniture() {
    }

    public LivingRoomFurniture(String material, String style, String insert, boolean collapsible) {
        super(material, style);
        this.insert = insert;
        this.collapsible = collapsible;
    }

    public String getInsert() {
        return insert;
    }

    public void setInsert(String insert) {
        this.insert = insert;
    }

    public boolean isCollapsible() {
        return collapsible;
    }

    public void setCollapsible(boolean collapsible) {
        this.collapsible = collapsible;
    }

    public void withInserts(String insert) {
        System.out.println("This furniture with inserts of: " + insert);
    }

}
