package com.javaclasses.main.student;
public class Main {
    public static void main(String[] args) {
       StudentCreator creator = new StudentCreator();
       Student student3 = creator.createStudenName();
       creator.addAddress(student3);
       creator.addBirthday(student3);
       creator.setFacultet(student3);
       creator.setCource(student3);
       creator.setGoup(student3);
       creator.setPhoneNumber(student3);
       Student student4 = creator.createStudenName();
       creator.addAddress(student4);
       creator.addBirthday(student4);
       creator.setFacultet(student4);
       creator.setCource(student4);
       creator.setGoup(student4);
       creator.setPhoneNumber(student4);
       Student student1 = new Student("Sergey", "Guzov", "Eugenevich", "+375295410981",
               Facultet.UPP, (byte) 5, "UA51","05","05","1993","Zhlobin","mn16","d8","kw36");
       Student student2 = new Student("Egor", "Paloika", "Mikalaevich", "+375294559981",
               Facultet.EF, (byte) 3, "UA51","27","11","2000","Minsk","Libknehta","d14","kw41");
       StudentsList list = new StudentsList();
       list.addStudent(student1);
       list.addStudent(student2);
       list.addStudent(student3);
       list.addStudent(student4);
       Filter filter = new Filter(list.getStudents());
       System.out.println(filter.studentsBirthday());
       System.out.println(filter.studentsOfFacultet());
       System.out.println(filter.studentsOfFacultetAndCource());
       System.out.println(filter.studentsGroup());

    }
}
