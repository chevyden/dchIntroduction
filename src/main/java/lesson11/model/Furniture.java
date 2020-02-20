package lesson11.model;

public abstract class Furniture extends Subject {

    public Furniture() {
    }

    public Furniture(String type, String name, String country, double price) {
        super(type, name, country, price);
    }
}