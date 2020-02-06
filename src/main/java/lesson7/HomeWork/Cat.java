package lesson7.HomeWork;

import java.util.Objects;

public class Cat {
    String name;
    String breed;
    int age;

    public Cat() {
    }

    public void setCatName(String name) {
        this.name = name;
    }

    public String getCatName() {
        return name;
    }

    public void setCatBreed(String breed) {
        this.breed = breed;
    }

    public String getCatBreed() {
        return breed;
    }

    public void setCatAge(int age) {
        this.age = age;
    }

    public int getCatAge() {
        return age;
    }


    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }
}

