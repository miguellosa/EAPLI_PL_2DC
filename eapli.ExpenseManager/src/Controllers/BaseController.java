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
    
    
    /**
     * shows the expenses of the current week
     */
    public BigDecimal showWeeklyExpenses()
    {
        /* new expense repository instance */
        IExpenseRepository rep = new ExpenseRepository();
        /* saves current year and month */
        int week = DateTime.currentWeekNumber();
        int year = DateTime.currentYear();
        /* variable to sum up all weekly expenses */
        BigDecimal weeklyExpense = new BigDecimal(0);
        /* cycles the entire repository */
        int i = 0;
        for(; i < rep.getAllExpenses().size(); i++)
        {
            /* filters only for the current week */
            if(rep.getAllExpenses().get(i).getExpenseYear() == year && rep.getAllExpenses().get(i).getExpenseWeek() == week)
            {
                /* adds item expense to weekly expense variable */
                weeklyExpense = weeklyExpense.add(rep.getAllExpenses().get(i).getAmount());
            }
        }
        /* returns weekly expense */
        return weeklyExpense;
    }
    
}
