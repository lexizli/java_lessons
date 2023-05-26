package seminar_OOP4.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Агенство по поиску сотрудников
 */
public class JobAgency implements Publisher {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Реализация рассылки сообщений
     * @param nameCompany
     * @param salary
     */
    @Override
    public void sendOffer(String nameCompany, double salary) {
        for (Observer observer : observers){
            observer.receiveOffer(nameCompany, salary);
        }
    }

     /**
     * Реализация рассылки сообщений о вакансиях
     * @param nameCompany
     * @param nameVacancy
     * @param salary
     */
    @Override
    public void sendOfferVacancy(String nameCompany, String nameVacancy, double salary, Enum vacancy) {
        for (Observer observer : observers){
            observer.receiveOfferVacancy(nameCompany, nameVacancy, salary, vacancy);
        }
    }
}







