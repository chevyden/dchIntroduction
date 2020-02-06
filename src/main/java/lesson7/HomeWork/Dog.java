package lesson7.HomeWork;

import java.util.Objects;

public class Dog {
    String name;
    String breed;
    int weight;

    public Dog() {
    }

    public void setDogName(String name) {
        this.name = name;
    }

    public String getDogName() {
        return name;
    }

    public void setDogBreed(String breed) {
        this.breed = breed;
    }

    public String getDogBreed() {
        return breed;
    }

    public void setDogWeight(int weight) {
        this.weight = weight;
    }

    public int getDogWeight() {
        return weight;
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(String breed, int weight) {
        this.breed = breed;
        this.weight = weight;
    }

    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return weight == dog.weight &&
                Objects.equals(name, dog.name) &&
                Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, weight);
    }
}
