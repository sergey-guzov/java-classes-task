package com.javaclasses.main.house;

public class FlatCreator {

    public Flat createFlatTemplate() {
        return new Flat();
    }

    public Flat createFlat (double sqr, int rooms, int floor, House house) {
        return new Flat(sqr,rooms,floor,house);
    }
}
