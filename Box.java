package projectsHandsOn.generics.BoxOfFruits;

import java.util.ArrayList;

public class Box <T extends Fruit>  implements Comparable<Box<?>>  {

    private ArrayList<T> fruits = new ArrayList<>();
    private double totalWeight;

    public String getName() {
        return fruits.get(0).getName();
    }

    public int getNumberOfFruits() {
        return fruits.size();
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void addFruit(T fruit){
        try {
            if (fruit.getWeight() > 0){
                fruits.add(fruit);
            }
            else {
                throw new EmptyWeightException("Empty weight field");
            }
        }
        catch (EmptyWeightException e){
            System.out.println(e);
        }
        totalWeight += fruit.getWeight();
    }

    /**
     * not finished
     * Question how to create dynamic types of objects in runtime AKA polymorphism.
     * @param
     */
  /*  public void toEmptyBox(Box<T> box){
        for (int i = 0; i < box.getNumberOfFruits(); i++) {
            box.addFruit((T) new <Apple>());
            fruits.remove(fruits.size());
        }
    }*/

    public double getWeight(){
        return totalWeight;
    }
    /**
     * useless lines of code?
     */
    public void compareBoxes(Box<?> box){
        int result = compareTo(box);
        if (result > 0){
            System.out.println(this.getName() + " is greater.");
        } else if (result == 0){
            System.out.println(this.getName() + " is equal.");
        } else if (result < 0){
            System.out.println(this.getName() + " is less.");
        }
    }

    @Override
    public int compareTo(Box<?> other) {
        int compareResult = ((Double)this.totalWeight).compareTo((Double)other.getTotalWeight());
        return compareResult;
    }
}
