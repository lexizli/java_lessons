package seminar_OOP4.observer;

import seminar_OOP4.observer.Company.VacancyType;

public class Program {

    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        // Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        // VacancyType vacancy = VacancyType.SERVER;

        // Company vacancy = new Company("Yandex", "Платон", 180000, jobAgency, VacancyType.SERVER);

        Master ivanov = new Master("Ivanov", VacancyType.MOOVER);
        Flomaster petrov = new Flomaster("Petrov", VacancyType.SERVER);
        Student sidorov = new Student("Sidorov", VacancyType.SERVER);

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);

        for(int i = 0; i < 10; i++){
            // geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
            yandex.vacancy(VacancyType.SERVER);
            google.vacancy(VacancyType.MOOVER);
        }

    }

}
