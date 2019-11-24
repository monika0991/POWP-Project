package locations;

public class Room extends Location {
	private int number;

	public Room(int number) {
		this.number = number;
		locationID = new LocationID(number);
	}

	public void setFloor(LocationID floor) {
		locationID = new LocationID(floor);
		locationID.setRoomNo(number);
	}

	@Override
	public String opis() {
		/*StringBuilder sB = new StringBuilder();
		sB.append(" Floor number: " + number + "\t[" + locationID + "]\n");
		for (Room room : rooms) {
			sB.append(room.opis());
		}
		return sB.toString();*/


		return "    Room number: " + number + "\t[" + locationID + "]\n";
	}

}
