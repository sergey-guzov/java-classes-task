package com.javaclasses.main.student;

import java.util.ArrayList;
import java.util.List;

public class StudentsList {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public StudentsList() {
        students = new ArrayList<>();
    }
    public void addStudent (Student student) {
        students.add(student);
    }

}
