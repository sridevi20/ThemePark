package substall;


import attractionstall.Stall;

public class IceCreamStall extends Stall implements IReviewed{
    public IceCreamStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }
}
