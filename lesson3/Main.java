package lesson3;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class Main {

    class Employer {

    }

    class Worker extends Employer {
        public Worker() {
        }
    }

    class Freelancer extends Employer {
        public Freelancer() {
        }
    }

    public static void main(String[] args) throws java.lang.Exception {

        Employer test = generateEmployer();
        System.out.println(test);

    }

    public static Employer generateEmployer() {

     
        Class<? extends Employer>[] classes = new Class[] { Worker.class, Freelancer.class };

        int ind = (int) (Math.random() * 3);
        Constructor<? extends Employer> constructor = classes[ind].getConstructor();
        Object[] arguments = new Object[] {};
        
        Employer animal = (Employer) constructor.newInstance(arguments);
        return animal;

    }
}
