package lesson11.model;

public class Shirt extends Clothes {
    private boolean button;

    public Shirt() {
    }

    public Shirt(String type, String name, String country, double price, int size,
                 boolean forMan, boolean forWoman, boolean button) {
        super(type, name, country, price, size, forMan, forWoman);
        this.button = button;
    }

    public boolean isButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
    }

    @Override
    public void about() {
        //TODO: will be later;
    }
}
