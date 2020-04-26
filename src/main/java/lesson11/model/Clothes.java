package lesson11.model;

public abstract class Clothes extends Subject {
    private int size;
    private boolean forMan;
    private boolean forWoman;

    public Clothes() {
    }

    public Clothes(String type, String name, String country, double price, int size, boolean forMan, boolean forWoman) {
        super(type, name, country, price);
        this.size = size;
        this.forMan = forMan;
        this.forWoman = forWoman;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isForMan() {
        return forMan;
    }

    public void setForMan(boolean forMan) {
        this.forMan = forMan;
    }

    public boolean isForWoman() {
        return forWoman;
    }

    public void setForWoman(boolean forWoman) {
        this.forWoman = forWoman;
    }
}