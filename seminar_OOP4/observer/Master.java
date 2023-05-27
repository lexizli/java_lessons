package seminar_OOP4.observer;

public class Master implements Observer {

    private String name;
    private double salary;
    private static VacancyType vacancyType;

    public Master(String name) {
        this.name = name;
        salary = 80000;
    }

    public Master(String name, VacancyType vacancyType) {
        Master.vacancyType = vacancyType;
        this.name = name;
        salary = 55555;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.salary < salary) {
            System.out.printf("\tСпециалист %s —> мне нужна эта работа!\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
            this.salary = salary;
        } else {
            System.out.printf("Специалист %s — найду работу получше\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void receiveOfferVacancy(String nameCompany, String nameVacancy, double salary, VacancyType vacancyType) {
        if (Master.vacancyType == vacancyType){
        if (this.salary < salary){
            System.out.printf("\tСпециалист %s —> мне нужна эта вакансия!\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Специалист %s — найду вакансию получше\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
        }
    }
    else{
            System.out.printf("——— Специалист %s —> мне не подходит вакансия %s\n",  name, vacancyType);
         }
    }
    

}
