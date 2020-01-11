package command;

import locations.IBuilding;

public class AddRoomBuildingOperation implements IBuildingOperation {

    private IBuilding building;

    public AddRoomBuildingOperation(IBuilding building) {
        this.building = building;
    }

    @Override
    public void execute(int floor) {
        System.out.println("Dodaje pokoj do pietra: " + floor);
        building.addRoom(floor - 1);
    }
}
