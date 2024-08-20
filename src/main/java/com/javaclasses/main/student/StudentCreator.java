package com.javaclasses.main.student;

import java.util.Scanner;

public class StudentCreator {

    public Student createStudenName () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name, SecondName, Surname using comma");
        String fullName = sc.nextLine().toUpperCase().replaceAll("\\s+", "");
        String[] arr = fullName.split(",");
        String firstName = arr[0];
        String secondName = arr[1];
        String sureName = arr[2];
        return new Student(firstName,secondName,sureName);

    }

    public void addAddress (Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter City, Street, House, Appartment using comma");
        String fullAddress = sc.nextLine().toUpperCase().replaceAll("\\s+", "");
        String[] arrAddress = fullAddress.split(",");
        student.setAdress(student.new Adress(arrAddress[0],arrAddress[1],arrAddress[2],arrAddress[3]));
    }
    public void addBirthday (Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter birthday in next format dd-mm-yyyy");
        String studentBirthday = sc.nextLine().toUpperCase().replaceAll("\\s+", "");
        String[] arrBirthday = studentBirthday.split("-");
        student.setBirthday(student.new Birthday(arrBirthday[0], arrBirthday[1], arrBirthday[2]));
    }

    public Student setFacultet (Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Facultet:" + "\n 1.UPP" + "\n 2.PGS"+ "\n 3.MTF" + "\n 4.EF" + "\n 5.AF");
        int ordinal = sc.nextInt();
        student.setFacultet(Facultet.values()[ordinal-1]);
        return student;
    }

    public Student setPhoneNumber (Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number in next forma +375XXXXXXXXX");
        student.setPhoneNumber(sc.nextLine().toUpperCase().replaceAll("\\s+", ""));
        return student;
    }
    public Student setGoup (Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a student's group");
        student.setGroup(sc.nextLine().toUpperCase().replaceAll("\\s+", ""));
        return student;
    }
    public Student setCource (Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a student course");
        student.setCource(sc.nextByte());
        return student;
    }

}

