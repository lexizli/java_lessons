package seminar_OOP4.observer;

public class Flomaster implements VacancyObserver {

    private String name;
    private double salary;
    private static VacancyType vacancyType;

    public Flomaster(String name) {
        this.name = name;
        salary = 77777;
    }

    @Override
    public VacancyType getVacancyType() {
        return vacancyType;
    }

    public Flomaster(String name, VacancyType vacancyType) {
        Flomaster.vacancyType = vacancyType;
        this.name = name;
        salary = 66666;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.salary < salary) {
            System.out.printf("\tФломастер %s —> мне нужна эта работа!\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
            this.salary = salary;
        } else {
            System.out.printf("Фломастер %s — найду работу получше\t\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void receiveOfferVacancy(String nameCompany, String nameVacancy, double salary, VacancyType vacancyType) {
        if (Flomaster.vacancyType == vacancyType){
            if (this.salary < salary){
                System.out.printf("\tФломастер %s —> мне нужна эта вакансия!\t·%s - %,.0f·\n",
                        name, nameCompany, salary);
                this.salary = salary;
            }
            else {
                System.out.printf("Фломастер %s — найду вакансию получше\t·%s - %,.0f·\n",
                        name, nameCompany, salary);
            }
        }
        else{
            System.out.printf("——— Фломастер %s —> мне не подходит вакансия %s\n",  name, vacancyType);
         }
    }

}