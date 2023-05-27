package seminar_OOP4.observer;

import java.util.Random;

/**
 * Компания
 */
public class Company {

    private Random random;
    private String nameCompany;
    private double maxSalary;
    private String nameVacancy;
    private Publisher jobAgency;

    public enum VacancyType{
        PROGRAMMER,
        PRESIDENT,
        SERVER,
        MOOVER
    }

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    public Company(String nameCompany, String nameVacancy, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        this.nameVacancy = nameVacancy;
        random = new Random();
    }

    public Company(String string, String string2, int i, JobAgency jobAgency2, VacancyType vacancy) {
    }

    public void needEmployee(){
        double salary = maxSalary * random.nextDouble();
        jobAgency.sendOffer(nameCompany, salary);
    }

    public void vacancy(VacancyType vacancy){
        double salary = maxSalary * random.nextDouble();
        // VacancyType vacancy = VacancyType.SERVER;
        
        jobAgency.sendOfferVacancy(nameCompany, nameVacancy, salary, vacancy);
    }

}
