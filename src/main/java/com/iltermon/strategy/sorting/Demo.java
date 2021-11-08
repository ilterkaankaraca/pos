package sorting;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Sorter numberSorter = new NumberSorter();
        Sorter nameSorter = new NameSorter();
        // add students to the list
        students.add(new Student(000003, "B"));
        students.add(new Student(000001, "C"));
        students.add(new Student(000004, "D"));
        students.add(new Student(000000, "Z"));
        students.add(new Student(000002, "K"));

        // sort the list by numbers and print it.
        numberSorter.sort(students);
        System.out.println("List is sorted by number");
        for (Student student : students) {
            System.out.println(student.toString());
        }
        
        // sort the list by names and print it.
        nameSorter.sort(students);
        System.out.println("\nList is sorted by name");
        for (Student student : students) {
            System.out.println(student.toString());
        }

    }
}
