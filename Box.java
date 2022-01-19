package projectsHandsOn.generics.BoxOfFruits;

import java.util.ArrayList;

public class Box<T extends Fruit> implements Comparable<Box<?>> {

    private final ArrayList<T> fruits = new ArrayList<>();

    public int getFruitCount() {
        return fruits.size();
    }

    public double getTotalWeight() {
        return fruits.size() * fruits.get(0).getWeight();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void toSprinkleBox(Box<T> box) {
        fruits.addAll(box.fruits);
        box.fruits.clear();
    }

    @Override
    public int compareTo(Box<?> other) {
        return Double.compare(getTotalWeight(), other.getTotalWeight());
    }
}
