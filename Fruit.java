package projectsHandsOn.generics.BoxOfFruits;

public abstract class Fruit {
    private String name;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
