package ThemePark.Attractions;

import VisitorTest.Visitor;

public interface ISecurity {
    public boolean allowedToVisit(Visitor visitor);
}
