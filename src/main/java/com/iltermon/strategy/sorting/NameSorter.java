package com.iltermon.strategy.sorting;

import java.util.Collections;
import java.util.List;

public class NameSorter implements Sorter {

    @Override
    public List<Student> sort(List<Student> list) {
        Collections.sort(list, Student.Comparators.NAME);
        return list;
    }
    
}

