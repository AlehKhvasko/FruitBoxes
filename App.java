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
        System.out.println(appleBox1.compareTo(orangeBox));
        //Add fruitBoxes into main Box
        FruitBoxes mainBox = new FruitBoxes();
        mainBox.addBoxOfFruit(appleBox);
        mainBox.addBoxOfFruit(appleBox1);
        mainBox.addBoxOfFruit(orangeBox);
        mainBox.displayBoxes();
        //Display Boxes
    }


}
