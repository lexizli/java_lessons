package seminar_OOP1;

public class BottleOfMilk extends Product {

    private double volume;
    private double fat;

    public double getVolume() {
        return volume;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, double fat){
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
        //return super.displayInfo();
        return String.format("----------------------------------------------------------------\n%s, %s жирность %3.1f%%, %4.2f руб., объем %4.3f л.", brand, name, fat, price, volume);
    }

}
