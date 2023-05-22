package OOP_hw6;

public class Main {

        /**
     * TODO: Домашняя работа (программа 1),
     *  оптимизировать приложение в соответствии с принципом SOLID - SRP
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Укажите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();

        Output toJson = new SaveToJson();
        Output toText = new SaveToText();
        Output toConsole = new OutputToConsole();

        toJson.outputData(order);
        toText.outputData(order);
        toConsole.outputData(order);

    }
    
}
