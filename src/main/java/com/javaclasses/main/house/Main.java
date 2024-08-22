package com.javaclasses.main.house;

public class Main {
    public static void main(String[] args) {
        HouseCreator houseCreator = new HouseCreator();
        FlatCreator flatCreator = new FlatCreator();
        House house1 = houseCreator.createHouse("Zhlobin", "panelka", 9, 108);
        House house2 = houseCreator.createHouse("Warsaw", "osedle", 4, 45);
        House house3 = houseCreator.createHouse("Minsk", "khruschevka",5 , 60);
        Flat flat11 = flatCreator.createFlat(69,3,5,house1);
        Flat flat21 = flatCreator.createFlat(40,1,8,house1);
        Flat flat31 = flatCreator.createFlat(70,4,9,house1);
        house1.addFlats(flat11,flat21,flat31);
        Flat flat12 = flatCreator.createFlat(45,2,1,house2);
        Flat flat22 = flatCreator.createFlat(31,1,4,house2);
        Flat flat32 = flatCreator.createFlat(71,3,3,house2);
        house2.addFlats(flat12,flat22,flat32);
        Flat flat13 = flatCreator.createFlat(75,3,2,house3);
        Flat flat23 = flatCreator.createFlat(24,1,5,house3);
        Flat flat33 = flatCreator.createFlat(40,2,5,house3);
        house3.addFlats(flat13,flat23,flat33);
        Filters filter = new Filters(house1,house2,house3);
        System.out.println(filter.roomFilter(1));
        System.out.println(filter.sqrFilter(69));
        System.out.println(filter.roomFloorFilter(3,3,5));

    }
}
