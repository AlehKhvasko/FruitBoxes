package projectsHandsOn.generics.BoxOfFruits;

public abstract class Fruit {
    private final double weight;

    public Fruit(Double weight){
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
}
