package ru.geekbrains.lesson6.lsp;

public class Penguin extends Bird {


    public void fly() {
        throw new RuntimeException("Пингвин не умеет летать!");
    }


}
