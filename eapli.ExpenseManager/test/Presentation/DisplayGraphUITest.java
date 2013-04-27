package Presentation;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.*;

import org.junit.*;

/**
 * Class that will test the class DisplayGraphUI in Presentation package of
 * project
 * 
 * @author André Silva 1100859
 * @author Tiago Pacheco 1110333
 * @version 1.0
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
     * 
     * @author André Silva 1100859
     * @author Tiago Pacheco 1110333
     * @version 1.0
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
    }

    /**
     * Test of createLine method, of class DisplayGraphUI.
     * 
     * @author André Silva 1100859
     * @author Tiago Pacheco 1110333
     * @version 1.0
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
    }
}