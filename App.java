package projectsHandsOn.generics.BoxOfFruits;

public class App {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        Box<Apple> appleBox1 = new Box();
        appleBox1.addFruit(new Apple());
        System.out.println(appleBox.getWeight());
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        //implementing compareTo method
        appleBox1.compareBoxes(orangeBox);
        appleBox1.compareBoxes(appleBox);
        //Add fruitBoxes into main Box
        FruitBoxes mainBox = new FruitBoxes();
        mainBox.addBoxOfFruit(appleBox);
        mainBox.addBoxOfFruit(appleBox1);
        mainBox.addBoxOfFruit(orangeBox);
        //Display Boxes
        mainBox.displayBoxes();
    }


}
