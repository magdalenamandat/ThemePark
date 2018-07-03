package ThemePark.Stalls;

import VisitorTest.Visitor;

public class TobaccoStall extends Stall {

    public TobaccoStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean allowedToVisit(Visitor visitor) {
        return visitor.getAge() >= 18;
    }
}
