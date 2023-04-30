/**
 Домашняя работа, задача:
 ========================

 a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 c. Для хранения фруктов внутри коробки можно использовать ArrayList;
 d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
 вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
 подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
 Можно сравнивать коробки с яблоками и апельсинами;
 f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 g. Не забываем про метод добавления фрукта в коробку.
 */

package OOP_hw4;

public class Main {
    public static void main(String[] args) {

        Box<Apple> apples = new Box<>();
        Box<Apple> applesTwo = new Box<>();
        Box<Orange> oranges = new Box<>();

        apples.addFruit(new Apple(), 14);
        apples.addFruit(new Apple());
        oranges.addFruit(new Orange(), 10);
        System.out.printf("Weight of box apples  = %5.2f, fruits number = %d\n", apples.getTotalWeight(),
                apples.getFruits());
        System.out.printf("Weight of box applesTwo  = %5.2f, fruits number = %d\n", applesTwo.getTotalWeight(),
                applesTwo.getFruits());
        System.out.printf("Weight of box oranges  = %5.2f, fruits number = %d\n", oranges.getTotalWeight(),
                oranges.getFruits());

        System.out.println("appleBox vs orangeBox : " + apples.compare(oranges));
        System.out.println("Moving apples from box apples to box applesTwo ");
        apples.Move(applesTwo);

        System.out.printf("Weight of box apples  = %5.2f, fruits number = %d\n", apples.getTotalWeight(),
                apples.getFruits());
        System.out.printf("Weight of box applesTwo  = %5.2f, fruits number = %d\n", applesTwo.getTotalWeight(),
                applesTwo.getFruits());

    }
}
