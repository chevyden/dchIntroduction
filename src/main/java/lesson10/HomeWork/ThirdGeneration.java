package lesson10.HomeWork;

public final class ThirdGeneration extends Iphone{

    private int numberOfCameras;
    private boolean isLte;


    public ThirdGeneration() {
    }

    public ThirdGeneration(int numbersOfButtons, double displayDiagonal, String name, boolean isCamera, int numberOfCameras, boolean isLte) {
        super(numbersOfButtons, displayDiagonal, name, isCamera);
        this.numberOfCameras = numberOfCameras;
        this.isLte = isLte;
    }

    public int getNumberOfCameras() {
        return numberOfCameras;
    }

    public void setNumberOfCameras(int numberOfCameras) {
        this.numberOfCameras = numberOfCameras;
    }

    public boolean isLte() {
        return isLte;
    }

    public void setLte(boolean lte) {
        isLte = lte;
    }

    public void iHas() {
        System.out.println("This model has two cameras");
    }

    @Override
    public void newInTheModel() {
        System.out.println("LTE standard supported and there is frontal camera");
    }

    @Override
    public void colours() {
        System.out.println("White, black and gold colours");
    }

    @Override
    public void productionYear() {
        System.out.println("Year of production is 2012");
    }

    @Override
    public void preview() {
        System.out.println("Next model will be Iphone 5S");
    }

    @Override
    public void phonePrise() {
        System.out.println("Prise - 499$");
    }

    @Override
    public void salePrise() {
        System.out.println("Sale price - 450$");
    }
}
