package lesson10.HomeWork;

public abstract class Iphone extends Telephone {
    private String name;
    private boolean isCamera;

    public Iphone() {
    }

    public Iphone(int numbersOfButtons, double displayDiagonal, String name, boolean isCamera) {
        super(numbersOfButtons, displayDiagonal);
        this.name = name;
        this.isCamera = isCamera;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCamera() {
        return isCamera;
    }

    public void setCamera(boolean camera) {
        isCamera = camera;
    }

    public void myName() {
        System.out.println("My name is Iphone.");
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "name='" + name + '\'' +
                ", isCamera=" + isCamera +
                '}';
    }
}
