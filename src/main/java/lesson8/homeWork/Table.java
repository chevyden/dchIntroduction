package lesson8.homeWork;

import java.util.Objects;

public class Table {

    private double length;
    private double width;
    private String material;
    private String manufacturer;

    public Table() {
    }

    public Table(double length, double width, String material, String manufacturer) {
        this.length = length;
        this.width = width;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Table{" +
                "length=" + length +
                ", width=" + width +
                ", material='" + material + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
