package OOP_hw5;

import OOP_hw5.models.TableModel;
import OOP_hw5.presenters.BookingPresenter;
import OOP_hw5.views.BookingView;

import java.util.Date;

public class Main {

    /**
     * ToDo: домашняя работа
     * Метод changeReservationTable должен заработать!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);

        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        view.reservationTable(new Date(), 2, "Станислав");

        model.outputTables();
        
        view.showReservationTableStatus(1001, 2, "Станислав");

        view.changeReservationTable(1001, new Date(), 3, "Станислав");

         model.outputTables();

    }

}