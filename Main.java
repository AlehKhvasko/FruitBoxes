package projectsHandsOn.generics.BoxOfFruits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        Box<Apple> appleBox1 = new Box();
        appleBox1.addFruit(new Apple());
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        List list = new ArrayList();
        list.add(appleBox);
        list.add(appleBox1);
        list.add(orangeBox);
        Collections.sort(list, byFruitCount);
        appleBox.toSprinkleBox(appleBox1);
        Collections.sort(list, byFruitCount);
    }

    public static Comparator<? super Box<?>> byFruitCount = new Comparator<>() {
        @Override
        public int compare(Box<?> o1, Box<?> o2) {
            return o2.getFruitCount() - o1.getFruitCount();
        }
    };

}
