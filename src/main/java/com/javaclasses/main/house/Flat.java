package com.javaclasses.main.house;

public class Flat {

    static private long q = 0;

    private long id;
    private double sqr;
    private int rooms;
    private int floor;
    private House house;


    Flat() {
        this.id = ++q;
    }

    Flat(double sqr, int rooms, int floor, House house) {
        this.sqr = sqr;
        this.rooms = rooms;
        this.floor = floor;
        this.house = house;
        this.id = ++q;
    }

    public double getSqr() {
        return sqr;
    }

    public int getRooms() {
        return rooms;
    }
    public long getId() {
        return id;
    }

    public int getFloor() {
        return floor;
    }

    public House getHouse() {
        return house;
    }

    public void setSqr(double sqr) {
        this.sqr = sqr;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "id=" + id +
                ", sqr=" + sqr +
                ", rooms=" + rooms +
                ", floor=" + floor +
                ", house=" + house +
                '}';
    }
}
