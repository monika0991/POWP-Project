package command;

@FunctionalInterface
public interface IBuildingOperation {
    void execute(int floorNumber);
}
