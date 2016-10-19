/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jaume
 */
public class MyUtilsTest {
    
    public MyUtilsTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
            System.out.println("* UtilsJUnit3Test: setUp() method");
    }
    
    @After
    public void tearDown() {
         System.out.println("* UtilsJUnit3Test: tearDown() method");
    }

    /**
     * Test of inverteix method, of class MyUtils.
     */
    @Test
    public void testInverteix() {
        System.out.println("inverteix");
        String cadena = "";
        String expResult = "";
        String result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edat method, of class MyUtils.
     */
    @Test
    public void testEdat() {
        System.out.println("edat");
        int day = 19;
        int month = 10;
        int year = 2015;
        int expResult = 1;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class MyUtils.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        double numero = 0.0;
        double expResult = 0.0;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
