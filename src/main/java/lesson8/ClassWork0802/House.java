package lesson8.ClassWork0802;

import java.util.Objects;

public class House {
    private String firstWall;
    private String secondWall;
    private String thirdWall;
    private String fourthWall;
    private double cost;
    private boolean custom;

    public House() {
    }

    public House(String firstWall, String secondWall, String thirdWall, String fourthWall, double cost, boolean custom) {
        this.firstWall = firstWall;
        this.secondWall = secondWall;
        this.thirdWall = thirdWall;
        this.fourthWall = fourthWall;
        this.cost = cost;
        this.custom = custom;
    }

    public String getFirstWall() {
        return firstWall;
    }

    public void setFirstWall(String firstWall) {
        this.firstWall = firstWall;
    }

    public String getSecondWall() {
        return secondWall;
    }

    public void setSecondWall(String secondWall) {
        this.secondWall = secondWall;
    }

    public String getThirdWall() {
        return thirdWall;
    }

    public void setThirdWall(String thirdWall) {
        this.thirdWall = thirdWall;
    }

    public String getFourthWall() {
        return fourthWall;
    }

    public void setFourthWall(String fourthWall) {
        this.fourthWall = fourthWall;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isCustom() {
        return custom;
    }

    public void setCustom(boolean custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Double.compare(house.cost, cost) == 0 &&
                custom == house.custom &&
                Objects.equals(firstWall, house.firstWall) &&
                Objects.equals(secondWall, house.secondWall) &&
                Objects.equals(thirdWall, house.thirdWall) &&
                Objects.equals(fourthWall, house.fourthWall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstWall, secondWall, thirdWall, fourthWall, cost, custom);
    }

    @Override
    public String toString() {
        return "House{" +
                "firstWall='" + firstWall + '\'' +
                ", secondWall='" + secondWall + '\'' +
                ", thirdWall='" + thirdWall + '\'' +
                ", fourthWall='" + fourthWall + '\'' +
                ", cost=" + cost +
                ", custom=" + custom +
                '}';
    }
}