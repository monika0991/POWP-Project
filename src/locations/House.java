package locations;

import helper.BuildingHelper;

public class House implements IBuilding {

    private Building building;

    private House(Building building) {
        this.building = building;
    }

    public static House newHouse() {
        Building building = Building.newBuilding(1, 5);
        House house = new House(building);
        return house;
    }

    @Override
    public String opis() {
        return building.opis();
    }

    @Override
    public int getNumber() {
        return building.getNumber();
    }

    @Override
    public Floor getFloor(int floorNumber) {
        return building.getFloor(floorNumber);
    }

    @Override
    public void addFloor(Floor floor) {
        building.addFloor(floor);
    }
    @Override
    public void addRoom(int floorNumber) {
        building.addRoom(floorNumber);
    }
}