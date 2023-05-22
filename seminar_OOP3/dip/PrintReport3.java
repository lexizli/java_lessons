package ru.geekbrains.lesson6.dip;

import java.util.List;

public class PrintReport3 implements Print {


    public void printAll(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }

    @Override
    public void print(List<ReportItem> items) {
        printAll(items);
    }
}
