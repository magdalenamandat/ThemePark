package ThemePark.AtractionsTest;

import ThemePark.Attractions.Attraction;
import ThemePark.Attractions.Rollercoaster;
import VisitorTest.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RollercoasterTest extends Attraction {

    Rollercoaster rollercoaster;
    Visitor visitor1;
    Visitor visitor2;

    public RollercoasterTest(String name, int rating) {
        super(name, rating);
    }

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Rapid Rollercoaster", 9);
        visitor1 = new Visitor(14, 150,10);
        visitor2 = new Visitor(14, 130, 5);
    }

    @Test
    public void hasName(){
        assertEquals("Rapid Rollercoaster", rollercoaster.getName());
    }

    @Test
    public void canRide(){
        assertEquals(true, rollercoaster.isAllowedToVisit(visitor1));
    }

    @Test
    public void cannotRide(){
        assertEquals(false, rollercoaster.isAllowedToVisit(visitor2));
    }

    @Test
    public void hasRating(){
        assertEquals(9, rollercoaster.getRating());
    }
}