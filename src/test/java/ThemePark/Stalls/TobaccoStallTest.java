package ThemePark.Stalls;

import VisitorTest.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Fresh Air", "Lucy Specter", "2A", 3);
        visitor1 = new Visitor(21, 170, 40.00);
    }

    @Test
    public void hasName(){
        assertEquals("Fresh air", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Lucy Specter", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("2A", tobaccoStall.getParkingSpot());
    }

    @Test
    public void canVisitStall(){
        assertEquals(true, tobaccoStall.allowedToVisit(visitor1));
    }

    @Test
    public void hasRating(){
        assertEquals(3, tobaccoStall.getRating());
    }
}