package OOP_hw5.views;

import OOP_hw5.models.Table;
import OOP_hw5.presenters.View;
import OOP_hw5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {


    private ViewObserver observer; // наблюдатель

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    public void setObserver(ViewObserver observer){
        this.observer = observer;
    }


    /**
     * Отобразить список всех столиков
     * @param tables столики
     */
    public void showTables(Collection<Table> tables){
        for (Table table: tables) {
            System.out.print(table.toString()+ "\n");
        }
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование
     * столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    public void reservationTable(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    /**
     * ToDo: Доработать метод в рамках домашней работы
     * Действие клиента (пользователь нажал на кнопку изменения бронирования),
     * изменение бронирования столика
     * @param oldReservation старый номер бронирования
     * @param reservationDate новая дата бронирования
     * @param tableNo номер столика
     * @param name имя клиета
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onChangeReservationTable(oldReservation,reservationDate, tableNo, name);

    }

    /**
     * Отобразить результат бронирования столика
     * @param reservationId номер брони
     */
    public void showReservationTableStatus(int reservationId,  int tableNo, String name){
        if (reservationId > 0){
            System.out.printf("Столик успешно забронирован.\nНомер брони: #%d\nНомер столика: %d\nИмя клиента: %s\n", reservationId,   tableNo,  name);
        }
        else {
            System.out.println("Ошибка бронирования столика.\nПовторите попытку позже.");
        }
    }
    /**
     * Отобразить результат перебронирования столика
     * @param reservationId номер брони
     */
    public void showChangeReservationTableStatus(int reservationId,  int tableNo, String name){
        if (reservationId > 0){
            System.out.printf("Столик успешно перебронирован.\nНовый номер брони: #%d\nНомер столика: %d\nИмя клиента: %s\n", reservationId,   tableNo,  name);
        }
        else {
            System.out.println("Ошибка бронирования столика.\nПовторите попытку позже.");
        }
    }


}
