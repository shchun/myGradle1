package com.precipi.test;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.precipi.Calc;


public class CalcTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("After Class");
    }

    @Test
    public void testSum() {
        //fail("Not yet implemented");
        Calc c = new Calc();
        assertEquals(c.sum(1,2), 3);
        assertEquals(c.sum(2,2), 4);
        System.out.println("testSum()");
    }

    @Test
    public void testSum2() {
        //fail("Not yet implemented");
        Calc c = new Calc();
        assertEquals(c.sum(1,2), 3);
        assertEquals(c.sum(3,2), 5);
        System.out.println("testSum2()");
    }
}
