package projectsHandsOn.generics.BoxOfFruits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FruitBoxes /*implements Comparable<Box>*/{
    private ArrayList<Box> fruitBoxes = new ArrayList<>();

    public void addBoxOfFruit(Box fruits){
        this.fruitBoxes.add(fruits);
        fruitBoxes.sort((o1, o2) -> Double.compare(o1.getTotalWeight(), o2.getTotalWeight()));

    }

    //TODO "refactor toString method"
    public void displayBoxes() {
        for (Box fruits:fruitBoxes) {
            System.out.println("Box of " + fruits.getName() + "(s) with total weight of " + fruits.getTotalWeight());
        }
    }
/**
 * Why it doesnt work?
 */
/*    @Override
    public int compareTo(Box o1, Box o2) {
        return Double.compare(o1.getTotalWeight(), o2.getTotalWeight());
    }*/
}
