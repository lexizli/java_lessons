package ru.geekbrains.lesson7.singleton;

public class Program {

    public static void main(String[] args) {

        Settings setting1 = Settings.getInstance();
        Settings setting2 = Settings.getInstance();
    }

}
