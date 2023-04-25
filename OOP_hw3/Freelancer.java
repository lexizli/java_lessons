package OOP_hw3;

class Freelancer extends Employer {

    public Freelancer(String firstName, String surname, int department, int age, double salary) {
        super(firstName, surname, department, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Freelancer:\t%s %-10s \t %5d \t%5d\tMonthly gross pay: \t%.2f",
        surname, firstName, department, age, calculateSalary());
    }

}
