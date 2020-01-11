package helper;

import locations.Building;
import locations.Floor;
import locations.Room;

public class BuildingHelper {

    private int counter = 0;

    public Building create(int numberOfFloors, int numberOfRooms) {
        counter++;
        Building building = new Building(counter);
        for (int i = 1; i <= numberOfFloors; i++) {
            Floor floor = new Floor(i);
            for (int j = 1; j <= numberOfRooms; j++) {
                Room room = new Room(j);
                floor.addRoom(room);
            }
            building.addFloor(floor);
        }

        return building;
    }

}
