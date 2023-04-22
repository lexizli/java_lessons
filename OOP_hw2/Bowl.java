package OOP_hw2;

public class Bowl {
    protected static int food;

    public void addFood(int food){
        Bowl.food = Bowl.food + food;
    }

    public void food(int food){
        Bowl.food =  food;
    }

    public int getFood(){
        return Bowl.food;
    }

    public void info() {
        System.out.println("There are " + food + " food in bowl.");
    }

    
}
