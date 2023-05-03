package OOP_hw5.models;

import OOP_hw5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {


    private Collection<Table> tables;


    /**
     * Получение списка всех столиков
     * @return столики
     */
    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());

        }
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table : tables){
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
        //throw new RuntimeException("Невозможно забронировать столик.");
    }

    //ToDo: Разработать самостоятельно в рамках домашней работы
    /**
     * Перебронирование столика
     * @param oldReservation Номер резервирования, которое нужно изменить
     * @param reservationDate Дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер брони
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){  

        for (Table table : tables){
            table.getReservations().removeIf(n -> (n.getId() == oldReservation));  // удаляем старое резервирование
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
                return -1;
    }

    /**
     * Для отладки
     */
    public void outputTables() {

        for (Table table : tables){
            System.out.println(table);
            System.out.println(table.getReservations());
        }
    }

}
