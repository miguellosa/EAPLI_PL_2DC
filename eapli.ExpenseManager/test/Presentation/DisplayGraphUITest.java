/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author André
 */
public class DisplayGraphUITest {
    
    public DisplayGraphUITest() {
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
     * Test of maxSum method, of class DisplayGraphUI.
     */
    @Test
    public void testMaxSum() {
        System.out.println("maxSum");
        List<BigDecimal> sums = new ArrayList<BigDecimal>();
        sums.add(new BigDecimal(5));
        sums.add(new BigDecimal(15));
        sums.add(new BigDecimal(25));
        sums.add(new BigDecimal(35));
        BigDecimal expResult = new BigDecimal(35);
        DisplayGraphUI instance = new DisplayGraphUI();
        BigDecimal result = instance.maxSum(sums);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createLine method, of class DisplayGraphUI.
     */
    @Test
    public void testCreateLine() {
        System.out.println("createLine");
        BigDecimal coef = new BigDecimal(10);
        BigDecimal sum = new BigDecimal(100);
        DisplayGraphUI instance = new DisplayGraphUI();
        String expResult = "**********";
        String result = instance.createLine(coef, sum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}