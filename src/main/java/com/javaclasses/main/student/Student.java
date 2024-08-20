package com.javaclasses.main.student;
import java.util.UUID;

public class Student {
    private UUID id;
    private String firstName;
    private String secondName;
    private String surName;
    private String phoneNumber;
    private Facultet facultet;
    private byte cource;
    private String group;
    private Adress adress;
    private Birthday birthday;

    public Student(String firstName, String secondName, String surName, String phoneNumber, Facultet facultet, byte cource, String group,
                   String day, String month, String year, String city, String street, String house, String appartments ) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.secondName = secondName;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
        this.facultet = facultet;
        this.cource = cource;
        this.group = group;
        this.adress = new Adress(city,street,house,appartments);
        this.birthday = new Birthday(day,month,year);
    }

    public Student(String firstName, String secondName, String surName) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.secondName = secondName;
        this.surName = surName;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFacultet(Facultet facultet) {
        this.facultet = facultet;
    }

    public void setCource(byte cource) {
        this.cource = cource;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Adress getAdress() {
        return adress;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Facultet getFacultet() {
        return facultet;
    }

    public byte getCource() {
        return cource;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surName='" + surName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", facultet=" + facultet +
                ", cource=" + cource +
                ", group='" + group + '\'' +
                ", " + birthday + '\'' +
                ", " + adress + '\'' +
                '}';
    }

    class Birthday{

        private String day;
        private String month;
        private String year;

        public Birthday(String day, String month, String year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public String getDay() {
            return day;
        }

        public String getMonth() {
            return month;
        }

        public String getYear() {
            return year;
        }

        public Birthday() {
        }

        @Override
        public String toString() {
            return "birthday = '{" +
                    "day=" + day +
                    ", month=" + month +
                    ", year=" + year +
                    '}';
        }

    }
    class Adress{
        private String city;
        private String street;
        private String house;
        private String appartments;

        public Adress(String city, String street, String house, String appartments) {
            this.city = city;
            this.street = street;
            this.house = house;
            this.appartments = appartments;
        }

        public Adress() {
        }

        @Override
        public String toString() {
            return "address = '{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", house='" + house + '\'' +
                    ", appartments='" + appartments + '\'' +
                    '}';
        }
    }


}
