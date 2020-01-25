// package Labs.Lab2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Lab1Tester
{
    @Test
    public void test() {
        JunitTesting test = new JunitTesting();
        int output = test.square(5);
        assertEquals(25,output);        
    }
}
