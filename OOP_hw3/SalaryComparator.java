package OOP_hw3;

import java.util.Comparator;

class SalaryComparator implements Comparator<Employer>{

    @Override
    public int compare(Employer o1, Employer o2) {

        return Double.compare(o2.calculateSalary(), o1.calculateSalary());

    }
}
