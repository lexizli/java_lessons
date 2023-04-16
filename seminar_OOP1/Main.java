package seminar_OOP1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        Product bottleOfWater1 = new BottleOfWater("Архыз", "Архыз", 100, 2);
        Product bottleOfMilk1 = new BottleOfMilk("«Волмол»", "Молоко вологодское", 84.75, 0.96, 3.2);
        Product bottleOfWater2 = new BottleOfWater("«Рик»", "Ессентуки 4", 100, 1);
        Product bottleOfWater3 = new BottleOfWater("Evian", "Evian", 100, 2);
        Product bottleOfWater4 = new BottleOfWater("Perrier", "Perrier", 345, 0.75);

        Product PackOfSnacks1 = new PackOfSnacks("Жевульки", "Hot chips", 46, 29, "Hot");
        Product PackOfSnacks2 = new PackOfSnacks("Жевульки", "Синепузик", 52, 31, "Solt");
        Product PackOfSnacks3 = new PackOfSnacks("Сосульки", "Кубики", 39, 29, "Sweet");
        Product PackOfSnacks4 = new PackOfSnacks("Сосульки", "Шарики", 39, 29, "Sweet");

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(PackOfSnacks1);
        products.add(PackOfSnacks2);
        products.add(PackOfSnacks3);
        products.add(PackOfSnacks4);

        for (Product product : products) {
            System.out.println(product.displayInfo());

        }

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfMilk bottleRes = vendingMachine.getBottleOfMilk("Молоко вологодское", 0.96);
        if (bottleRes != null) {
            System.out.print("\nВы купили: ");
            System.out.println(bottleRes.displayInfo());
        } else {
            System.out.println("Такого товара нет в автомате.");
        }

        PackOfSnacks pack1 = vendingMachine.getPackOfSnacks("Кубики", 29);
        if (pack1 != null) {
             System.out.println(pack1.displayInfo());
        } else {
            System.out.println("Такого товара нет в автомате.");
        }

        PackOfSnacks pack2 = vendingMachine.getPackOfSnacks("Синепузик", 31);
        if (pack2 != null) {
            System.out.println(pack2.displayInfo());
        } else {
            System.out.println("Такого товара нет в автомате.");
        }

    }
}