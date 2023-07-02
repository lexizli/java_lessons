package prom_attest1;

public class Toy  {
    private int id;
    private String name;
    private double probability;
    private int quantity;

    public  Toy(int id, String name, double probability, int quantity ) {
        this.id = id;
        this.name = name;
        this.probability = probability;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getWinningScore() {
        return probability * quantity;
    }

    
    @Override
    public String toString() {
        return "ID: " + id + ", Наименование: " + name + ", Вероятность выигрыша: " + probability + ", Количество: " + quantity;
    }
  
}
