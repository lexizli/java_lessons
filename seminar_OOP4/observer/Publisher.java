package seminar_OOP4.observer;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(String nameCompany, double salary);

    void sendOfferVacancy(String nameCompany, String nameVacancy, double salary, Enum vacancy);

}
