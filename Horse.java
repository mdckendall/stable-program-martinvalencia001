//Create the Horse class here.


public class Horse {
    private String name;
    private double weight;
    private boolean isTame;

    public Horse(String name, double weight, boolean isTame) {
        this.name = name;
        this.weight = weight;
        this.isTame = isTame;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isTame() {
        return isTame;
    }
}