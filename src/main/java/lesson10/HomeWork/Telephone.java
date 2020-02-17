package lesson10.HomeWork;

public abstract class Telephone implements WhatNew, PhonePrice, YearOfProduction {
    private int numbersOfButtons;
    private double displayDiagonal;

    public Telephone() {
    }

    public Telephone(int numbersOfButtons, double displayDiagonal) {
        this.numbersOfButtons = numbersOfButtons;
        this.displayDiagonal = displayDiagonal;
    }

    public int getNumbersOfButtons() {
        return numbersOfButtons;
    }

    public void setNumbersOfButtons(int numbersOfButtons) {
        this.numbersOfButtons = numbersOfButtons;
    }

    public double getDisplayDiagonal() {
        return displayDiagonal;
    }

    public void setDisplayDiagonal(double displayDiagonal) {
        this.displayDiagonal = displayDiagonal;
    }

    public void evolution() {
        System.out.println("Evolution from 2008.");
    }
}
