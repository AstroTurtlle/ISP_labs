package isp.lab3.exercise1;
import org.junit.Test;
import static org.junit.Assert.*;

public class TreeTest {
    @Test
    public void testGrow() {
        Tree tree1 = new Tree();
        tree1.grow(5);
        assertEquals(20, tree1.height);
    }
    @Test
    public void testToString() {
        Tree tree1 = new Tree();
        assertEquals("The height is 15", tree1.toString());
    }
}
