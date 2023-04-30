package OOP_hw4;

import java.util.ArrayList;

class Box<T extends Fruit>{

    private ArrayList<T> fruits;
    private float totalWeight;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public int getFruits() {
        return fruits.size();
    }

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public float getTotalWeight() {
        return totalWeight;
    }

    public void addFruit(T fruit){
        fruits.add(fruit);
        totalWeight = totalWeight + fruit.getWeight();
    }
    
    public void addFruit(T fruit, int n){
        for (int i = 0; i < n; i++) {
            addFruit(fruit);
        }
    }

    public void removeFruit(T fruit){
        fruits.remove(fruit);
        totalWeight = totalWeight - fruit.getWeight();
    }

    public void removeFruit(T fruit, int n){
        for (int i = 0; i < n; i++) {
            removeFruit(fruit);
        }
    }

    public void Move(Box<T> otherBox) {
        if (otherBox == this) {
            return;
        }
        for (T fruit : this.fruits) {
            otherBox.addFruit(fruit);
        }
        this.fruits.clear();
        this.totalWeight = 0f;
    }

    public boolean compare(Box<?> otherBox){
        return (Math.abs(this.totalWeight - otherBox.getTotalWeight()) < 0.01f);
    }

}
