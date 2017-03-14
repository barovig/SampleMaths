/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author semargl
 */
public class SampleMathsTest {
    
    public SampleMathsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class SampleMaths.
     */
    @Test
    public void testAdd_passDoubles_returnsFour() {
        System.out.println("add");
        Number a = 2.5;
        Number b = 1.5;
        Class c = Double.class;
        SampleMaths instance = new SampleMaths();
        double expResult = 4.0;
        double result = instance.add(a, b, c);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testAdd_notNumericClassParameter_returnsNaN() {
        System.out.println("add");
        Number a = 2.5;
        Number b = 1.5;
        Class c = String.class;
        SampleMaths instance = new SampleMaths();
        double expResult = Double.NaN;
        double result = instance.add(a, b, c);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAdd_sampleFailingTest() {
        System.out.println("add");
        Number a = 2.5;
        Number b = 1.5;
        Class c = Double.class;
        SampleMaths instance = new SampleMaths();
        double expResult = 100.0;
        double result = instance.add(a, b, c);
        assertEquals(expResult, result, 0.0);
    }
    
}
