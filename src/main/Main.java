package main;

import locations.*;

public class Main {

	public static void main(String[] args) {
		/*Building budynek1 = new Building(1);
		Building budynek2 = new Building(2);
		Floor floor1 = new Floor(1);
		Floor floor2 = new Floor(2);
		Floor floor3 = new Floor(3);
		Floor floor4 = new Floor(4);
		Floor floor5 = new Floor(5);
		Room room1 = new Room(1);
		Room room2 = new Room(2);
		Room room3 = new Room(3);
		Room room4 = new Room(4);
		Room room5 = new Room(5);
		Room room6 = new Room(6);
		Room room7 = new Room(7);
		Room room8 = new Room(8);*/

	/*	budynek1.addFloor(floor1);
		budynek1.addFloor(floor2);
		budynek1.addFloor(floor3);
		budynek2.addFloor(floor4);
		budynek2.addFloor(floor5);
		floor1.addRoom(room1);
		floor1.addRoom(room2);
		floor1.addRoom(room3);
		floor1.addRoom(room4);
		floor2.addRoom(room5);
		floor4.addRoom(room6);
		floor4.addRoom(room7);
		floor5.addRoom(room8);*/

		/*System.out.println(budynek1.opis());
		System.out.println(budynek2.opis());*/

		BuildingFactory factory = new BuildingFactory();
		Building building1 = factory.create(4, 3);
		System.out.println(building1.opis());
	//	room1.relation(room2); // Porównanie dwóch lokalizacji

	}

}
