package seminar_OOP2;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", "Рыжий");
        cat1.voice();
        cat1.jump();
        ((Animal) cat1).jump();
        System.out.printf("Имя животного: %s\n", cat1.getName());

        Object cat2 = new Cat("Персик", "Рыжий");
        ((Animal) cat2).voice();
        ((Animal) cat2).jump();
        ((Cat) cat2).jump();

        System.out.printf("Имя животного: %s\n", ((Animal) cat2).getName());
        System.out.printf("Цвет котика: %s\n", ((Cat) cat2).getColor());

        Dog dog1 = new Dog("Шарик", 9);
        dog1.voice();
        dog1.jump();
        Animal dog2 = new Dog("Бублик", 3);
        System.out.printf("Имя животного: %s\n", dog1.getName());
        if (dog2 instanceof Cat) {
            System.out.printf("Цвет котика: %s\n", ((Cat) dog2).getColor());
        }

        CatV2 catV2_1 = new CatV2();
        CatV2 catV2_2 = new CatV2();
        DogV2 dogV2_1 = new DogV2();
        Bird bird1 = new Bird();

        Object[] animals = new Object[] { catV2_1, catV2_2, dogV2_1, bird1 };

        for (Object animal : animals) {
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly(100);
            }
        }

    }

}

interface Runnable {

    void swim(int distance);

    void run(int distance);

}

interface Flyable {

    void fly(int distance);

}

class CatV2 implements Runnable {

    @Override
    public void swim(int distance) {

    }

    @Override
    public void run(int distance) {

    }
}

class DogV2 implements Runnable {

    @Override
    public void swim(int distance) {

    }

    @Override
    public void run(int distance) {

    }
}

class Bird implements Runnable, Flyable {

    @Override
    public void swim(int distance) {

    }

    @Override
    public void run(int distance) {

    }

    @Override
    public void fly(int distance) {
        System.out.println("Птичка полетела.");
    }
}

abstract class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void jump() {
        System.out.println("Животное прыгает.");
    }

    public abstract void voice();

}

class Cat extends Animal {

    private String color;

    public String getColor() {
        return color;
    }

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void jump() {
        System.out.println("Котик прыгает.");
    }

    @Override
    public void voice() {
        System.out.println("Котик мяукает.");
    }
}

class Dog extends Animal {

    private int weight;

    public int getWeight() {
        return weight;
    }

    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public void jump() {
        System.out.println("Собака прыгает.");
    }

    @Override
    public void voice() {
        System.out.println("Собака лает.");
    }
}