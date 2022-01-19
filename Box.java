package projectsHandsOn.generics.BoxOfFruits;

import java.util.ArrayList;
import java.util.Scanner;

public class Box<T extends Fruit> implements Comparable<Box<?>> {
    private ArrayList<T> fruits = new ArrayList<>();

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

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

    /*

    TODO How to clone an array and modify it with switched items???
    FIXME fix items:
    - Type of array

    */

    public static void switchItems(Box<?> fruits){
    }

    @Override
    public int compareTo(Box<?> other) {
        return Double.compare(getTotalWeight(), other.getTotalWeight());
    }
}
