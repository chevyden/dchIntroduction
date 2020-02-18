package lesson10.HomeWork;

public final class FirstGeneration extends Iphone {
    private String indexOfGeneration;
    private boolean is3G;

    public FirstGeneration() {
    }

    public FirstGeneration(int numbersOfButtons, double displayDiagonal, String name, boolean isCamera, String indexOfGeneration, boolean is3G) {
        super(numbersOfButtons, displayDiagonal, name, isCamera);
        this.indexOfGeneration = indexOfGeneration;
        this.is3G = is3G;
    }

    public String getIndexOfGeneration() {
        return indexOfGeneration;
    }

    public void setIndexOfGeneration(String indexOfGeneration) {
        this.indexOfGeneration = indexOfGeneration;
    }

    public boolean isIs3G() {
        return is3G;
    }

    public void setIs3G(boolean is3G) {
        this.is3G = is3G;
    }

    public void myGeneration() {
        System.out.println("This generation is 3G.");
    }


    @Override
    public void newInTheModel() {
        System.out.println("There is high speed internet");
    }

    @Override
    public void colours() {
        System.out.println("Only black colour");
    }

    @Override
    public void productionYear() {
        System.out.println("Year of production is 2008");
    }

    @Override
    public void preview() {
        System.out.println("Next model will be Iphone 3GS");
    }

    @Override
    public void phonePrise() {
        System.out.println("Price - 99$");
    }

    @Override
    public void salePrise() {
        System.out.println("Sale price  - 90$");
    }

    @Override
    public String toString() {
        return "FirstGeneration{" +
                "indexOfGeneration='" + indexOfGeneration + '\'' +
                ", is3G=" + is3G +
                "} " + super.toString();
    }
}
