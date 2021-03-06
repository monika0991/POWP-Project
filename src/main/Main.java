package main;

import command.AddRoomBuildingOperation;
import locations.*;

public class Main {

    public static void main(String[] args) {

        BuildingFactory factory = new BuildingFactory();
        IBuilding house = factory.create("house");
        IBuilding skyscraper = factory.create("skyscraper");
        System.out.println(house.opis());
        System.out.println(skyscraper.opis());

        // command pattern
        AddRoomBuildingOperation operation = new AddRoomBuildingOperation(skyscraper);
        operation.execute(3);

        System.out.println(skyscraper.opis());

        //	room1.relation(room2); // Por�wnanie dw�ch lokalizacji

    }

}
