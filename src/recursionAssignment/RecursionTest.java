package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    /**
     * An initial test
     */
    @Test
    public void Test1() {
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(1, Recursion.count7(7));
    }
    @Test
    public void Test2() {
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(2, Recursion.count7(717));
    }
    @Test
    public void Test3() {
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(0, Recursion.count7(123));
    }
    @Test
    public void Test4() {
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals("x3.14x", Recursion.changePi("xpix"));
    }
    @Test
    public void Test5() {
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals("3.143.14", Recursion.changePi("pipi"));
    }
    @Test
    public void Test6() {
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals("3.14p", Recursion.changePi("pip"));
    }
    @Test
    public void Test7() {
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals("yza", Recursion.stringClean("yyzzza"));
    }
    
    // add more tests
    
    
}
