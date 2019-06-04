package park;

import attraction.Attraction;

public class Park extends Attraction implements IReviewed {
    public Park(String name, int rating) {
        super(name, rating);
    }
}
