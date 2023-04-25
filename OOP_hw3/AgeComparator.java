package OOP_hw3;
    
    import java.util.Comparator;

    class AgeComparator implements Comparator<Employer>{
    
        @Override
        public int compare(Employer o1, Employer o2) {
    
            return Integer.compare(o1.age, o2.age);

        }
    }
