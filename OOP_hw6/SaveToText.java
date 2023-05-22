package OOP_hw6;

import java.io.FileWriter;
import java.io.IOException;

class SaveToText implements Output {

    // @Override
    public void outputData(Order order) {
        String fileName = "order.txt";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("Клиент " +  order.getClientName());
            writer.write(" заказал " + order.getProduct());
            writer.write(" в количестве " + order.getQnt() + " штук ");
            writer.write( " по цене " + order.getPrice() + "руб. на сумму " + order.getQnt() * order.getPrice() + "\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
