package com.iltermon.strategy.sorting;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    int matriculationNumber;
    String name;

    public Student(int matriculationNumber, String name) {
        this.matriculationNumber = matriculationNumber;
        this.name = name;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return Comparators.NAME.compare(this, o);
    }

    public static class Comparators {

        public static Comparator<Student> NAME = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        };
        public static Comparator<Student> MATRICULATIONNUMBER = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.matriculationNumber - o2.matriculationNumber;
            }
        };
    }
    @Override 
    public String toString() {
        return "Student Name: " + this.name + " Matriculation Number: " + this.matriculationNumber;
    }
}
