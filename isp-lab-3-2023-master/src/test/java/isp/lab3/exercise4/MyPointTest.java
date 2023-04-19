package isp.lab3.exercise4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyPointTest {
    @Test
    public void testDistance() {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(2,1,2);
        assertEquals(3, point1.distance(point2), 0);
        assertEquals(3, point1.distance(2,2,1), 0);
    }
}
