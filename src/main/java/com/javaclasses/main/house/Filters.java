package com.javaclasses.main.house;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filters {
    List<House> houses;
    List<Flat> allFlats;

    Filters (House ... houses) {
        this.houses = new ArrayList<>();
        this.allFlats = new ArrayList<>();
        this.houses.addAll(Arrays.asList(houses));
        for (House house:houses) this.allFlats.addAll(house.getFlats());
    }

    public List<Flat> roomFilter (int r) {
        List<Flat> filteredFlats = new ArrayList<>();
        for (Flat flat:allFlats) {
            if (flat.getRooms() == r) filteredFlats.add(flat);
        }
        if (filteredFlats.isEmpty()) throw new RuntimeException("No such flats found");
        else return filteredFlats;
    }
    public List<Flat> roomFloorFilter (int r, int f1, int f2) {
        List<Flat> filteredFlats = new ArrayList<>();
        for (Flat flat:allFlats) {
            if (flat.getRooms() == r && (flat.getFloor()>= f1 && flat.getFloor()<=f2)) filteredFlats.add(flat);
        }
        if (filteredFlats.isEmpty()) throw new RuntimeException("No such flats found");
        else return filteredFlats;
    }

    public List<Flat> sqrFilter (double sqr) {
        List<Flat> filteredFlats = new ArrayList<>();
        for (Flat flat : allFlats) {
            if (flat.getSqr() > sqr) filteredFlats.add(flat);
        }
        if (filteredFlats.isEmpty()) throw new RuntimeException("No such flats found");
        else return filteredFlats;
    }
}
