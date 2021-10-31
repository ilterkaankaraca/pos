package sorting;

import java.util.Collections;
import java.util.List;

public class NumberSorter implements Sorter{
    @Override
    public List<Student> sort(List<Student> list) {
        Collections.sort(list, Student.Comparators.MATRICULATIONNUMBER);
        return list;
    }
}
