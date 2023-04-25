package OOP_hw3;

abstract class Employer implements Comparable<Employer> {

    protected String firstName;
    protected String surname;
    protected int department;
    protected int age;
    protected double salary;

    public Employer(String firstName, String surname, int department, int age, double salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    public abstract double calculateSalary();

    public boolean compareFullName(String newName, String newSurname) {
        if(this.firstName.equals(newName) && this.surname.equals(newSurname)) return true;
        return false;
    }

    @Override
    public String toString() {
        return String.format("Employer: %s %s %d %d; Salary: %.2f; Monthly gross pay: %.2f",
                surname, firstName, department, age, salary, calculateSalary());
    }

    @Override
    public int compareTo(Employer o) {
        return Double.compare(calculateSalary(), o.calculateSalary());
    }
}