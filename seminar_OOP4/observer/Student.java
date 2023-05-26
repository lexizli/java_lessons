package seminar_OOP4.observer;

public class Student implements Observer {

    private String name;
    private double salary;
    private static Enum vacancyType;


    public Student(String name) {
        this.name = name;
        salary = 5000;
    }

    public Student(String name, Enum vacancyType) {
        this.vacancyType = vacancyType;
        this.name = name;
        salary = 5000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.salary < salary){
            System.out.printf("\tСтудент %s —> Мне нужна эта работа!\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Студент %s — найду работу получше\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void receiveOfferVacancy(String nameCompany, String nameVacancy, double salary, Enum vacancyType) {
        if (this.salary < salary &&  Student.vacancyType == vacancyType){
            System.out.printf("\tСтудент %s —> Мне очень нужна эта вакансия!\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Студент %s — найду вакансию получше\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
        }
    }

}
