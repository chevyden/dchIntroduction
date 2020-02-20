package lesson11.model;

public class Chair extends Furniture implements BasicFunctional {
    private boolean skin;

    public Chair() {
    }

    public Chair(String type, String name, String country, double price, boolean skin) {
        super(type, name, country, price);
        this.skin = skin;
    }

    public boolean isSkin() {
        return skin;
    }

    public void setSkin(boolean skin) {
        this.skin = skin;
    }


    @Override
    public void about() {

    }
}