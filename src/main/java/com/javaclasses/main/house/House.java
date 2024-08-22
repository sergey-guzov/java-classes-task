package com.javaclasses.main.house;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class House {
    static private long w = 0;
    private long id;
    private String address;
    private String type;
    private int floorNum;
    private int flatNum;
    private List<Flat> flats = new ArrayList<>();

    public House() {
        this.id = ++w;

    }

    public House(String address, String type, int floorNum, int flatNum) {
        this.address = address;
        this.type = type;
        this.floorNum = floorNum;
        this.flatNum = flatNum;
        this.id = ++w;
    }

    public String getAddress() {
        return address;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public long getId() {
        return id;
    }


    public int getFlatNum() {
        return flatNum;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public void setFlatNum(int flatNum) {
        this.flatNum = flatNum;
    }

    public void addFlats(Flat ... flats) {
        Collections.addAll(this.flats, flats);
    }

    @Override
    public String toString() {
        return "House{" +
                ", type='" + type + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
