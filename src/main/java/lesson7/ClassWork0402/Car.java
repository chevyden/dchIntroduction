package lesson7.ClassWork0402;

public class Car {
    String id;
    String type;
    int weight;
    String color;
    private String number;


    public void setNumber(String number) {
        validateNumber();
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    private void validateNumber() {
        //some validation......
    }

    public Car() {
    }

    public Car(String number) {
        setNumber(number);
    }

    public Car(int weight) {
        this.weight = weight;
    }

    public Car(String id, String type) {
        this.id = id;
        this.type = type;
    }


    public Car(String type, int weight, String color) {
        this.type = type;
        this.weight = weight;
        this.color = color;
    }

    public Car(String id, String type, int weight) {
//        this.id = id;
//        this.type = type;
        this(id, type);
        this.weight = weight;
    }

//Невозможно создать 2 конструктора Car(String, String)
//    public Car(String color, String type) {
//        this.color = color;
//        this.type = type;
//    }


    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}