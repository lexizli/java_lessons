// package homework1;

// import java.lang.reflect.Constructor;
// import java.util.Random;

// public class Animal {

// }

// class Cat extends Animal{
//     public Cat(){}
// } 
// class Dog extends Animal{
//     public Dog(){}
// } 
// class Bird extends Animal{
//     public Bird(){}
// }


// class Main
// {
//     public static void main (String[] args) throws java.lang.Exception
//     {
//         Class<? extends Animal>[] classes = new Class[]{ Cat.class,  Dog.class, Bird.class };

//         Random r = new Random();
//         int ind = r.nextInt(3);

//         Constructor<? extends Animal> constructor = classes[ind].getConstructor();

//         Object[] arguments = new Object[]{};

//         Animal animal = (Animal) constructor.newInstance(arguments);
        
//         System.out.println(animal);

//     }
// }