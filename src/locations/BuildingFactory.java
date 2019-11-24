package locations;

public class BuildingFactory {
	private int counter = 0;
	public Building create(int numberOfFloors, int numberOfRooms){
		counter++;
		Building building = new Building(counter);
		for (int i = 1; i<=numberOfFloors; i++){
			Floor floor = new Floor(i);
			for (int j = 1; j<=numberOfRooms; j++){
				Room room = new Room(j);
				floor.addRoom(room);
			}
			building.addFloor(floor);
		}

		return building;
	}


}
