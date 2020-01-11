package locations;

import factory.AbstractFactory;

public class BuildingFactory implements AbstractFactory<IBuilding> {

    @Override
    public IBuilding create(String buildingType) {
        if (buildingType.equals("skyscrapper")) {
            return Skyscraper.newSkyscraper();
        } else if (buildingType.equals("house")) {
            return House.newHouse();
        }
        return null;
    }
}
