package locations;

public class Skyscraper implements IBuilding {

    private Building building;

    private Skyscraper(Building building) {
        this.building = building;
    }

    // static factory method
    public static Skyscraper newSkyscraper() {
        Building building = Building.newBuilding(10, 8);
        Skyscraper skyscraper = new Skyscraper(building);
        return skyscraper;
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
    public void addFloor(Floor floor) {
        building.addFloor(floor);
    }

    @Override
    public void addRoom(int floorNumber) {
        building.addRoom(floorNumber);
    }

    @Override
    public Floor getFloor(int floorNumber) {
        return building.getFloor(floorNumber);
    }
}
