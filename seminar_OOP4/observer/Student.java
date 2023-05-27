package seminar_OOP4.observer;

public class Student implements VacancyObserver {

    private String name;
    private double salary;
    private static VacancyType vacancyType;


    public Student(String name) {
        this.name = name;
        salary = 5000;
    }

    public Student(String name, VacancyType vacancyType) {
        Student.vacancyType = vacancyType;
        this.name = name;
        salary = 5000;
    }

    @Override
    public VacancyType getVacancyType() {
        return vacancyType;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (this.salary < salary){
            System.out.printf("\tСтудент %s —> мне нужна эта работа!\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Студент %s — найду работу получше\t\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void receiveOfferVacancy(String nameCompany, String nameVacancy, double salary, VacancyType vacancyType) {
        if (Student.vacancyType == vacancyType){
        if (this.salary < salary){
            System.out.printf("\tСтудент %s —> мне очень нужна эта вакансия!\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Студент %s — найду вакансию получше\t·%s - %,.0f·\n",
                    name, nameCompany, salary);
        }
    }
    else{
            System.out.printf("——— Студент %s —> мне не подходит вакансия %s\n",  name, vacancyType);
         }
    }
    

}
