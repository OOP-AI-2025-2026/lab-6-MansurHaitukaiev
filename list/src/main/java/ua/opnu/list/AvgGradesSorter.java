package ua.opnu.list;

import java.util.Comparator;

public class AvgGradesSorter implements Comparator {
    private boolean order;

    public AvgGradesSorter(boolean order) {
        this.order = order;
    }

    @Override
    public int compare(Object object1, Object object2) {
        if (object1 instanceof Student && object2 instanceof Student) {
            Student student1 = (Student) object1;
            Student student2 = (Student) object2;

            int cmp = Double.compare(student1.getAvgMark(), student2.getAvgMark());
            if (order) {
                return cmp;
            } else {
                return -cmp;
            }
        }
        return 0;
    }
}