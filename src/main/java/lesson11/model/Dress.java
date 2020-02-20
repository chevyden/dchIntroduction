package lesson11.model;

public class Dress extends Clothes {
    private boolean zipper;

    public Dress() {
    }

    public Dress(String type, String name, String country, double price, int size,
                 boolean forMan, boolean forWoman, boolean zipper) {
        super(type, name, country, price, size, forMan, forWoman);
        this.zipper = zipper;
    }

    public boolean isZipper() {
        return zipper;
    }

    public void setZipper(boolean zipper) {
        this.zipper = zipper;
    }

    @Override
    public void about() {
        //TODO: will be later;
    }
}
