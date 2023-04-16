package seminar_OOP1;

public class BottleOfWater extends Product {

    private double volume; // объем

    public double getVolume() {
        return volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume){
        super(brand, name, price);
        this.volume = volume;
    }

       @Override
    public String displayInfo() {
        //return super.displayInfo();
        return String.format("----------------------------------------------------------------\n%7s %11s %12.2f руб., объем %4.3f л.", brand, name, price, volume);
    }
}
