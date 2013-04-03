/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.*;
import Persistence.*;
import eapli.util.DateTime;
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
    
    
//    public BigDecimal getWeeklyExpenses()
//    {
//        /* saves the number of the current week */
//        int week = DateTime.weekNumber(DateTime.today());
//        /* saves the current year */
//        int year = DateTime.currentYear();
//        
//        /* creates new instance of ExpenseRepository and saves the all current week expense in a list */
//        IExpenseRepository rep = new ExpenseRepository();
//        
//    }
    
}
