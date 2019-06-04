package attractionstall;


public class Stall  implements IReviewed{
    private String name;
    private String ownerName;
    private String parkingSpot;
    private int rating;
    Stall stall;

    public Stall(){

    }

    public Stall(String name, String ownerName,String parkingSpot,int rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public int getRating() {
        return rating;
    }
}
