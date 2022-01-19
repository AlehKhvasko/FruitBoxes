package projectsHandsOn.generics.BoxOfFruits;

import java.util.ArrayList;
import java.util.Collections;
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
        Box<Kiwi> kiwiBox = new Box<>();
            kiwiBox.addFruit(new Kiwi());
            kiwiBox.addFruit(new Kiwi());
            kiwiBox.addFruit(new Kiwi());
            kiwiBox.addFruit(new Kiwi());

        Warehouse fruitDeli = new Warehouse();
            fruitDeli.storeBox(appleBox);
            appleBox.toSprinkleBox(appleBox1);
            fruitDeli.storeBox(appleBox1);
            fruitDeli.storeBox(orangeBox);
            fruitDeli.storeBox(kiwiBox);
            fruitDeli.sortByCount();
            List list = new ArrayList();
            list.add(orangeBox);
            list.add(appleBox);
            Collections.swap(list,0,1);
            //Box.switchItems(fruitDeli.getFruitStorage(),0,1);
            Box.swapItems(list,0,1);
    }
}
