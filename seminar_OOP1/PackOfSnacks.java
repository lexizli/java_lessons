package seminar_OOP1;

public class PackOfSnacks extends Product{

    private int weight;     // вес в граммах
    private String taste; // вкус 

    public int getWeight() {
        return weight;
    }

    public String getTaste() {
        return taste;
    }

    public PackOfSnacks(String brand, String name, double price, int weight, String taste){
        super(brand, name, price);
        this.weight = weight;
        this.taste = taste;
    }

    @Override
    public String displayInfo() {
        // return super.displayInfo();
        return String.format("----------------------------------------------------------------\n%s %10s %12.2f руб., вес %d г., вкус — %s",
                brand, name, price, weight, taste);
    }
}


