
package eapli.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class DateTimeTest {
    
    public DateTimeTest() {
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
     * Test of weekNumber(Calendar date), of class DateTime
     */
    @Test
    public void testWeekNumberDateTimeParameter()
    {
        /* setting a test date as 01-01-2001 as expected value */
        int testDate = DateTime.weekNumber(DateTime.newDate(2001, 1, 1));
        assertEquals(testDate, 1);
    }
    
    
    /**
     * Test of weekNumber(DateTime date), of claas DateTime
     */
    @Test
    public void testWeekNumberDateParameter()
    {
        /* setting a test date as 01-01-2001 as expected valueb */
        Date date = DateTime.newDate(2001, 1, 1);
        int testDate = DateTime.weekNumber(date);
        assertEquals(testDate, 1);
    }

    /**
     * Test of firstDateOfWeek method, of class DateTime.
     */
    @Test
    public void testFirstDateOfWeek() {
        
        int year = 2013;
        int week = 2;
        
        Calendar expResult = new GregorianCalendar();
        expResult.clear();
        expResult.set(Calendar.YEAR, year);
        expResult.set(Calendar.MONTH, 0);
        expResult.set(Calendar.DAY_OF_MONTH, 7);
        
        Calendar result = DateTime.firstDateOfWeek(year, week);
        
        assertEquals(expResult, result);

    }

    /**
     * Test of lastDateOfWeek method, of class DateTime.
     */
    @Test
    public void testLastDateOfWeek() {
        
        int year = 2013;
        int week = 19;
        
        Calendar expResult = new GregorianCalendar();
        expResult.clear();
        expResult.set(Calendar.YEAR, year);
        expResult.set(Calendar.MONTH, 4);
        expResult.set(Calendar.DAY_OF_MONTH, 12);
        
        Calendar result = DateTime.lastDateOfWeek(year, week);
        
        assertEquals(expResult, result);
        
    }

    

    /**
     * Test of newCalendarDate method, of class DateTime.
     */
    @Test
    public void testNewCalendarDate() {

        int year = 2012;
        int month = 2;
        int day = 3;
        
        Calendar expResult = new GregorianCalendar();
        expResult.clear();
        expResult.set(Calendar.YEAR, year);
        expResult.set(Calendar.MONTH, month-1);
        expResult.set(Calendar.DAY_OF_MONTH, day);
        
        Calendar result = DateTime.newCalendarDate(year, month, day);

        assertEquals(expResult, result);

    }

    /**
     * Test of newDate method, of class DateTime.
     */
    @Test
    public void testNewDate() {
        /*
        Date result = DateTime.newDate(2013, 0, 1);
        
        System.out.println("result:  "+result);
        

        int year = 2012;
        int month = 2;
        int day = 3;
        
        Calendar expResult = new GregorianCalendar();
        expResult.clear();
        expResult.set(Calendar.YEAR, year);
        expResult.set(Calendar.MONTH, month-1);
        expResult.set(Calendar.DAY_OF_MONTH, day);
        
        Date result = DateTime.newDate(year, month, day);

        System.out.println("exp "+expResult.getTime());
        System.out.println("res "+result);
        assertEquals(expResult.getTime(), result);
*/
   }

    /**
     * Test of parseDate method, of class DateTime.
     */
    @Test
    public void testParseDate_String_String() {
        /*
        System.out.println("parseDate");
        String aDateString = "";
        String format = "";
        Date expResult = null;
        Date result = DateTime.parseDate(aDateString, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        */
    }

   
}

