package OOP_hw6;

import java.io.FileWriter;
import java.io.IOException;

class OutputToConsole implements Output {

    // @Override
    public void outputData(Order order) {
        System.out.println("Клиент " + order.getClientName() +
                " заказал " + order.getProduct() +
                " в количестве " + order.getQnt() + " штук " +
                " по цене " + order.getPrice() + "руб. на сумму " + order.getQnt() * order.getPrice() + "\n");
    }
}
