package lesson11.model;

public class Sofa extends Furniture {
    private boolean folding;

    public Sofa() {
    }

    public Sofa(String type, String name, String country, double price, boolean folding) {
        super(type, name, country, price);
        this.folding = folding;
    }

    public boolean isFolding() {
        return folding;
    }

    public void setFolding(boolean folding) {
        this.folding = folding;
    }

    @Override
    public void about() {
        //TODO: will be later;
    }
}
