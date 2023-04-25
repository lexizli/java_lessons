package OOP_hw3;

import java.util.Arrays;

public class Main {

    public static String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим",
            "Панкратий", "Рубен", "Герман" };
    public static String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков",
            "Копылов", "Горбунов", "Лыткин", "Соколов" };

    public static void main(String[] args) {

        Employer[] employees = new Employer[10];

        for (int i = 0; i < employees.length; i++) {
            String name;
            String surname;
            while (true) {

                name = names[(int) (Math.random() * 10)];
                surname = surnames[(int) (Math.random() * 10)];
                boolean goodName = true;
                if (i > 0) {
                    for (int emp = 0; emp < i; emp++) {
                        if (employees[emp].compareFullName(name, surname)) {
                            goodName = false;
                        }
                    }

                }
                if (goodName) {
                    break;
                }
            }
            // if (goodName) {
            employees[i] = generateEmployer(name, surname);
            // }
        }

        for (Employer employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new AgeComparator());

        System.out.println("\n\tEmployers sorted by age\n");

        for (Employer employee : employees) {
            System.out.println(employee);
        }

        // Arrays.sort(employees, new DepartmentComparator());
        Arrays.sort(employees, new DepartmentComparator().thenComparing(new AgeComparator()));

        System.out.println("\n\tEmployers sorted by department and age\n");

        for (Employer employee : employees) {
            System.out.println(employee);
        }

    }

//     public static Employer generateEmployer(String newName, String newSurname) 
//  {

//         /*
//          * 
//          * Not working :-(
//          * 
//          */

//         int salary = (int) (Math.random() * 600) + 900;
//         int salaryIndex = (int) (Math.random() * 4) + 28;
//         int department = (int) (Math.random() * 4) + 1;
//         int age = (int) (Math.random() * 49) + 16;

//             Class<? extends Employer>[] mySubclasses = new Class[]{Worker.class, Freelancer.class};
//             int randomIndex = (int) (Math.random() * 2);
//             Constructor<? extends Employer> constructor = mySubclasses[randomIndex].getConstructor();
//             Object[] arguments = new Object[]{};
//             Employer employer = (Employer) constructor.newInstance(newName, newSurname, department, age, salary * salaryIndex);
//             return employer;

//     }

    public static Employer generateEmployer(String newName, String newSurname) {
    /*
    * Too simple
    * But
    */

    int salary = (int) (Math.random() * 600) + 900;
    int salaryIndex = (int) (Math.random() * 4) + 28;
    int department = (int) (Math.random() * 4) + 1;
    int age = (int) (Math.random() * 49) + 16;

    if (Math.random() > 0.51) {
    return new Worker(newName, newSurname, department, age,
    salary * salaryIndex);
    } else {
    return new Freelancer(newName, newSurname, department, age,
    salary * salaryIndex);

    }

    }

}
