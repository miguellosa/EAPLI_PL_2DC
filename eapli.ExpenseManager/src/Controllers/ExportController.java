/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.Income;
import Persistence.IIncomeRepository;
import Persistence.inmemory.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class ExportController {
    
    
    
    public List<Income> exportIncome(Date date1,Date date2){
        
        List<Income> incomes=new ArrayList();
        List<Income> returnlist=new ArrayList();
        IIncomeRepository repo = new IncomeRepository();
        incomes=repo.getAllIncomes();
        for(Income i:incomes){
            if(i.getIncomeDate().compareTo(date1)>0 && i.getIncomeDate().compareTo(date2)<0){
                returnlist.add(i);
            }
        }
        return returnlist;
    }
    
    public List<Expense> exportExpenses(Date datebegin, Date datend) {
        List<Expense> expenses = new ArrayList();
        List<Expense> expenseTemp = ExpenseRepository.getInstance().getAllExpenses();

        for (Expense e : expenses) {
            if (e.getDateOccurd().compareTo(datebegin) > 0 && e.getDateOccurd().compareTo(datend) < 0) {
                expenseTemp.add(e);
            }
        }
        return expenseTemp;
    }
}
