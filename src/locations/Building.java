package locations;

import helper.BuildingHelper;

import java.util.ArrayList;

public class Building extends Location implements IBuilding {
    private int numberB;
    private ArrayList<Floor> floors;
    private static BuildingHelper helper = new BuildingHelper();

    public Building() {
    }

    public static Building newBuilding(int numberOfFloors, int numberOfRooms) {
        return helper.create(numberOfFloors, numberOfRooms);
    }

    public Building(int number1) {
        this.numberB = number1;
        locationID = new LocationID(numberB);
        locationID.setBuildingNo(numberB);
        floors = new ArrayList<Floor>();
    }

    @Override
    public int getNumber() {
        return numberB;
    }

    @Override
    public void addFloor(Floor floor) {
        floor.setBuilding(locationID);
        locationID.setBuildingNo(numberB);
        floors.add(floor);
    }

    @Override
    public String opis() {
        StringBuilder sB = new StringBuilder();
        sB.append("Building number: " + this.getNumber() + "\t[" + locationID + "]\n");
        for (Floor floor : floors) {
            sB.append(floor.opis());
        }
        return sB.toString();
    }

}
