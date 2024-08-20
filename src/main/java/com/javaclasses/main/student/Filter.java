package com.javaclasses.main.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Filter {
    private List <Student> students;

    public Filter (List <Student> students) {
        this.students = students;
    }

    public ArrayList<Student> studentsOfFacultet () {
        ArrayList<Student> facultetStudents = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Facultet:" + "\n 1.UPP" + "\n 2.PGS" + "\n 3.MTF" + "\n 4.EF" + "\n 5.AF");
        int ordinal = sc.nextInt();
        for (Student student : students) {
            if (student.getFacultet() == Facultet.values()[ordinal - 1]) {
                facultetStudents.add(student);
            }
        }
        return facultetStudents;
    }

    public ArrayList<Student> studentsOfFacultetAndCource () {
        ArrayList<Student> facultetAndGroupStudents = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Facultet:" + "\n 1.UPP" + "\n 2.PGS" + "\n 3.MTF" + "\n 4.EF" + "\n 5.AF");
        int ordinal = sc.nextInt();
        System.out.println("Select Cource:");
        byte cource = (byte) sc.nextInt();
        for (Student student : students) {
            if (student.getFacultet() == Facultet.values()[ordinal - 1] && student.getCource() == cource) {
                facultetAndGroupStudents.add(student);
            }
        }
        return facultetAndGroupStudents;
    }

    public ArrayList<Student> studentsBirthday () {
        ArrayList<Student> studentsBirthday = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year of birth:");
        String year = sc.next();
        for (Student student : students) {
            if (student.getBirthday().getYear().equals(year)) {
                studentsBirthday.add(student);
            }
        }
        return studentsBirthday;
    }

    public ArrayList<Student> studentsGroup () {
        ArrayList<Student> studentsGroup = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the group");
        String group = sc.next();
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                studentsGroup.add(student);
            }
        }
        return studentsGroup;
    }

    @Override
    public String toString() {
        return "Filter{" +
                "students=" + students +
                '}';
    }
}
