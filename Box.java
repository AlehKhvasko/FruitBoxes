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

    public double getWeight(){
        return totalWeight;
    }



    @Override
    public int compareTo(Box<?> other) {
        int compareResult = ((Double)this.totalWeight).compareTo((Double)other.getTotalWeight());
        return compareResult;
    }
}
