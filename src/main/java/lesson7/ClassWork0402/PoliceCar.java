package lesson7.ClassWork0402;

public class PoliceCar extends Car {

    String light;

    public PoliceCar() {
    }

    public PoliceCar(String id, String light) {
        super(id);
        this.light = light;
    }
}
