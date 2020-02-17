package lesson10.HomeWork;

public final class SecondGeneration extends Iphone {


    private double thickness;
    private boolean faceTime;

    public SecondGeneration() {
    }

    public SecondGeneration(int numbersOfButtons, double displayDiagonal, String name, boolean isCamera, double thickness, boolean faceTime) {
        super(numbersOfButtons, displayDiagonal, name, isCamera);
        this.thickness = thickness;
        this.faceTime = faceTime;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public boolean isFaceTime() {
        return faceTime;
    }

    public void setFaceTime(boolean faceTime) {
        this.faceTime = faceTime;
    }

    public void thinnest() {
        System.out.println("This telephone is the thinnest");
    }


    @Override
    public void newInTheModel() {
        System.out.println("There is micro SIM card");
    }

    @Override
    public void colours() {
        System.out.println("White and black colours");

    }

    @Override
    public void productionYear() {
        System.out.println("Year of production is 2010");
    }

    @Override
    public void preview() {
        System.out.println("Next model will be Iphone 4S");
    }

    @Override
    public void phonePrise() {
        System.out.println("Prise - 199$");
    }

    @Override
    public void salePrise() {
        System.out.println("Sale price - 180$");
    }
}
