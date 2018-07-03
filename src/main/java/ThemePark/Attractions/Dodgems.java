package ThemePark.Attractions;

import VisitorTest.Visitor;

public class Dodgems extends Attraction implements ISecurity {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public boolean allowedToVisit(Visitor visitor) {
        return visitor.getAge() <= 15;
    }
}
