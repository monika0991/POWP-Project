package locations;

public interface IBuilding {
    int getNumber();

    Floor getFloor(int floorNumber);

    void addFloor(Floor floor);

    void addRoom(int floorNumber);

    String opis();
}
