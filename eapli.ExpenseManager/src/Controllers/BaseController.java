/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.*;
import Persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author i100596 
 * @author i100570
 */
public class BaseController {
    
    public BaseController(){
    }
    
    public BigDecimal getMonthlyExpenses(int month, int year){
        
        List<Expense> listExpense;
        BigDecimal sum;
        
        ExpenseRepository expRep = new ExpenseRepository();
        listExpense = expRep.getExpenses(month, year);
        
        ExpenseRecord expRec = new ExpenseRecord();
        
        sum = expRec.getSumExpenses(listExpense);
        
        return sum;
    }
    
}
