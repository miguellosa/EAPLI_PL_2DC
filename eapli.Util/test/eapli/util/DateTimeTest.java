/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author João Carreira
 */
public class DateTimeTest 
{
    private DateTime tester;
    
    public DateTimeTest() 
    {
        tester = new DateTime();
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        System.out.println("Before class");
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
        System.out.println("Tear down");
    }
    
    @Before
    public void setUp() 
    {
        System.out.println("Before test");
    }
    
    @After
    public void tearDown() 
    {
        System.out.println("After test");
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
     * Test of firstDateofWeek(int year, int week)
     */
    @Test
    public void testFirstDateOfWeek()
    {
        /* setting a date as week 1 of 2000 */
        Calendar date = new GregorianCalendar();
        date.clear();
        date = DateTime.firstDateOfWeek(2000, 1);
        /* test will verify if first date of week is January 1st */
        assertEquals(date.getFirstDayOfWeek(), 1);   
    }
    
}
