package VisitorTest;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

        Visitor visitor;

        @Before
        public void setUp() {
            visitor = new Visitor(27, 162, 30.00);
        }

        @Test
        public void hasAge() {
            assertEquals(27, visitor.getAge());
        }

        @Test
        public void hasHeight() {
            assertEquals(162, visitor.getHeight());
        }

        @Test
        public void hasMoney() {
            assertEquals(30.00, visitor.getMoney(), 0.01);
        }



    }

