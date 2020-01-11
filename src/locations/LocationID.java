package locations;

public class LocationID implements Comparable<LocationID> {

    public int buildingNo = 0;
    private int floorNo = 0;
    private int roomNo = 0;

    public LocationID(LocationID locationID) {
        this.buildingNo = locationID.buildingNo;
        this.floorNo = locationID.floorNo;
        this.roomNo = locationID.roomNo;
    }

    public LocationID(int roomNo, int floorNo) {
        this.roomNo = roomNo;
        this.floorNo = floorNo;
    }

    public LocationID(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationID: ");
        if (this.buildingNo != 0) {
            sb.append("building -> " + this.buildingNo);
        }
        if (this.floorNo != 0) {
            sb.append(" floor -> " + this.floorNo);
        }
        if (this.roomNo != 0) {
            sb.append(" room -> " + this.roomNo);
        }
        return sb.toString();
        //return "LocationID: building " + this.buildingNo + " -> floor " + this.floorNo + " -> room " + this.roomNo;
    }

    @Override
    public int compareTo(LocationID locID) {
        if (this.buildingNo > locID.buildingNo) {
            return 1;
        }
        if (this.buildingNo < locID.buildingNo) {
            return -1;
        }
        if (this.floorNo > locID.floorNo) {
            return 2;
        }
        if (this.floorNo < locID.floorNo) {
            return -2;
        }
        if (this.roomNo > locID.roomNo) {
            return 3;
        }
        if (this.roomNo < locID.roomNo) {
            return -3;
        }
        return 0;
    }
}
