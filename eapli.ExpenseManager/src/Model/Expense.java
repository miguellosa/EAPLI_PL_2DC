/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.math.MathContext;
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
    
    public boolean compareyear(int y)
    {
        if(y==getExpenseYear())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean comparemonth(int m)
    {
        if(m==getExpenseMonth())
        {
            return true;
        }
        else
        {
            return false;
        }
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

     public ExpenseType getExptype() {
        return exptype;
    }
      
      
    public String toString(){
        return "Description: " + description+ " Amount "+amount+" Date: "+ dateOccurd + "Expense Type: " +exptype;
    }
    
     public String toStringXML(){
        return "\t\t<expense\n>"
                + "\t\t\t<description>"+description+"<\\description\n>"
                + "\t\t\t<date>"+dateOccurd+"<\\date\n>"
                + "\t\t\t<amount> "+amount+"<\\amount\n>"
                + "\t\t\t<type>"+exptype+"<\\type\n>"
                + "\t\t<\\expense>";
    }
     
     public String toStringCSV()
    {
        StringBuilder buffer = new StringBuilder();
        buffer.append(description);
        buffer.append(";");
        buffer.append(amount.floatValue());
        buffer.append(";");
        buffer.append(dateOccurd);
        buffer.append(";");
        buffer.append(exptype.getDescription());
        
      
        return buffer.toString();
       
    }

   
   
}
