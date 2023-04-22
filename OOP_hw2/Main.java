package OOP_hw2;

public class Main {
    
    public static void main(String[] args) {

        Bowl kittensBowl = new Bowl();
        Cat stupidCat = new Cat("Stupid", 75);
        Cat differentCat = new Cat("Pupsik", 123);

        kittensBowl.addFood(123);
        kittensBowl.addFood(75);
        kittensBowl.info();

        // stupidCat.eat(kittensBowl.getFood());

        // kittensBowl.info();
        // stupidCat.info();

        // differentCat.eat(kittensBowl.getFood());

        // kittensBowl.info();
        // differentCat.info();

        // stupidCat.eat(kittensBowl.getFood());

        // kittensBowl.info();
        // stupidCat.info();

        // differentCat.eat(kittensBowl.getFood());

        // kittensBowl.info();
        // differentCat.info();


        // stupidCat.eat(kittensBowl.getFood());

        // kittensBowl.info();
        // stupidCat.info();

        // differentCat.eat(kittensBowl.getFood());

        // kittensBowl.info();
        // differentCat.info();


        Cat[] cats = new Cat[] { stupidCat, differentCat };

        while (kittensBowl.getFood() > 0) {
            for (Cat cat : cats) {
                cat.eat(kittensBowl.getFood());
                cat.info();
            }
            kittensBowl.info();

        }



        }

        
    }
