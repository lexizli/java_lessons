package OOP_hw3;

import java.util.Comparator;

class SurNameComparator implements Comparator<Employer>{

    @Override
    public int compare(Employer o1, Employer o2) {

        return o1.surname.compareTo(o2.surname);
    }

}