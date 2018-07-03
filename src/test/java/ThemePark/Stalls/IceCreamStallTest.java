package ThemePark.Stalls;

import ThemePark.Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Super Ice Cream", "Mark Owen ", "1A", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Super Ice Cream", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Mark Owen", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("1A", iceCreamStall.getParkingSpot());
    }

    @Test
    public void hasRating(){
        assertEquals(10, iceCreamStall.getRating());
    }

}