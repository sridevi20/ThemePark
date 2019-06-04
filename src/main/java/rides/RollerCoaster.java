package rides;

import attraction.Attraction;
import attraction.Visitors;
import park.ISecurity;

public class RollerCoaster extends Attraction implements ISecurity, IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);

    }

    public boolean isAllowedto(Visitors visitor) {
        if (visitor.getHeight() >= 145)&&(visitor.getAge() > 12){
            return true;
        }
        else{
            return false;
        }

    }
}

