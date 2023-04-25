package OOP_hw3;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employer> {

    @Override
    public int compare(Employer o1, Employer o2) {

        return Integer.compare(o1.department, o2.department);

    }
}
