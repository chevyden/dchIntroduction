package lesson8.homeWork;

import java.util.Objects;

public class Bed {

    private double length;
    private double width;
    private String manufacturer;

    public Bed() {
    }

    public Bed(double length, double width, String manufacturer) {
        this.length = length;
        this.width = width;
        this.manufacturer = manufacturer;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "length=" + length +
                ", width=" + width +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}


