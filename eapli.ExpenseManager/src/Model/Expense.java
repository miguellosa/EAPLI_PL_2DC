/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;


/**
 *
 * @author Paulo Gandra Sousa
 */

public class Expense {
    
    String description;
   
    BigDecimal amount;
    
    PaymentMethod payMethod;
    
    ExpenseType expType;
    
    protected Expense() {}
    
    public Expense( String description, Date dateOccurred, BigDecimal amount, PaymentMethod payMethod, ExpenseType expType) {
        if (description == null || dateOccurred == null || amount == null || payMethod == null || expType == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() ==  0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
    }
    
    public Expense( String description, int year, int month, int day, BigDecimal amount, PaymentMethod payMethod, ExpenseType expType) {
        this( description, DateTime.newDate(year, month, day), amount, payMethod, expType);
    }
    
    public BigDecimal getAmount() {
        return amount;
    }

   
}
