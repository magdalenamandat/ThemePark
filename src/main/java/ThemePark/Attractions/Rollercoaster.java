package ThemePark.Attractions;

import VisitorTest.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedToVisit(Visitor visitor) {
        return visitor.getHeight() >= 145 && visitor.getAge() >= 12;
    }

    @Override
    public boolean allowedToVisit(Visitor visitor) {
        return false;
    }
}
