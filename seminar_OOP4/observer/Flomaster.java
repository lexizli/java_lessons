package seminar_OOP4.observer;

public class Flomaster  implements Observer {

    private String name;
    private double salary;
    private static Enum vacancyType;

    public Flomaster(String name) {
        this.name = name;
        salary = 77777;
    }

    public Flomaster(String name, Enum vacancyType) {
        this.vacancyType = vacancyType;
        this.name = name;
        salary = 66666;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.salary < salary){
            System.out.printf("\tФломастер %s —> мне нужна эта работа!\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Фломастер %s — найду работу получше\t\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void receiveOfferVacancy(String nameCompany, String nameVacancy, double salary, Enum vacancyType) {
        if (this.salary < salary &&  Flomaster.vacancyType == vacancyType){
                System.out.printf("\tФломастер %s —> мне нужна эта вакансия!\t·%s - %,.0f·\n",
                        name, nameCompany, salary);
                this.salary = salary;
            }
            else{
                System.out.printf("Фломастер %s — найду вакансию получше\t·%s - %,.0f·\n",
                        name, nameCompany, salary);
            }

    }

}