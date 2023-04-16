package seminar_OOP1;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product: products) {
            if (product instanceof BottleOfWater){
                BottleOfWater bottle = ((BottleOfWater)product);
                if (bottle.name.equals(name) && bottle.getVolume() == volume)
                    return bottle;
            }
        }
        return null;
    }

    public BottleOfMilk getBottleOfMilk(String name, double volume){
        for (Product product: products) {
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottle = ((BottleOfMilk)product);
                if (bottle.name.equals(name) && bottle.getVolume() == volume)
                    return bottle;
            }
        }
        return null;
    }

    public PackOfSnacks getPackOfSnacks(String name, int weight){
        for (Product product: products) {
            if (product instanceof PackOfSnacks){
                PackOfSnacks pack = ((PackOfSnacks)product);
                if (pack.name.equals(name) && pack.getWeight() == weight)
                    return pack;
            }
        }
        return null;
    }


}
