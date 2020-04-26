package lesson8.ClassWork0802;

public class Human {
    private String name;
    private String surname;
    private int age;
    private int weight;
    private int firstSkill;
    private double secondSkill;
    private String thirdSkill;
    private boolean isHuman;

    public Human() {
    }

    public Human(String name, String surname, int age, int weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Human(String name, String surname, int age, int weight, int firstSkill) {
        this(name, surname, age, weight);
        this.firstSkill = firstSkill;
    }

    public Human(String name, String surname, int age, int weight, double secondSkill) {
        this(name, surname, age, weight);
        this.secondSkill = secondSkill;
    }

    public Human(String name, String surname, int age, int weight, String thirdSkill) {
        this(name, surname, age, weight);
        this.thirdSkill = thirdSkill;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFirstSkill() {
        return firstSkill;
    }

    public void setFirstSkill(int firstSkill) {
        this.firstSkill = firstSkill;
    }

    public double getSecondSkill() {
        return secondSkill;
    }

    public void setSecondSkill(int secondSkill) {
        this.secondSkill = secondSkill;
    }

    public String getThirdSkill() {
        return thirdSkill;
    }

    public void setThirdSkill(String thirdSkill) {
        this.thirdSkill = thirdSkill;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public void setHuman(boolean human) {
        isHuman = human;
    }
}