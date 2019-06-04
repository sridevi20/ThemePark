package park;

import attraction.Attraction;
import attraction.ITicketed;
import attraction.Visitors;

public class PlayGround extends Attraction implements ISecurity,IReviewed {


    public PlayGround(String name, int rating) {
        super(name, rating);


    }

    public boolean isAllowedto(Visitors visitor) {
        if (visitor.getAge() <= 15) {
            return true;
        } else
            return false;
    }



}
