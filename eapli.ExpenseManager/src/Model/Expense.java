/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;
public class Expense {
    
    private String description;
    private Date dateOccurd;
    BigDecimal amount;
    private ExpenseType exptype;
    
    
    PaymentMethod payMeth;
    
    
    protected Expense() {}
    

    
   public Expense( String description, Date dateOccurred, BigDecimal amount, ExpenseType expType, PaymentMethod payMeth) {

        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() ==  0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
        this.dateOccurd= dateOccurred;
        this.exptype=expType;
        this.payMeth=payMeth;
    }
    


    public Expense( String description, int year, int month, int day, BigDecimal amount, ExpenseType exptype, PaymentMethod payMeth) {
        this( description, DateTime.newDate(year, month, day), amount,exptype, payMeth);

    }
    
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    
    /**
     * getExpenseWeek
     * @return week number (ranging 1-52)
     */
    public int getExpenseWeek()
    {
        return DateTime.weekNumber(DateTime.dateToCalendar(dateOccurd));
    }
    
    
    /**
     * @return the month of an expense
     */
    public int getExpenseMonth() {
        return DateTime.Month(DateTime.dateToCalendar(dateOccurd));
        
    }
      public int getExpenseYear() {
        return DateTime.Year(DateTime.dateToCalendar(dateOccurd));
    }

      
      
    public Date getDateOccurd() {
        return dateOccurd;
    }

      
      
    public String toString(){
        return "Description: " + description+ " Amount "+amount+" Date: "+ dateOccurd;
    }
    
     public String toStringXML(){
        return "<expense\n>"
                + " <description>"+description+"<\\description\n>"
                + " <date>"+dateOccurd+"<\\date\n>"
                + " <amount> "+amount+"<\\amount\n>"
                + " <type>"+exptype+"<\\type\n>"
                + "<\\expense>";
    }

    public ExpenseType getExptype() {
        return exptype;
    }
   
}
