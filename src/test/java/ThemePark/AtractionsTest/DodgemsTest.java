package ThemePark.AtractionsTest;

import ThemePark.Attractions.Dodgems;
import VisitorTest.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor1;

    @Before
    public void before(){
        dodgems = new Dodgems("Dodgems", 10);
        visitor1 = new Visitor(10,120,4.00);
    }

    @Test
    public void hasName(){
        assertEquals("Dodgems", dodgems.getName());
    }

    @Test
    public void canVisitAttraction(){
        assertEquals(true, dodgems.allowedToVisit(visitor1));
    }

    @Test
    public void hasRating(){
        assertEquals(10, dodgems.getRating());
    }
}
