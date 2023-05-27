package seminar_OOP4.observer;

public interface Observer {

    void receiveOffer(String nameCompany, double salary);
    void receiveOfferVacancy(String nameCompany, String nameVacancy, double salary, VacancyType vacancyType);

}
