package substall;

import attraction.Visitors;
import attractionstall.Stall;
import park.ISecurity;

public class TobaccoStall extends Stall implements ISecurity ,IReviewed{
    public TobaccoStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedto(Visitors visitor) {
//        check minimum age  18 years for tobacco
        if(visitor.getAge()>= 18) {
            return true;
        }else{
            return false;
        }
    }
}
