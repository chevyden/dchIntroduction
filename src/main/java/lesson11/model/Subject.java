package lesson11.model;

public abstract class Subject implements BasicFunctional {

    private String type;
    private String name;
    private String country;
    private double price;

    public Subject() {
    }

    public Subject(String type, String name, String country, double price) {
        this.type = type;
        this.name = name;
        this.country = country;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
