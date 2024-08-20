package com.javaclasses.main.student;
public class Main {
    public static void main(String[] args) {
/*       StudentCreator creator = new StudentCreator();
       Student student1 = creator.createStudenName();
       creator.addAddress(student1);
       creator.addBirthday(student1);
       creator.setFacultet(student1);
       creator.setCource(student1);
       creator.setGoup(student1);
       creator.setPhoneNumber(student1);
       System.out.println(student1.toString());
       Student student2 = creator.createStudenName();
       creator.addAddress(student2);
       creator.addBirthday(student2);
       creator.setFacultet(student2);
       creator.setCource(student2);
       creator.setGoup(student2);
       creator.setPhoneNumber(student2);*/
       Student student1 = new Student("Sergey", "Guzov", "Eugenevich", "+375295410981",
               Facultet.UPP, (byte) 5, "UA51","05","05","1993","Zhlobin","mn16","d8","kw36");
       Student student2 = new Student("Egor", "Paloika", "Mikalaevich", "+375294559981",
               Facultet.EF, (byte) 3, "UA51","27","11","2000","Minsk","Libknehta","d14","kw41");
       StudentsList list = new StudentsList();
       list.addStudent(student1);
       list.addStudent(student2);
       Filter filter = new Filter(list.getStudents());
       System.out.println(filter.studentsBirthday());
       System.out.println(filter.studentsOfFacultet());
       System.out.println(filter.studentsOfFacultetAndCource());
       System.out.println(filter.studentsGroup());

    }
}
