package com.javaclasses.main.house;

public class HouseCreator {

    public House createHouseTemplate() {
        return new House();
    }

    public House createHouse (String address, String type, int floorNum, int flatNum) {
        return new House(address, type, floorNum, flatNum);
    }
}
