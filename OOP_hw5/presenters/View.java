package OOP_hw5.presenters;

import OOP_hw5.models.Table;

import java.util.Collection;

public interface View {

    /**
     * Отобразить список всех столиков
     * @param tables столики
     */
    void showTables(Collection<Table> tables);

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);

    /**
     * Отобразить результат бронирования столика
     * @param reservationId номер брони
     */
    void showReservationTableStatus(int reservationId,   int tableNo, String name);

    /**
     * Отобразить результат перебронирования столика
     * @param reservationId номер брони
     */
    void showChangeReservationTableStatus(int reservationId,   int tableNo, String name);

}
