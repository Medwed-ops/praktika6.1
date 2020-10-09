package ru.mirea.lab6.task2;

import ru.mirea.lab6.task1.Student;
import ru.mirea.lab6.task2.SortingStudentsByGPA;

public class TestGPA {
    public static void main(String[] args) {
        Student[] students = {new Student(4), new Student(5), new Student(3), new Student(1), new Student(2)};
        SortingStudentsByGPA.gPASort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
