package OOP_hw2;

public class Cat {
    private String name;
    private int appetite;     // size of full stomack
    private int eatenFood;           //  eaten food;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getSpaceForFood() {
        return this.appetite - this.eatenFood;
    }

    public boolean getFull() {
        if (this.eatenFood == this.appetite ) return true;
        return false;
        }

    public void eat(int food){
        int eaten =  (int) (Math.random() * this.appetite);
        if (eaten > food) eaten = food;
        if (eaten > getSpaceForFood()) eaten = getSpaceForFood();
        this.eatenFood = this.eatenFood + eaten;

        Bowl.food -= eaten;

        System.out.println("Cat " + this.name + " eated " + eaten + " food.");
    }
    
    public void info() {
        System.out.println("Cat " + this.name + " has " + this.eatenFood + " food.");
        if (this.eatenFood == this.appetite ) System.out.println("Cat " + this.name + " ate to satiety!");
    }
    

}

