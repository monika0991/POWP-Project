package locations;

public abstract class Location {
	protected LocationID locationID;

	public abstract String opis();

	public LocationID getID() {
		return locationID;
	}

	public void relation(Location somePlace) {
		LocationID id1 = somePlace.getID();
		int temp = id1.compareTo(this.locationID);
		String info = null;

		/* fragment pomocniczy kodu: */
		/*
		 * System.out.println(Integer.toString(id1.compareTo(this.locationID)));
		 * //podaje wynik porownania (liczbê dodatni¹,ujemn¹ lub zero)
		 */

		switch (temp) {
		case -3:
		case 3:
			info = "\nThis is the same building, the same floor, but a different room.";
			break;
		case -2:
		case 2:
			info = "\nThis is the same building, but a different floor.";
			break;
		case -1:
		case 1:
			info = "\nThis is a different building.";
			break;
		case 0:
			info = "\nThis is exactly the same place (room, floor and building).";
			break;
		default:
			System.out.println("No idea where we are.");
		}
		System.out.println(info);
	}

}
