package projectsHandsOn.generics.BoxOfFruits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Warehouse {
    private final List fruitStorage = new ArrayList<>();

    public void storeBox(Box fruit){
        try {
            if (fruit.getFruitCount() <= 0){
                throw new EmptyWeightException("Not enough fruits in a Box");
            }else {
                fruitStorage.add(fruit);
            }
        } catch (EmptyWeightException e) {
            System.out.println(e.getMessage());
        }

    }

    public void sortByCount(){
        Collections.sort(fruitStorage, byFruitCount);
    }

    public static Comparator<? super Box<?>> byFruitCount = new Comparator<>() {
        @Override
        public int compare(Box<?> o1, Box<?> o2) {
            return o1.getFruitCount() - o2.getFruitCount();
        }
    };
}
