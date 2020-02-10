package lesson8.homeWork;

import java.util.Objects;

public class Chair {

    private double height;
    private String manufacturer;
    private String style;

    public Chair() {
    }

    public Chair(double height, String manufacturer, String style) {
        this.height = height;
        this.manufacturer = manufacturer;
        this.style = style;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "height=" + height +
                ", manufacturer='" + manufacturer + '\'' +
                ", style='" + style + '\'' +
                '}';
    }
}
