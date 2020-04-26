package lesson10.HomeWork;

public abstract class Furniture implements OtherCharacteristics, Install {

    private String material;
    private String style;

    public Furniture() {
    }

    public Furniture(String material, String style) {
        this.material = material;
        this.style = style;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public abstract void colour();
}
